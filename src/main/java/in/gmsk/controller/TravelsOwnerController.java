package in.gmsk.controller;

import in.gmsk.model.VehicleOwnersRegistration;
import in.gmsk.service.RegTravelOwnerService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/travels/owners")
public class TravelsOwnerController {

    private Logger logger = LoggerFactory.getLogger(TravelsOwnerController.class);

    private RegTravelOwnerService service;

    public TravelsOwnerController(RegTravelOwnerService service){
        this.service = service;
    }

    @PostMapping("/registration")
    public ResponseEntity<VehicleOwnersRegistration> saveTravelsOwners(
            @RequestBody @Valid VehicleOwnersRegistration travelOwner){
        logger.info("save the travels owner details : {} ",travelOwner);
        return new ResponseEntity<>(service.saveTravelsOwnerDetails(travelOwner), HttpStatus.CREATED);
    }
}
