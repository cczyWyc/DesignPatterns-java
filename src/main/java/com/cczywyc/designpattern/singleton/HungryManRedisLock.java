package com.cczywyc.designpattern.singleton;

/**
 * redis lock use hungry man style
 *
 * @author wangyc
 */
public class HungryManRedisLock {

    /** hungry man style. init the object, static instance */
    private static final HungryManRedisLock instance = new HungryManRedisLock();

    /**
     * constructor private function
     */
    private HungryManRedisLock() {
    }

    public static HungryManRedisLock getInstance() {
        return instance;
    }
}
