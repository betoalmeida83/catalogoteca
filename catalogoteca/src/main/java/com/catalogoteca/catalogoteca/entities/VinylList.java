package com.catalogoteca.catalogoteca.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_vinyl_list")
public class VinylList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // CONSTRUCTORS
    public VinylList() {
    }

    public VinylList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // GETTERS AND SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        VinylList other = (VinylList) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
