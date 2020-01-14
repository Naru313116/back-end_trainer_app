package naru.trainer_app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String description;

    //overriders

    @Override
    public String toString() {
        return "Training{" +
                "Id=" + Id +
                ", description='" + description + '\'' +
                '}';
    }
}
