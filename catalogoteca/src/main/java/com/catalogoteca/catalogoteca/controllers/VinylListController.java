package com.catalogoteca.catalogoteca.controllers;

import com.catalogoteca.catalogoteca.dto.VinylListDTO;
import com.catalogoteca.catalogoteca.services.VinylListService;
import com.catalogoteca.catalogoteca.services.VinylService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class VinylListController {

    @Autowired
    private VinylListService vinylListService;

    @Autowired
    private VinylService vinylService;

    @GetMapping
    public List<VinylListDTO> findAll() {
        List<VinylListDTO> result = vinylListService.findAll();
        return result;
    }

}
