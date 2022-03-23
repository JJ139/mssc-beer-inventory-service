package nl.jellejoosten.beer.inventory.service.service;

import nl.jellejoosten.beer.inventory.service.domain.BeerInventory;
import nl.jellejoosten.beer.inventory.service.repositories.BeerInventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BeerInventoryServiceImpl implements BeerInventoryService {

    private final BeerInventoryRepository repository;

    public BeerInventoryServiceImpl(BeerInventoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<BeerInventory> findAllByBeerId(UUID beerId) {
        return repository.findAllByBeerId(beerId);
    }
}
