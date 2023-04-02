package praktykaSprinaZPaw.em.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import praktykaSprinaZPaw.em.demo.Request.BuildPortRequest;
import org.springframework.ui.Model;

@Controller
public class ControllerPort {
    @GetMapping("/add-port")
    public String getPortForm(Model model){
        BuildPortRequest buildPortRequest = new BuildPortRequest();
        model.addAttribute("request", buildPortRequest);
        return "port-form";
    }
    @PostMapping("/build-port")
    public String buildPort(@ModelAttribute BuildPortRequest buildPortRequest, Model model){
        System.out.println(buildPortRequest);
        model.addAttribute("message", "port dodany"+ " " + buildPortRequest.getLvl());
        return "imeparotor-page";
    }
}
