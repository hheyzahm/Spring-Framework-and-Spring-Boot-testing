package springFrameworkSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springFrameworkSpringBoot.entities.CustomerEntity;

import java.util.UUID;

/**
 * @Created 20 03 2023 - 11:26 AM
 * @Author Hazeem Hassan
 */
public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> {
}
