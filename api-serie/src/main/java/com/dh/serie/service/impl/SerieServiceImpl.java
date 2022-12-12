package com.dh.serie.service.impl;

import com.dh.serie.entity.Serie;
import com.dh.serie.repository.SerieRepository;
import com.dh.serie.service.SerieService;
import com.dh.serieservice.amqp.RabbitMQMessageProducer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record SerieServiceImpl(SerieRepository serieRepository, RabbitMQMessageProducer rabbitMQMessageProducer) implements SerieService {

    @Override
    public List<Serie> getListByGenre(String genre) {
        return serieRepository.findAllByGenre(genre);
    }

    @Override
    public void saveNewSerie(Serie serie) {
        serieRepository.save(serie);
        //TODO send notification to RabbitMQ
        rabbitMQMessageProducer.publish(
                serie,
                "internal.exchange",
                "internal.notification.routing-key"
        );
    }
}
