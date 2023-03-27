package springFrameworkSpringBoot.services;



import springFrameworkSpringBoot.Model.BeerDTO;
import springFrameworkSpringBoot.Model.BeerStyle;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @Created 17 03 2023 - 5:00 PM
 * @Author Hazeem Hassan
 */
public interface BeerService {
    List<BeerDTO> listBeers(String beerName, BeerStyle beerStyle);

    Optional<BeerDTO> getBeerById(UUID id);

    BeerDTO saveNewBeer(BeerDTO beer);

    Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beer);

    Boolean deleteById(UUID beerId);

    Optional<BeerDTO> patchBeerById(UUID beerId, BeerDTO beer);
}
