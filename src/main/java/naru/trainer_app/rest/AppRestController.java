package naru.trainer_app.rest;


import naru.trainer_app.model.Client;
import naru.trainer_app.model.Trainer;
import naru.trainer_app.model.Training;
import naru.trainer_app.service.client.ClientService;
import naru.trainer_app.service.trainer.TrainerService;
import naru.trainer_app.service.training.TrainingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app")
@CrossOrigin
public class AppRestController {

    private final TrainerService trainerService;
    private final ClientService clientService;
    private final TrainingService trainingService;
    public AppRestController(TrainerService trainerService, ClientService clientService, TrainingService trainingService) {
        this.trainerService = trainerService;
        this.clientService = clientService;
        this.trainingService=trainingService;
    }

    //test
    @GetMapping("/trainers")
    List<Trainer> getTrainerList() {
        return trainerService.findAll();
    }
    //test
    @GetMapping("/clients")
    List<Client> getClientList(){
        return clientService.findAll();
    }

    //test
    @DeleteMapping("/trainings")
   String deleteTraining(){
        Training tmp = trainingService.getById(1);
        trainingService.delete(tmp.getId());
    return "deleted " + tmp;
    }


}
