package com.cczywyc.designpattern.builder;

/**
 * use builder mode to build an object
 *
 * @author wangyc
 */
public class BuilderModeTest {
    public static void main(String[] args) {
        ResourcePoolConfig resourcePoolConfig = new ResourcePoolConfig.Builder()
                .setName("DBConnectionPool")
                .setMaxTotal(30)
                .setMaxIdle(20)
                .setMinIdle(10)
                .build();
    }
}
