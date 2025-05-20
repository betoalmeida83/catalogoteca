package com.catalogoteca.catalogoteca.repositories;

import com.catalogoteca.catalogoteca.entities.Vinyl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VinylRepository extends JpaRepository<Vinyl, Long> {
}
