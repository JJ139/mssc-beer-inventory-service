package nl.jellejoosten.beer.inventory.service.web.controllers;

import nl.jellejoosten.beer.inventory.service.domain.BeerInventory;
import nl.jellejoosten.beer.inventory.service.repositories.BeerInventoryRepository;
import nl.jellejoosten.beer.inventory.service.service.BeerInventoryService;
import nl.jellejoosten.beer.inventory.service.web.mappers.BeerInventoryMapper;
import nl.jellejoosten.beer.inventory.service.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created by jt on 2019-05-31.
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class BeerInventoryController {

    private final BeerInventoryService beerInventoryService;
    private final BeerInventoryMapper beerInventoryMapper;

    @GetMapping("api/v1/beer/{beerId}/inventory")
    List<BeerInventoryDto> listBeersById(@PathVariable UUID beerId){
        log.debug("Finding Inventory for beerId:" + beerId);

        List<BeerInventoryDto> beersDto = beerInventoryService
                .findAllByBeerId(beerId)
                .stream()
                .map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
                .collect(Collectors.toList());

        log.debug(String.valueOf(beersDto));

        return beersDto;
    }
}
