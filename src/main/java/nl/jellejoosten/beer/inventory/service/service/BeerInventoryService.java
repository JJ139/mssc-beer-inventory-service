package nl.jellejoosten.beer.inventory.service.service;

import nl.jellejoosten.beer.inventory.service.domain.BeerInventory;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryService {

    List<BeerInventory> findAllByBeerId(UUID beerId);
}
