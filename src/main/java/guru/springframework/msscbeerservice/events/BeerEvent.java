package guru.springframework.msscbeerservice.events;

import java.io.Serializable;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {


    static final long serialVersionUID = -6437491977152691599L;

    private final BeerDto beerDto;

}
