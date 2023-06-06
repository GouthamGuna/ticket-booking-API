package in.gmsk.service.serviceImpl;

import in.gmsk.model.VehicleOwnerRegistration;
import in.gmsk.repository.VehicleOwnerRepo;
import in.gmsk.service.RegTravelOwnerService;
import org.springframework.stereotype.Service;

@Service
public class RegTravelOwnerServiceImpl implements RegTravelOwnerService {

    private VehicleOwnerRepo repository;

    public RegTravelOwnerServiceImpl(VehicleOwnerRepo repository){
        this.repository = repository;
    }

    @Override
    public VehicleOwnerRegistration saveTravelsOwnerDetails(VehicleOwnerRegistration travelOwner) {
        return repository.save(travelOwner);
    }
}
