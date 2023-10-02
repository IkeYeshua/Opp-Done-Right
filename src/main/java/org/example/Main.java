package org.example;


import buyerspackage.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.add(new User("Nneka"));
        user.add(new User("Lucia"));
        user.add(new User("Kingsman"));

        user.greetAllUsers();

       // user1.greet();
        //user2.greet();



    }


}