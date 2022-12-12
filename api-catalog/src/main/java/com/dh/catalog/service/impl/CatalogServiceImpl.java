package com.dh.catalog.rabbit;

import com.dh.catalog.entity.Pattern;
import com.dh.catalog.entity.Serie;
import com.dh.catalog.repository.CatalogRepository;
import com.dh.catalog.repository.FeignSerie;
import com.dh.catalog.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CatalogServiceImpl(FeignSerie feignSerie, CatalogRepository catalogRepository) implements CatalogService {

    @Override
    public List<? extends Pattern> getCatalogByGenre(String genre) {
        return feignSerie.listByGenre(genre);
    }

    @Override
    public void saveNewMedia(Serie obj) {
        catalogRepository.save(obj);
    }
}
