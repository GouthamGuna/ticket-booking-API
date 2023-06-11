package in.gmsk.service;

import in.gmsk.model.VehicleOwnerRegistration;

import java.util.List;

public interface RegTravelOwnerService {

    VehicleOwnerRegistration saveTravelsOwnerDetails(VehicleOwnerRegistration travelOwner);

    List<VehicleOwnerRegistration> fetchAllOwner();
}
