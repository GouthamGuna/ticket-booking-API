package in.gmsk.service.serviceImpl;

import in.gmsk.exception.ResourceNotFound;
import in.gmsk.model.VehicleOwnerRegistration;
import in.gmsk.repository.VehicleOwnerRepo;
import in.gmsk.service.RegTravelOwnerService;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<VehicleOwnerRegistration> fetchAllOwner() {
        return repository.findAll();
    }

    @Override
    public VehicleOwnerRegistration fetchFindById(int id) {
        return repository.findById(id).orElseThrow(() ->
                new ResourceNotFound("ServiceImpl", "Reg Travel Owner ServiceImpl", id));
    }
}
