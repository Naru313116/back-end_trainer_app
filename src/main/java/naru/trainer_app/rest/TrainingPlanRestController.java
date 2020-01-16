package naru.trainer_app.rest;


import naru.trainer_app.service.training_plan.TrainingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
@CrossOrigin
public class TrainingPlanRestController {

    private final TrainingPlanService trainingPlanService;

    public TrainingPlanRestController(TrainingPlanService trainingPlanService) {
        this.trainingPlanService = trainingPlanService;
    }


}
