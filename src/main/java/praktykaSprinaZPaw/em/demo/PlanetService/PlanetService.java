package praktykaSprinaZPaw.em.demo.PlanetService;

import org.springframework.stereotype.Service;
import praktykaSprinaZPaw.em.demo.Exception.PlanetServiceException;
import praktykaSprinaZPaw.em.demo.Request.PlanetCreationRequest;

@Service
public class PlanetService {

    public void createPlanet(PlanetCreationRequest request){
        if(request.getName().isBlank()){
            throw new PlanetServiceException("Nie uzupełniono nazwy");
        } else if (request.getSice() <= 0) {
            throw new PlanetServiceException("Rozmiar planety min.1");
        }
        System.out.println("Wszystko ok dodaję planetę");
    }

}
