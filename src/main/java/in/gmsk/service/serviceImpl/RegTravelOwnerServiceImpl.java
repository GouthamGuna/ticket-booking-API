package in.gmsk.service.serviceImpl;

import in.gmsk.model.VehicleOwnersRegistration;
import in.gmsk.repository.VehicleOwnersRepo;
import in.gmsk.service.RegTravelOwnerService;
import org.springframework.stereotype.Service;

@Service
public class RegTravelOwnerServiceImpl implements RegTravelOwnerService {

    private VehicleOwnersRepo repository;

    public RegTravelOwnerServiceImpl(VehicleOwnersRepo repository){
        this.repository = repository;
    }

    @Override
    public VehicleOwnersRegistration saveTravelsOwnerDetails(VehicleOwnersRegistration travelOwner) {
        return repository.save(travelOwner);
    }
}
