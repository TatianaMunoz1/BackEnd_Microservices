package com.dh.serie.service;

import com.dh.serie.entity.Serie;


import java.util.List;

public interface SerieService {
    List<Serie> getListByGenre(String genre);

    void saveNewSerie(Serie serie);
}
