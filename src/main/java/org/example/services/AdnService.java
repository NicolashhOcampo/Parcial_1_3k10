package org.example.services;

import org.example.entities.Adn;
import org.example.entities.dto.StatsDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AdnService extends BaseService<Adn,Long>{
    Adn saveAdn(List<String> adn) throws Exception;
    Optional<Adn> findByAdnValue(@Param("adnValue") String adnValue) throws Exception;
    StatsDto getStats() throws Exception;

}
