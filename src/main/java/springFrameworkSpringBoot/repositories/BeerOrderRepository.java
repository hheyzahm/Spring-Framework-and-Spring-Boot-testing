package springFrameworkSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springFrameworkSpringBoot.entities.BeerOrder;

import java.util.UUID;

/**
 * @Created 28 03 2023 - 12:06 PM
 * @Author Hazeem Hassan
 */
public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
}
