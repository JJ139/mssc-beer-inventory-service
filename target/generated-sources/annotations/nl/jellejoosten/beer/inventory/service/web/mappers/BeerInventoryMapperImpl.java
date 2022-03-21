package nl.jellejoosten.beer.inventory.service.web.mappers;

import java.sql.Timestamp;
import java.util.UUID;
import javax.annotation.processing.Generated;
import nl.jellejoosten.beer.inventory.service.domain.BeerInventory;
import nl.jellejoosten.beer.inventory.service.web.model.BeerInventoryDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-21T20:10:52+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class BeerInventoryMapperImpl implements BeerInventoryMapper {

    @Override
    public BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO) {
        if ( beerInventoryDTO == null ) {
            return null;
        }

        UUID id = null;
        Long version = null;
        Timestamp createdDate = null;
        Timestamp lastModifiedDate = null;
        UUID beerId = null;
        String upc = null;
        Integer quantityOnHand = null;

        BeerInventory beerInventory = new BeerInventory( id, version, createdDate, lastModifiedDate, beerId, upc, quantityOnHand );

        return beerInventory;
    }

    @Override
    public BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory) {
        if ( beerInventory == null ) {
            return null;
        }

        BeerInventoryDto beerInventoryDto = new BeerInventoryDto();

        return beerInventoryDto;
    }
}
