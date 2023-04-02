package praktykaSprinaZPaw.em.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerPort {
    @RequestMapping(path = "/add-fleet", method = RequestMethod.GET)
    public ModelAndView getPort(){
        ModelAndView modelAndView = new ModelAndView("port-form.html");
        return modelAndView;



    }
}
