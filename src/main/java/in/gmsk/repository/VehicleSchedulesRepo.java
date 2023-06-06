package in.gmsk.repository;

import in.gmsk.model.VehicleDailySchedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehicleSchedulesRepo extends JpaRepository<VehicleDailySchedules, Integer> {
}
