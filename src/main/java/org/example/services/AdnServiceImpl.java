package org.example.services;

import org.example.entities.Adn;
import org.example.entities.Analizador;
import org.example.entities.dto.StatsDto;
import org.example.repositories.AdnRepository;
import org.example.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdnServiceImpl extends BaseServiceImpl<Adn, Long> implements AdnService {

    @Autowired
    private AdnRepository adnRepository;

    public AdnServiceImpl(BaseRepository<Adn, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public Adn saveAdn(List<String> adn) throws Exception {
        try{
            Analizador analizador= new Analizador();
            Adn a= new Adn();
            a.setAdnList(adn);
            a.setMutant(analizador.isMutant(adn));
            return adnRepository.save(a);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public Optional<Adn> findByAdnValue(String adnValue) throws Exception {

        try{
            return adnRepository.findByAdnValue(adnValue);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public StatsDto getStats() {
        List<Object[]> result = adnRepository.countMutantsAndHumans();

        long countMutants = ((Number) result.get(0)[0]).longValue();
        long countHumans = ((Number) result.get(0)[1]).longValue();

        double ratio = (countHumans == 0) ? 0 : (double) countMutants / countHumans;

        return new StatsDto(countMutants, countHumans, ratio);
    }


    /*
    @Override
    public Object[] countMutantsAndHumans() {
        try{
            return adnRepository.count();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

     */


}
