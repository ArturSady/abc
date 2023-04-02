package praktykaSprinaZPaw.em.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import praktykaSprinaZPaw.em.demo.Exception.PlanetServiceException;
import praktykaSprinaZPaw.em.demo.PlanetService.PlanetService;
import praktykaSprinaZPaw.em.demo.Request.PlanetCreationRequest;

@Controller
public class ControllerPlanet {

    private PlanetService planetService;

    public ControllerPlanet(PlanetService planetService){
        this.planetService = planetService;
    }

    @GetMapping("/add-planet")
    public String getPlanet(){
        return ("planet-form");

    }
    @PostMapping("/add-planet")
    public String createPlanet(@RequestParam String name,
                               @RequestParam(name = "planet_type") String type,
                               @RequestParam int size, Model model){
    try {
        planetService.createPlanet(new PlanetCreationRequest(name, type , size));
        model.addAttribute("message", "Dodano planetę o nazwie: " + name);
        
    }catch (PlanetServiceException e){
        model.addAttribute("message", e.getMessage());
    }

       return "imperator-page";
    }


}
