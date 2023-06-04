package in.gmsk.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "daily_travels_update")
public class DailySchedulesForBuses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "vehicle name shouldn't be null")
    @NotBlank(message = "vehicle name shouldn't be empty")
    private String vehicleId;

    @NotNull(message = "Traveling date shouldn't be null")
    @NotBlank(message = "Traveling date shouldn't be empty")
    private String travelingDate;

    @NotNull(message = "Traveling from shouldn't be null")
    @NotBlank(message = "Traveling from shouldn't be empty")
    private String from;

    @NotNull(message = "Traveling to shouldn't be null")
    @NotBlank(message = "Traveling to shouldn't be empty")
    private String to;

    @NotNull(message = "No of seat shouldn't be null")
    @NotBlank(message = "No of seat shouldn't be empty")
    private String noOfSeat;

    @NotNull(message = "Contact person shouldn't be null")
    @NotBlank(message = "Contact person shouldn't be empty")
    private String contactPerson;
}
