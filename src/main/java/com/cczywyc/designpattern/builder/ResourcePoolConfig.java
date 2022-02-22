package com.cczywyc.designpattern.builder;

import org.apache.commons.lang3.StringUtils;

/**
 * builder mode
 *
 * @author wangyc
 */
public class ResourcePoolConfig {

    /**
     * resource name
     */
    private String name;
    /**
     * max total resource number
     */
    private int maxTotal;
    /**
     * max idle resource number
     */
    private int maxIdle;
    /**
     * min idle resource number
     */
    private int minIdle;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public String getName() {
        return name;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public static class Builder {
        /**
         * default max total resource number
         */
        private static final int DEFAULT_MAX_TOTAL = 8;
        /**
         * default max idle resource number
         */
        private static final int DEFAULT_MAX_IDLE = 8;
        /**
         * default min idle resource number
         */
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig build() {
            //Calibration Logic
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("name is not be empty");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("....");
            }
            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("....");
            }

            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("...");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle <= 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle <= 0) {
                throw new IllegalArgumentException("...");
            }
            this.minIdle = minIdle;
            return this;
        }
    }
}
