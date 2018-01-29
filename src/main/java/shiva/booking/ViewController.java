package shiva.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by e056441 on 1/25/18.
 */
@Controller
public class ViewController {

    /*@Value("${app-mode}")
    private String appMode;*/

    private String appMode;

    @Autowired
    public ViewController(Environment environment){
        appMode = environment.getProperty("app-mode");

    }


    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Shiva");
        model.addAttribute("mode", appMode);

        return "index";
    }
}
