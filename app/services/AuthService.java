package services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.google.inject.Inject;
import models.User;
import repository.DBOperation;

import java.io.UnsupportedEncodingException;

public class AuthService {

    @Inject
    DBOperation dbOperation;

    public String generateAToken(){
        String token = null;
        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            token = JWT.create()
                    .withIssuer("auth0")
                    .sign(algorithm);
        } catch (UnsupportedEncodingException exception){
            //UTF-8 encoding not supported
        } catch (JWTCreationException exception){
            //Invalid Signing configuration / Couldn't convert Claims.
        }
        return token;
    }

    public Boolean createUser(String email, String password){
        User user = new User();
        user.setUsername(email);
        user.setPassword(password);

        // saving to DB
        return dbOperation.saveUser(user);
    }

    public User getUserByToken(String token){
        User user = dbOperation.getUserByToken(token);
        return user;
    }

    public void updateUserToken(String email, String password, String token){
        User user = getUser(email, password);
        user.setToken(token);
        dbOperation.UpdateUserAgainstToken(token, user);
        dbOperation.saveUser(user);
    }


    public User getUser(String email, String password){

        User user = dbOperation.getUser(email);
        if(user == null){
            System.out.printf("User not found");
            return null;
        }else{
            if(user.getPassword().contains(password)){
                return user;
            }else{
                return null;
            }
        }
    }

}
