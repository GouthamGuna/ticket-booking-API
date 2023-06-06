package in.gmsk.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "vehicles_stage_name")
public class VehicleStageRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stagePID;

    private String stageName;

    private String startingTime;

    private String EndingTime;
}
