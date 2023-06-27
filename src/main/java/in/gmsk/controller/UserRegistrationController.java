package in.gmsk.controller;

import in.gmsk.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserRegistrationController {
    private final Logger logger = LoggerFactory.getLogger(UserRegistrationController.class);
    /*@PostMapping("/addNewUser")
    public ResponseEntity< ? > addNewUser(@RequestBody UserInfo userInfo) {
        logger.info("Inside the add new user method.");
        String output = userService.addUser(userInfo);
        return new ResponseEntity<>(new SuccessResponseEntity(output), HttpStatus.CREATED);
    }*/
}
