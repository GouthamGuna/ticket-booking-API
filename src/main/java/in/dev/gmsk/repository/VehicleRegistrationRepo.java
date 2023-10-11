package in.dev.gmsk.repository;

import in.dev.gmsk.model.VehicleRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRegistrationRepo extends JpaRepository<VehicleRegistration, Integer> {
}
