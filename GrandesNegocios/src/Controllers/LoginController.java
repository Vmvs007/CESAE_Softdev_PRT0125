package Controllers;

import Domain.User;
import Model.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {

    private UsersRepository usersRepository;

    public LoginController() throws FileNotFoundException {
        usersRepository = new UsersRepository();
    }

    public String accessType(String usernameInput, String passwordInput) {
        String accessType="ERROR";

        for(User currentUser: this.usersRepository.getUsersList()){
            if(usernameInput.equals(currentUser.getUsername()) && passwordInput.equals(currentUser.getPassword())){
                // Valid Access
                accessType= currentUser.getUserType();
            }
        }

        return accessType;
    }
}
