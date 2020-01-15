package naru.trainer_app.service.training_plan;

import naru.trainer_app.model.TrainingPlan;

import java.util.List;

public interface TrainingPlanService {

    List<TrainingPlan> findAll();
    TrainingPlan getById(int trainingPlanId);
    void save(TrainingPlan trainingPlan);
    void delete(int trainingPlanId);

}
