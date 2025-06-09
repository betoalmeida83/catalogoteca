package com.catalogoteca.catalogoteca.repositories;

import com.catalogoteca.catalogoteca.entities.Vinyl;
import com.catalogoteca.catalogoteca.projections.VinylMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VinylRepository extends JpaRepository<Vinyl, Long> {

    @Query(nativeQuery = true, value = """
		SELECT tb_vinyl.id, tb_vinyl.title, tb_vinyl.artist, tb_vinyl.img_url AS imgUrl,
		tb_belonging.position
		FROM tb_vinyl
		INNER JOIN tb_belonging ON tb_vinyl.id = tb_belonging.vinyl_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<VinylMinProjection> searchByList(Long listId);

}
