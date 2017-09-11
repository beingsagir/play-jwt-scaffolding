package repository;

import com.google.inject.Inject;
import models.User;


public class DBOperation {

    @Inject
    InMemoryData inMemoryData;

    public Boolean saveUser(User user){
        inMemoryData.emailToUser.put(user.getUsername(), user);
        return true;
    }

    public User getUser(String username){
        return inMemoryData.emailToUser.get(username);
    }

    public void UpdateUserAgainstToken(String token, User user){
        inMemoryData.tokenToUser.put(token, user);
    }

    public User getUserByToken(String token){
        return inMemoryData.tokenToUser.get(token);
    }

}
