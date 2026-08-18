package guru.springframework.mssc_brewery.web.services;

import guru.springframework.mssc_brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    public BeerDto getBeerById(UUID beerId);
}
