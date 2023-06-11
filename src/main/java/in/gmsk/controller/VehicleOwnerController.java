package in.gmsk.controller;

import in.gmsk.model.VehicleOwnerRegistration;
import in.gmsk.service.RegTravelOwnerService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/travels/owners")
public class VehicleOwnerController {

    private Logger logger = LoggerFactory.getLogger(VehicleOwnerController.class);

    private RegTravelOwnerService service;

    public VehicleOwnerController(RegTravelOwnerService service){
        this.service = service;
    }

    @PostMapping("/registration")
    public ResponseEntity<VehicleOwnerRegistration> saveTravelsOwners(
            @RequestBody @Valid VehicleOwnerRegistration travelOwner){
        logger.info("save the travels owner details : {} ",travelOwner);
        return new ResponseEntity<>(service.saveTravelsOwnerDetails(travelOwner), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<VehicleOwnerRegistration>> fetchAllOwnersDetails(){
        logger.info("fetch all travels owners details.");
        return new ResponseEntity<>(service.fetchAllOwner(), HttpStatus.OK);
    }
}
