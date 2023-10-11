package in.dev.gmsk.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "daily_vehicle_update")
public class VehicleDailySchedules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "vehicle name shouldn't be null")
    @NotBlank(message = "vehicle name shouldn't be empty")
    private String vehicleId;

    @NotNull(message = "Traveling date shouldn't be null")
    @NotBlank(message = "Traveling date shouldn't be empty")
    private String travelingDate;

    @NotNull(message = "Starting boarding shouldn't be null")
    @NotBlank(message = "Starting boarding shouldn't be empty")
    private String startingBoarding;

    @NotNull(message = "Ending boarding shouldn't be null")
    @NotBlank(message = "Ending boarding shouldn't be empty")
    private String endingBoarding;

    @NotNull(message = "No of seat shouldn't be null")
    @NotBlank(message = "No of seat shouldn't be empty")
    private String noOfSeat;

    @NotNull(message = "Contact person shouldn't be null")
    @NotBlank(message = "Contact person shouldn't be empty")
    private String contactPerson;
}
