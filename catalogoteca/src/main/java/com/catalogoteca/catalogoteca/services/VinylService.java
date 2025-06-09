package com.catalogoteca.catalogoteca.services;

import com.catalogoteca.catalogoteca.dto.VinylDTO;
import com.catalogoteca.catalogoteca.dto.VinylMinDTO;
import com.catalogoteca.catalogoteca.entities.Vinyl;
import com.catalogoteca.catalogoteca.repositories.VinylRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VinylService {

    @Autowired
    private VinylRepository vinylRepository;

    @Transactional(readOnly = true)
    public VinylDTO findById(Long id) {
        Vinyl result = vinylRepository.findById(id).get();
        return new VinylDTO(result);
    }

    @Transactional(readOnly = true)
    public List<VinylMinDTO> findAll() {
        List<Vinyl> result = vinylRepository.findAll();
        return result.stream().map(x -> new VinylMinDTO(x)).toList();
    }
}
