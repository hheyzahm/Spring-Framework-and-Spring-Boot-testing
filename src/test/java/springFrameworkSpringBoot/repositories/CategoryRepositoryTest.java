package springFrameworkSpringBoot.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springFrameworkSpringBoot.entities.BeerEntity;
import springFrameworkSpringBoot.entities.Category;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryRepositoryTest {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    BeerRepository beerRepository;
    BeerEntity testBeer;

    @BeforeEach
    void setUp() {
        testBeer = beerRepository.findAll().get(0);
    }

    @Test
    void testAddCategory() {
        Category savedCategory = categoryRepository
                .save(Category
                .builder()
                .description("Ales")
                .build());
        testBeer.addCategory(savedCategory);

        BeerEntity beer= beerRepository.save(testBeer);

        System.out.println(beer.getBeerName());
    }
}