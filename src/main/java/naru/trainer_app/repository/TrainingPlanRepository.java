package naru.trainer_app.repository;

import naru.trainer_app.model.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingPlanRepository extends JpaRepository<TrainingPlan, Integer> {
}
