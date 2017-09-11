package controllers;

import models.User;
import play.mvc.*;
import services.AuthService;
import services.SecureService;

import javax.inject.Inject;

public class HomeController extends Controller {

    @Inject
    AuthService authService;


    public Result index() {
        return ok("");
    }


    public Result signUp(String email, String password){
        authService.createUser(email, password);
        return ok("User is created");
    }

    public Result signIn(String email, String password){
        String token = authService.generateAToken();
        User user = authService.getUser(email, password);
        if(user != null)
            authService.updateUserToken(email, password, token);
        else
            return unauthorized();
        response().setHeader("X-AUTH-TOKEN", token);
        return ok("{'token': "+token+"}");
    }

    @Security.Authenticated(SecureService.class)
    public Result access(){
        return ok("Access Granted");
    }


    public Result getCurrentUserForTest(String email, String password){
        User user = authService.getUser(email, password);
        if (user == null)
            return ok("No user found !");
        else
            return ok(user.toString());
    }

}
