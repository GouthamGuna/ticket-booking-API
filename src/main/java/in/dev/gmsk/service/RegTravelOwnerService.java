package in.dev.gmsk.service;

import in.dev.gmsk.model.VehicleOwnerRegistration;

import java.util.List;

public interface RegTravelOwnerService {

    VehicleOwnerRegistration saveTravelsOwnerDetails(VehicleOwnerRegistration travelOwner);

    List<VehicleOwnerRegistration> fetchAllOwner();

    VehicleOwnerRegistration updateTravelsOwnerDetails(VehicleOwnerRegistration travelOwner, int id);

    VehicleOwnerRegistration fetchFindById(int id);

    void deleteTravelsOwnerById (int id);

    //VehicleOwnerRegistration updateTravelsOwnerDetails(VehicleOwnerRegistration travelOwner);
}
