package com.cczywyc.designpattern.singleton;

/**
 * Redis lock use static internal class
 *
 * @author wangyc
 */
public class StaticRedisLock {

    /**
     * constructor private function
     */
    private StaticRedisLock() {
    }

    private static class SingletonHolder {
        /** instance */
        private static final StaticRedisLock instance = new StaticRedisLock();
    }

    public static StaticRedisLock getInstance() {
        return SingletonHolder.instance;
    }
}
