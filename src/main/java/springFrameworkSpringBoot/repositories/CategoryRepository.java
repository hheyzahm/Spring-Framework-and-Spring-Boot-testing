package springFrameworkSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springFrameworkSpringBoot.entities.Category;

import java.util.UUID;

/**
 * @Created 28 03 2023 - 4:50 PM
 * @Author Hazeem Hassan
 */
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
