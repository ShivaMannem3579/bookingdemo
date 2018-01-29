package shiva.booking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e056441 on 1/24/18.
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Shiva !";
    }
}
