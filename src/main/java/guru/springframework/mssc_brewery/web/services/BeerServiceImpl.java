package guru.springframework.mssc_brewery.web.services;

import org.springframework.stereotype.Service;
import guru.springframework.mssc_brewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Beer #1")
                .beerStyle("Fresh")
                .build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return BeerDto.builder()
                .id(beerId)
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }
}
