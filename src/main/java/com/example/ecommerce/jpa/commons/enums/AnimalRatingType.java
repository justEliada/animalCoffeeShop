package com.example.ecommerce.jpa.commons.enums;

public enum AnimalRatingType {
    FRIENDLINESS("Friendliness"),
    PLAYFULNESS("Playfulness"),
    CLEANLINESS("Cleanliness"),
    CALMNESS("Calmness"),
    CUDDLINESS("Cuddliness"),
    RESPONSIVENESS("Responsiveness"),
    OVERALL_EXPERIENCE("Overall Experience");

    private final String description;

    AnimalRatingType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
