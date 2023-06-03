package in.gmsk.repository;

import in.gmsk.model.VehicleRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRegistrationRepo extends JpaRepository<VehicleRegistration, Integer> {
}
