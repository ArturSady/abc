package praktykaSprinaZPaw.em.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerImperator {



    @RequestMapping(path = "/imperator", method = RequestMethod.GET)
    public ModelAndView getImperator(){
        ModelAndView modelAndView = new ModelAndView("imperator-page.html");
        return modelAndView;


    }


}
