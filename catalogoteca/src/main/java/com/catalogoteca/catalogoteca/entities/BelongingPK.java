package com.catalogoteca.catalogoteca.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "vinyl_id")
    private Vinyl vinyl;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private VinylList list;

    public BelongingPK() {
    }

    public BelongingPK(Vinyl vinyl, VinylList list) {
        this.vinyl = vinyl;
        this.list = list;
    }

    public Vinyl getVinyl() {
        return vinyl;
    }

    public void setVinyl(Vinyl vinyl) {
        this.vinyl = vinyl;
    }

    public VinylList getList() {
        return list;
    }

    public void setList(VinylList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BelongingPK other = (BelongingPK) obj;
        return Objects.equals(vinyl, other.vinyl) && Objects.equals(list, other.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinyl, list);
    }
}
