package springFrameworkSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springFrameworkSpringBoot.Model.BeerStyle;
import springFrameworkSpringBoot.entities.BeerEntity;

import java.util.List;
import java.util.UUID;

/**
 * @Created 20 03 2023 - 11:26 AM
 * @Author Hazeem Hassan
 */
public interface BeerRepository extends JpaRepository<BeerEntity, UUID> {

List<BeerEntity> findAllByBeerNameIsLikeIgnoreCase(String beerName);
    List<BeerEntity> findAllByBeerStyle(BeerStyle beerStyle);

}
