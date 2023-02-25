package org.example;

import java.io.Serializable;


/**
 * During deserialization it will create the new object every time if we go in traditional way.
 * To resolve it add readResolve method which will ensure that during deserialize we return same instance.
 *
 *  class for break example
 */
public class SerializableSingleton implements Serializable {
    private static  SerializableSingleton instance = null;
    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        if(instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    /**
     * This is the key method which is responsible for deserialization process
     * This method get invoked, and we are simply returning already created object
     * @return
     */
    protected Object readResolve() {
        return instance;
    }
}