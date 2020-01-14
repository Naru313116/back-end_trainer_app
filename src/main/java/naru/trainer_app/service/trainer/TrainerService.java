package naru.trainer_app.service.trainer;

import naru.trainer_app.model.Trainer;

import java.util.List;

public interface TrainerService {
    List<Trainer> findAll();
    Trainer getById(int trainerId);
    void save(Trainer trainer);
    void delete(int trainerId);
}
