package org.dulani.wallace;

import java.util.UUID;

/**
 * Created by dulaniwallace on 11/9/16.
 */

// This is a class, becomes something like org.dulani.wallace.app
public class app {
    // This is a method, becomes publicaly available if you import the class
    public static void main ( String[] args ) {
        // Instantiates an object of app for me to use, so I can call generateUniqueKey
        app obj = new app();

        System.out.println("How many job do you have, mon?: " + obj.generateUniqueKey());
    }

    public String generateUniqueKey() {
        String id = UUID.randomUUID().toString();
        String dulani = "Dulani";
        String jeffry = "Jeffry";
        return dulani + " and " + jeffry + " random bullshit " + id;
    }
}
