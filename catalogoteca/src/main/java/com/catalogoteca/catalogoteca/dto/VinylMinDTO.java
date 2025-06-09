package com.catalogoteca.catalogoteca.dto;

import com.catalogoteca.catalogoteca.entities.Vinyl;
import com.catalogoteca.catalogoteca.projections.VinylMinProjection;


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

    public VinylMinDTO(VinylMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        artist = projection.getArtist();
        imgUrl = projection.getImgUrl();
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
