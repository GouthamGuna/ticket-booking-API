package in.gmsk.repository;

import in.gmsk.model.VehicleRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRegistrationRepo extends JpaRepository<VehicleRegistration, Integer> {
}
