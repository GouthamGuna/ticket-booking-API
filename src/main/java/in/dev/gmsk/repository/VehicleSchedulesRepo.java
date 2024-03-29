package in.dev.gmsk.repository;

import in.dev.gmsk.model.VehicleDailySchedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehicleSchedulesRepo extends JpaRepository<VehicleDailySchedules, Integer> {
}
