package springFrameworkSpringBoot.mappers;

import org.mapstruct.Mapper;
import springFrameworkSpringBoot.Model.BeerDTO;
import springFrameworkSpringBoot.entities.BeerEntity;


/**
 * @Created 20 03 2023 - 12:02 PM
 * @Author Hazeem Hassan
 */
@Mapper
public interface BeerMapper {
    BeerEntity beerDTOtoBeerEntity(BeerDTO beerDTO);
    BeerDTO beerEntityToBeerDTO(BeerEntity beer);
}
