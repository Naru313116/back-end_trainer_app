package naru.trainer_app.service.training;

import naru.trainer_app.model.Training;
import naru.trainer_app.repository.TrainingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {


private final TrainingRepository trainingRepository;

    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public List<Training> findAll() {
        return trainingRepository.findAll();
    }

    @Override
    public Training getById(int trainingId) {
        return trainingRepository.findById(trainingId).orElse(new Training());
    }

    @Override
    public void save(Training training) {
    trainingRepository.save(training);
    }

    @Override
    public void delete(int trainingId) {
    trainingRepository.deleteById(trainingId);
    }
}
