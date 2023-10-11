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
    public VehicleOwnerRegistration updateTravelsOwnerDetails(VehicleOwnerRegistration travelOwner, int id) {
        VehicleOwnerRegistration exitingOwnerReg = repository.findById(id).orElseThrow(() ->
                new ResourceNotFound("ServiceImpl", "Update Travel Owner ServiceImpl", id));

        exitingOwnerReg.setOwnerName(travelOwner.getOwnerName());
        exitingOwnerReg.setOwnerMailId(travelOwner.getOwnerMobileNo());
        exitingOwnerReg.setMangerAddress(travelOwner.getMangerAddress());
        exitingOwnerReg.setManagerMailId(travelOwner.getManagerMailId());
        exitingOwnerReg.setOwnerAddress(travelOwner.getOwnerAddress());
        exitingOwnerReg.setTravelsName(travelOwner.getTravelsName());
        exitingOwnerReg.setManagerMobileNo(travelOwner.getManagerMobileNo());
        exitingOwnerReg.setManagerName(travelOwner.getManagerName());

        repository.save(exitingOwnerReg);

        return exitingOwnerReg;
    }

    @Override
    public VehicleOwnerRegistration fetchFindById(int id) {
        return repository.findById(id).orElseThrow(() ->
                new ResourceNotFound("ServiceImpl", "Reg Travel Owner ServiceImpl", id));
    }

    @Override
    public void deleteTravelsOwnerById(int id) {
        repository.findById(id).orElseThrow(() ->
                new ResourceNotFound("ServiceImpl", "Reg Travel Owner ServiceImpl", id));
        repository.deleteById(id);
    }
}
