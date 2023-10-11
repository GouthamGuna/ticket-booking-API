package in.dev.gmsk.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "vehicles_stage_name")
public class VehicleStageRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stagePID;

    @NotNull(message = "Stage name shouldn't be null")
    @NotBlank(message = "Stage name shouldn't be empty")
    private String stageName;

    @NotNull(message = "Starting time shouldn't be null")
    @NotBlank(message = "Starting time shouldn't be empty")
    private String startingTime;

    @NotNull(message = "Ending time shouldn't be null")
    @NotBlank(message = "Ending time shouldn't be empty")
    private String EndingTime;
}
