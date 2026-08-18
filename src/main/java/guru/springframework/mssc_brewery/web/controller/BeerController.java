package guru.springframework.mssc_brewery.web.controller;

import guru.springframework.mssc_brewery.web.services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import guru.springframework.mssc_brewery.web.model.BeerDto;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        /* Same as @PathVariable UUID beerId */
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping /* Post - Create new beer */
    public ResponseEntity<String> createBeer(BeerDto beerDto) {
        BeerDto newBeer = this.beerService.createBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer" + newBeer.getId().toString());

        return new ResponseEntity<>("Beer created succesfully", headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<String> updateBeer(@PathVariable UUID beerId, BeerDto beerDto) {
        BeerDto updatedBeer = this.beerService.updateBeer(beerId, beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + beerId.toString());

        return new ResponseEntity<>("Beer updated succesfully", headers, HttpStatus.ACCEPTED);
    }
}
