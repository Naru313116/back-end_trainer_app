package naru.trainer_app.service.training;


import naru.trainer_app.model.Trainer;
import naru.trainer_app.model.Training;

import java.util.List;

public interface TrainingService {

    List<Training> findAll();
    Training getById(int trainingId);
    void save(Training training);
    void delete(int trainingId);

}
