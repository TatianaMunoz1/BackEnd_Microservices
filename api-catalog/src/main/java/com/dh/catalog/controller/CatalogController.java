package com.dh.catalogservice.controller;

import com.dh.catalogservice.entity.Pattern;
import com.dh.catalogservice.service.CatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public record CatalogController(CatalogService catalogService) {

    @GetMapping("{genre}")
    public List<? extends Pattern> catalogByGenre(@PathVariable("genre") String genre){
        return catalogService.getCatalogByGenre(genre);
    }
}
