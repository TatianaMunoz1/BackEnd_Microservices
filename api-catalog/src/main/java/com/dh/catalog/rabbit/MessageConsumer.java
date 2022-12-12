package com.dh.catalog.rabbit;

import com.dh.catalog.entity.Pattern;
import com.dh.catalog.entity.Serie;
import com.dh.catalog.service.CatalogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public record MessageConsumer(CatalogService catalogService) {
    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumer(Serie mediaItem){
        log.info("Consumed {} from queue", mediaItem);
        catalogService.saveNewMedia(mediaItem);
    }
}
