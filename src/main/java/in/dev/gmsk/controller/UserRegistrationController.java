package in.dev.gmsk.controller;

import in.dev.gmsk.model.UserInfo;
import in.dev.gmsk.response.CreateUserResponse;
import in.dev.gmsk.service.serviceImpl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserRegistrationController {
    private final Logger logger = LoggerFactory.getLogger(UserRegistrationController.class);
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/addNewUser")
   // @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity< ? > addNewUser(@RequestBody UserInfo userInfo) {
        logger.info("Inside the add new user method.");
        String result = userService.addUser(userInfo);
        return new ResponseEntity<>(new CreateUserResponse(result), HttpStatus.CREATED);
    }
}
