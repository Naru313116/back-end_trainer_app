package naru.trainer_app.service.training_plan;

import naru.trainer_app.model.Training;
import naru.trainer_app.model.TrainingPlan;
import naru.trainer_app.repository.TrainingPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TrainingPlanServiceImpl implements TrainingPlanService {

   private final TrainingPlanRepository trainingPlanRepository;

    public TrainingPlanServiceImpl(TrainingPlanRepository trainingPlanRepository) {
        this.trainingPlanRepository = trainingPlanRepository;
    }

    @Override
    public List<TrainingPlan> findAll() {
        return trainingPlanRepository.findAll();
    }

    @Override
    public TrainingPlan getById(int trainingPlanId) {
        return trainingPlanRepository.findById(trainingPlanId).orElse(new TrainingPlan());
    }

    @Override
    public void save(TrainingPlan trainingPlan) {
    trainingPlanRepository.save(trainingPlan);
    }

    @Override
    public void delete(int trainingPlanId) {
    trainingPlanRepository.deleteById(trainingPlanId);
    }
}
