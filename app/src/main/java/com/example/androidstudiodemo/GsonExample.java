package com.example.androidstudiodemo;

import com.google.gson.Gson; // TODO: הוסף import לGson כאן

public class GsonExample {
    
    static class User {
        String name;
        int age;
        String city;
        
        User(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
    }
    
    public static void main(String[] args) {
        Gson gson = new Gson();
        
        User user = new User("דני", 17, "תל אביב");
        
        String json = gson.toJson(user);
        System.out.println("JSON: " + json);
        
        String jsonString = "{\"name\":\"שרה\",\"age\":16,\"city\":\"ירושלים\"}";
        User newUser = gson.fromJson(jsonString, User.class);
        System.out.println("Name: " + newUser.name);
        System.out.println("Age: " + newUser.age);
        System.out.println("City: " + newUser.city);
    }
}
