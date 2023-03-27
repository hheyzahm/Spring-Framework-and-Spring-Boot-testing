package springFrameworkSpringBoot.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import springFrameworkSpringBoot.Model.BeerStyle;
import springFrameworkSpringBoot.entities.BeerEntity;

import java.awt.print.Pageable;
import java.util.UUID;

/**
 * @Created 20 03 2023 - 11:26 AM
 * @Author Hazeem Hassan
 */
public interface BeerRepository extends JpaRepository<BeerEntity, UUID> {

    Page<BeerEntity> findAllByBeerNameIsLikeIgnoreCase(String beerName, Pageable pageable);

    Page<BeerEntity> findAllByBeerStyle(BeerStyle beerStyle, Pageable pageable);

    Page<BeerEntity> findAllByBeerNameIsLikeIgnoreCaseAndBeerStyle(String beerName, BeerStyle beerStyle, Pageable pageable);
}
