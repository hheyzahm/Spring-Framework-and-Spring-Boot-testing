package springFrameworkSpringBoot.mappers;

import org.mapstruct.Mapper;
import springFrameworkSpringBoot.Model.CustomerDTO;
import springFrameworkSpringBoot.entities.CustomerEntity;

/**
 * @Created 20 03 2023 - 12:02 PM
 * @Author Hazeem Hassan
 */
@Mapper
public interface CustomerMapper {
    CustomerEntity customerDTOtoCustomerEntity(CustomerDTO customerDTO);
    CustomerDTO customerEntityToCustomerDTO(CustomerEntity customerEntityS10);
}
