package springFrameworkSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springFrameworkSpringBoot.entities.BeerEntity;

import java.util.UUID;

/**
 * @Created 20 03 2023 - 11:26 AM
 * @Author Hazeem Hassan
 */
public interface BeerRepository extends JpaRepository<BeerEntity, UUID> {
}
