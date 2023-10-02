package buyerspackage;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private final List<User> users = new ArrayList<>();
    public  User(){}

    public User(String name) {
        this.name = name;
    }


    public void add(User u) {
        users.add(u);
    }

    public void greet() {
        System.out.println("Hello, " + name);
    }

    public void greetAllUsers(){
        users.forEach(User::greet);
    }

}


