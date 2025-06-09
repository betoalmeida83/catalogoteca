package com.catalogoteca.catalogoteca.dto;

import com.catalogoteca.catalogoteca.entities.Vinyl;
import jakarta.servlet.http.PushBuilder;

public class VinylMinDTO {

    private Long id;
    private String title;
    private String artist;
    private String imgUrl;

    // CONSTRUCTORS
    public VinylMinDTO() {
    }

    public VinylMinDTO(Vinyl entity) {
        id = entity.getId();
        title = entity.getTitle();
        artist = entity.getArtist();
        imgUrl = entity.getImgUrl();
    }

    // GETTERS
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getImgUrl() {
        return imgUrl;
    }

}
