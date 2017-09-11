package repository;

import models.User;

import java.util.HashMap;
import java.util.Map;

public class InMemoryData {

    public static Map<String, User> tokenToUser =  new HashMap<>();
    public static Map<String, User> emailToUser = new HashMap<>();


}
