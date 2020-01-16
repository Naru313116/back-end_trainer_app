package naru.trainer_app.rest;


import naru.trainer_app.service.training.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
@CrossOrigin
public class TrainingRestController {

    private final TrainingService trainingService;

    public TrainingRestController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }


}
