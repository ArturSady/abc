package praktykaSprinaZPaw.em.demo.Exception;

import praktykaSprinaZPaw.em.demo.Request.PlanetCreationRequest;

public class PlanetServiceException extends RuntimeException {


    public PlanetServiceException(String message){
        super(message);
    }

}
