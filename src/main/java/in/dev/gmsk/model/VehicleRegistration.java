package in.dev.gmsk.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "registered_vehicles")
public class VehicleRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehiclePID;

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
    @NotBlank(message = "Total no of stage`s shouldn't be empty")
    private String noOfStages;

    @NotNull(message = "Vehicle type shouldn't be null")
    @NotBlank(message = "Vehicle type shouldn't be empty")
    private String vehicleTypeACNonAC;

    @NotNull(message = "Vehicle made shouldn't be null")
    @NotBlank(message = "Vehicle made point shouldn't be empty")
    private String vehicleMade;

    @OneToMany(targetEntity = VehicleStageRegistration.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_fk", referencedColumnName = "vehiclePID")
    private List<VehicleStageRegistration> stageDetails;

    /*@ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "vehicle_stage_names", joinColumns = @JoinColumn(name = "vehicle_fk"))
    private Set<String> stageName;*/
}
