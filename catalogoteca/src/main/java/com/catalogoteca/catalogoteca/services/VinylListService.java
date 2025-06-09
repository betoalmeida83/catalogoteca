package com.catalogoteca.catalogoteca.services;

import com.catalogoteca.catalogoteca.dto.VinylListDTO;
import com.catalogoteca.catalogoteca.entities.VinylList;
import com.catalogoteca.catalogoteca.repositories.VinylListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VinylListService {

    @Autowired
    private VinylListRepository vinylListRepository;

    @Transactional(readOnly = true)
    public List<VinylListDTO> findAll() {
        List<VinylList> result = vinylListRepository.findAll();
        return result.stream().map(x -> new VinylListDTO(x)).toList();
    }

}
