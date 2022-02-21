package com.cczywyc.designpattern.singleton;

/**
 * Redis lock use lazy man style
 *
 * @author wangyc
 */
public class LazyManRedisLock {

    /** instance */
    private static LazyManRedisLock instance;

    /**
     * constructor private function
     */
    private LazyManRedisLock() {
    }

    public static synchronized LazyManRedisLock getInstance() {
        if (instance == null) {
            instance = new LazyManRedisLock();
        }
        return instance;
    }
}
