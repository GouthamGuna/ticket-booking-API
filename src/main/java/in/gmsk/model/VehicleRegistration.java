package in.gmsk.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "vehicle_registration")
public class VehicleRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "vehicle reg.no shouldn't be null")
    @NotBlank(message = "vehicle reg.no shouldn't be empty")
    private String vehicleRegistrationNo;

    @NotNull(message = "Total capacity shouldn't be null")
    @NotBlank(message = "Total capacity shouldn't be empty")
    private String totalCapacity;

    @NotNull(message = "Route name shouldn't be null")
    @NotBlank(message = "Route route name shouldn't be empty")
    private String routeName;

    @NotNull(message = "Starting point shouldn't be null")
    @NotBlank(message = "Starting point shouldn't be empty")
    private String staringPoint;

    @NotNull(message = "Ending point shouldn't be null")
    @NotBlank(message = "Ending point shouldn't be empty")
    private String endingPoint;

    @NotNull(message = "Total no of stage`s shouldn't be null")
    @NotBlank(message = "Total no of stage`s point shouldn't be empty")
    private String noOfStages;


    @OneToMany(targetEntity = VehicleStagesRegistration.class, cascade = CascadeType.ALL)
    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "vehicle_stage_reg", joinColumns = @JoinColumn(name = "vehicle_fk",  referencedColumnName = "id"))
    private List<VehicleStagesRegistration> stagesNameRegistration;
}
