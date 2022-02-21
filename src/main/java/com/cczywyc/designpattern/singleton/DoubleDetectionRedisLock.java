package com.cczywyc.designpattern.singleton;

/**
 * Redis lock use double detection
 *
 * @author wangyc
 */
public class DoubleDetectionRedisLock {

    /** instance */
    private static DoubleDetectionRedisLock instance;

    /**
     * constructor private function
     */
    private DoubleDetectionRedisLock() {
    }

    public static DoubleDetectionRedisLock getInstance() {
        if (instance == null) {
            synchronized (DoubleDetectionRedisLock.class) {
                if (instance == null) {
                    instance = new DoubleDetectionRedisLock();
                }
            }
        }
        return instance;
    }
}
