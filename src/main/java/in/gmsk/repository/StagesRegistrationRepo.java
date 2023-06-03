package in.gmsk.repository;

import in.gmsk.model.VehicleStagesRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StagesRegistrationRepo extends JpaRepository<VehicleStagesRegistration, Integer> {
}
