package com.cczywyc.designpattern.singleton;

/**
 * Redis lock use enum
 *
 * @author wangyc
 */
public class EnumRedisLock {

    private enum EnumSingleton {
        INSTANCE;
        private EnumRedisLock instance;

        EnumSingleton() {
            instance = new EnumRedisLock();
        }
        private EnumRedisLock getSingleton() {
            return instance;
        }
    }

    public static EnumRedisLock getInstance() {
        return EnumSingleton.INSTANCE.getSingleton();
    }
}
