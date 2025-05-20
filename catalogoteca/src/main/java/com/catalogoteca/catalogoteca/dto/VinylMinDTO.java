package com.catalogoteca.catalogoteca.dto;

import com.catalogoteca.catalogoteca.entities.Vinyl;

public class VinylMinDTO {

    private Long id;
    private String title;
    private String artist;
    private Integer releaseYear;
    private String format;
    private String imgUrl;

    public VinylMinDTO() {
    }

    public VinylMinDTO(Vinyl entity) {
        id = entity.getId();
        title = entity.getTitle();
        artist = entity.getArtist();
        releaseYear = entity.getReleaseYear();
        format = entity.getFormat();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getFormat() {
        return format;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
