package Model;

import Domain.User;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {

    private ArrayList<User> usersList;

    public UsersRepository() throws FileNotFoundException {
        this.usersList = CSVReader.readUserFileToArray("Files/login_grandesNegocios.csv");
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }
}
