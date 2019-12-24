package naru.trainer_app.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class AppRestController {

    @GetMapping("/test")
    String hello(){
        return "hello world";
    }
}
