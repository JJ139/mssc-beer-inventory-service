package nl.jellejoosten.beer.inventory.service.web.mappers;

import nl.jellejoosten.beer.inventory.service.domain.BeerInventory;
import nl.jellejoosten.beer.inventory.service.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;


@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
