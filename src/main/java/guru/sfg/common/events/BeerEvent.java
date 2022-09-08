package guru.sfg.common.events;

import java.io.Serializable;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {


    static final long serialVersionUID = -6437491977152691599L;

    private BeerDto beerDto;

}
