package sadil.chamishka.cicd.samplespringwebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Welcome";
    }
}
