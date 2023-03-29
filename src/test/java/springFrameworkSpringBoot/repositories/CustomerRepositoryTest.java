package springFrameworkSpringBoot.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import springFrameworkSpringBoot.entities.CustomerEntity;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testSaveCustomer() {
        CustomerEntity customer = customerRepository.save(CustomerEntity.builder()
                .name("New Name")
                .build());

        assertThat(customer.getId()).isNotNull();

    }
}
