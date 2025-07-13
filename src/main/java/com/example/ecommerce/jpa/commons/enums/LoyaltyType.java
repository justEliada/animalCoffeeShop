package com.example.ecommerce.jpa.commons.enums;

public enum LoyaltyType {
    NEW(0,0),
    BRONZE(100, 5),
    SILVER(1000, 10),
    GOLD(5000, 15),
    PLATINUM(10000, 20);

    private final int minPointsRequired;
    private final int discountPercentage;

    LoyaltyType(int minPointsRequired, int discountPercentage) {
        this.minPointsRequired = minPointsRequired;
        this.discountPercentage = discountPercentage;
    }

    public int getMinPointsRequired() {
        return minPointsRequired;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public double applyDiscount(double originalPrice) {
        return originalPrice - (discountPercentage * originalPrice / 100.0);
    }

    public static LoyaltyType getLoyaltyLevelForPoints(int points) {
        LoyaltyType currentLevel = NEW;
        for (LoyaltyType level : values()) {
            if (points >= level.minPointsRequired) {
                currentLevel = level;
            }
        }
        return currentLevel;
    }
}
