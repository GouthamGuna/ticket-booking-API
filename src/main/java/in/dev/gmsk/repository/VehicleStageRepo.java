package in.dev.gmsk.repository;

import in.dev.gmsk.model.VehicleStageRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStageRepo extends JpaRepository<VehicleStageRegistration, Integer> {
}
