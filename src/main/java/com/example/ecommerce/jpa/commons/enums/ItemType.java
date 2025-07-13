package com.example.ecommerce.jpa.commons.enums;

public enum ItemType {
    DESSERT("des", ProductCategory.HUMANFOOD),
    COFFEE("cof", ProductCategory.HUMANFOOD),
    TEA("tea", ProductCategory.HUMANFOOD),
    SANDWICH("san", ProductCategory.HUMANFOOD),
    SMOOTHIE("smo", ProductCategory.HUMANFOOD),
    PASTRY("pas", ProductCategory.HUMANFOOD),

    DOGFOOD("dog", ProductCategory.ANIMALFOOD),
    CATFOOD("cat", ProductCategory.ANIMALFOOD),
    DOGTREATS("dtr", ProductCategory.ANIMALFOOD),
    CATTREATS("ctr", ProductCategory.ANIMALFOOD),
    PETWATER("wat", ProductCategory.ANIMALFOOD),

    PUPCCINO("pup", ProductCategory.ANIMALFOOD),
    CATLATTE("lat", ProductCategory.ANIMALFOOD);

    private final String code;
    private final ProductCategory category;

    ItemType(String code, ProductCategory category) {
        this.code = code;
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public ProductCategory getCategory() {
        return category;
    }
}
