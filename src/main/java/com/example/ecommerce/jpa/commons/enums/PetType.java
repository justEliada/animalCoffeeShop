package com.example.ecommerce.jpa.commons.enums;

    public enum PetType {
        CAT("Cat"),
        DOG("Dog"),
        RABBIT("Rabbit"),
        OTHER("Other");

        private final String displayName;

        PetType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }

        @Override
        public String toString() {
            return displayName;
        }
    }


