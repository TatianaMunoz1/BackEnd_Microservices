package com.dh.catalog.service;


import com.dh.catalog.entity.Pattern;
import com.dh.catalog.entity.Serie;

import java.util.List;

public interface CatalogService {
    List<? extends Pattern> getCatalogByGenre(String genre);
    void saveNewMedia(Serie obj);
}
