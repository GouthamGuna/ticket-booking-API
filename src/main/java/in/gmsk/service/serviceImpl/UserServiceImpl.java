package in.gmsk.service.serviceImpl;

import in.gmsk.model.UserInfo;
import in.gmsk.repository.UserInfoRepo;
import in.gmsk.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserInfoRepo repository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserInfoRepo repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "Successfully added a user.";
    }
}
