package naru.trainer_app.rest;


import naru.trainer_app.model.Trainer;
import naru.trainer_app.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("app")
public class AppRestController {

    private final TrainerService trainerService;

    public AppRestController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/trainers")
    List<Trainer> getTrainerList(){
        return trainerService.findAll();
    }


}
