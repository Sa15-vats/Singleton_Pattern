package org.example;

public class EagerSingleton {

    private static EagerSingleton instanceEager = new EagerSingleton();

    private EagerSingleton(){

    }

    /**
    So To make the  Lazy approach to Eager we are declaring the object
     at that time we are instantiating the object, so that jvm will ensure that
     whenever any thread is trying to access it then it get only one object everytime.
   */
    public static EagerSingleton getInstance(){
        return instanceEager;// but this case also make a break for jvm memory, as if we are not using that object then it wil
    }

    // but this case also make a break for jvm memory,if we are not using the instance then also the object will be created
    // and using the memory which is useless.

}
