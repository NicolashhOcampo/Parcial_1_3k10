package org.example.repositories;

import org.example.entities.Adn;
import org.example.entities.dto.StatsDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdnRepository extends BaseRepository<Adn, Long>{

   @Query("SELECT a FROM Adn a WHERE a.adnList LIKE %:adnValue%")
   Optional<Adn> findByAdnValue(@Param("adnValue") String adnValue);

   @Query("SELECT SUM(CASE WHEN a.isMutant = true THEN 1 ELSE 0 END), SUM(CASE WHEN a.isMutant = false THEN 1 ELSE 0 END) FROM Adn a")
   List<Object[]> countMutantsAndHumans();




}
