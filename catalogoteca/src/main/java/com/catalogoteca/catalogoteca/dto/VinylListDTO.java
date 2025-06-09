package com.catalogoteca.catalogoteca.dto;

import com.catalogoteca.catalogoteca.entities.VinylList;

public class VinylListDTO {

    private Long id;
    private String name;

    public VinylListDTO() {
    }

    public VinylListDTO(VinylList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
