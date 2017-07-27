package byaj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("message", "This is my java application, it makes a distinctive sound when fired upon you. There are many aopps like it, but this one is mine.");
        model.addAttribute("other", "just another message");
        return "home";
    }

    @RequestMapping("/2")
    public String page2(){
        return "two";
    }
}
