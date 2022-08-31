package guru.springframework.msscbeerservice.bootstrap;

import java.math.BigDecimal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;

//comandlinerrunner makes sure class runs every time the spring context starts
@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeers();
    }

    private void loadBeers() {
        if(beerRepository.count()==0){
            beerRepository.save(
                    Beer.builder()
                            .beerName("Mango Bobs")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(340000L)
                            .price(new BigDecimal("12.95"))
                            .build());

            beerRepository.save(
                    Beer.builder()
                            .beerName("Galaxy Cat")
                            .beerStyle("PALE_ALE")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(3400002L)
                            .price(new BigDecimal("11.95"))
                            .build());
        }

        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
