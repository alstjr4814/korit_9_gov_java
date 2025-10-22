package com.korit.study.ch23;

import java.util.ArrayList;
import java.util.Objects;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class VipUser extends User {
    public VipUser(String username, String password) {
        super(username, password);
    }
}

class GoldUser extends User {
    public GoldUser(String username, String password) {
        super(username, password);
    }
}

public class WildcardMain {
    public static void main(String[] args) {
        WildcardMain main = new WildcardMain();
//        ArrayList<String> names = new ArrayList<>();
//        names.add("김준일");
//        names.add("김준이");
//        names.add("김준삼");
//        main.printAll(names);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("test1", "1234"));
        users.add(new User("test2", "5678"));
        users.add(new User("test3", "1111"));
        main.printAll(users);

        ArrayList<VipUser> vipUsers = new ArrayList<>();
        vipUsers.add(new VipUser("vip1", "1234"));
        vipUsers.add(new VipUser("vip2", "5678"));
        vipUsers.add(new VipUser("vip3", "1111"));
        main.printAll(vipUsers);

        ArrayList<GoldUser> goldUsers = new ArrayList<>();
        goldUsers.add(new GoldUser("vip1", "1234"));
        goldUsers.add(new GoldUser("vip2", "5678"));
        goldUsers.add(new GoldUser("vip3", "1111"));
        main.printAll(goldUsers);
    }

    public void printAll(ArrayList<? extends User> list) {
        for (User s : list) {

            System.out.println(s);
        }
    }
}










