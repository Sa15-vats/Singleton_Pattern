package org.example;

/**
 * ENUM's constructor gets invoked by JVM not by User who is using so it is safe to use.
 * Another advantage of using enum is , we don't need to worry about threads as it is thread safe.
 * It also solved the problem of Serialization as JVM takes care to return same object.
 *
 */
public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("Solve");
    }
}
