package in.gmsk.controller;

import in.gmsk.model.VehicleOwnerRegistration;
import in.gmsk.response.DeleteResponse;
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

    @GetMapping("/fetchById/{id}")
    public ResponseEntity<VehicleOwnerRegistration> FindById(@PathVariable int id){
        logger.info("fetch by id travels owners details.");
        return new ResponseEntity<>(service.fetchFindById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<VehicleOwnerRegistration> updateTravelsOwnerDetails(
            @RequestBody @Valid VehicleOwnerRegistration travelOwner,
            @PathVariable int id){
        logger.info("update by travels owners details.");
        return new ResponseEntity<>(service.updateTravelsOwnerDetails(travelOwner,id), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity< DeleteResponse > deleteTravelsOwnerDetails(@PathVariable int id){
        logger.info("delete by id travels owner`s details.");
        service.deleteTravelsOwnerById(id);
        return new ResponseEntity<>(new DeleteResponse(
                "The owner's information for Travels has been successfully deleted."), HttpStatus.OK);
    }
}
