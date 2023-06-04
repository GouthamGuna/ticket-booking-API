package in.gmsk.repository;

import in.gmsk.model.VehicleOwnersRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleOwnersRepo extends JpaRepository<VehicleOwnersRegistration, Integer> {
}
