package com.solvd.onlineshop.enums;

public enum ProductCategories {
    CHESS_BOARDS("Chess Boards"), CHESS_BOXES("Chess Boxes"), CHESS_EDUCATION("Chess Education"),
    CHESS_PIECES("Chess Pieces"), CHESS_SETS("Chess Sets"), CHESS_TABLES("Chess Tables"),
    ELECTRONICS("Electronics"), NOTHING_FOUND("Nothing Found"), SUPPLIES("Supplies");

    private String categoryName;

    ProductCategories(String categoryName) {
        this.setCategoryName(categoryName);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public static ProductCategories valueOfName(final String productName) {
        final String enumName = productName.toUpperCase().replaceAll(" ", "_");
        try {
            return valueOf(enumName);
        } catch (final IllegalArgumentException e) {
            return ProductCategories.NOTHING_FOUND;
        }
    }

    @Override
    public String toString() {
        return "ProductCategories{" +
                "Category Name='" + categoryName + '\'' +
                '}';
    }
}
