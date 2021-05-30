package adportal.storage;

import adportal.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    Map<String, User> userMap = new HashMap<>();

    public void add(User user) {
        userMap.put(user.getPhoneNumber(), user);

    }

    public boolean logIn(String phoneNumber, String password) {
        User user = userMap.get(phoneNumber);
        return user != null && user.getPassword().equals(password);

    }


    public User getUserByPhoneNumber(String phoneNumber) {
        User user = userMap.get(phoneNumber);
        return user;
    }

    public boolean isEmpty(){
        return userMap.isEmpty();
    }
}
