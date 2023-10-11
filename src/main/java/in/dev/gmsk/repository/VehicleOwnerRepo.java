package in.dev.gmsk.repository;

import in.dev.gmsk.model.VehicleOwnerRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleOwnerRepo extends JpaRepository<VehicleOwnerRegistration, Integer> {
}
