package com.dh.catalog.repository;

import com.dh.catalog.entity.Serie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("serie-service")
public interface FeignSerie {
    @GetMapping("/series/{genre}")
    List<Serie> listByGenre(@PathVariable("genre") String genre );
}
