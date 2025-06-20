package com.catalogoteca.catalogoteca.controllers;

import com.catalogoteca.catalogoteca.dto.VinylDTO;
import com.catalogoteca.catalogoteca.dto.VinylMinDTO;
import com.catalogoteca.catalogoteca.services.VinylService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vinyls")
public class VinylController {

    @Autowired
    private VinylService vinylService;

    @GetMapping(value = "/{id}")
    public VinylDTO findById(@PathVariable Long id) {
        VinylDTO result = vinylService.findById(id);
        return result;
    }

    @GetMapping
    public List<VinylMinDTO> findAll() {
        List<VinylMinDTO> result = vinylService.findAll();
        return result;
    }
}
