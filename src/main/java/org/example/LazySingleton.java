package org.example;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    //But initialize the instance like this creates the violates against mutlithreading approach
    private static LazySingleton instance  = null;

    private LazySingleton() {
        /**  we create the private constructor
               which means no one will be
         able to create the object of this class.*/
    }

    //As the multi threads come here, both threads is getting the new object of the same class
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();   // instantiate the object and return the same object again and again
        }
        return instance;
    }

}
