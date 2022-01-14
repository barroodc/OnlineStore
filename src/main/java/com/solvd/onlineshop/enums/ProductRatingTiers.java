package com.solvd.onlineshop.enums;

public enum ProductRatingTiers {
    HIGHLY_DISSATISFIED("Highly Dissatisfied"), DISSATISFIED("Dissatisfied"), NEUTRAL("Neutral"),
    SATISFIED("Satisfied"), HIGHLY_SATISFIED("Highly Satisfied"), NOTHING_FOUND("Nothing Found");

    private String ratingTier;

    ProductRatingTiers(String ratingTier) {
        this.setRatingTier(ratingTier);
    }

    public String getRatingTier() {
        return ratingTier;
    }

    public void setRatingTier(String ratingTier) {
        this.ratingTier = ratingTier;
    }

    public static ProductRatingTiers valueOfName(final String ratingTier) {
        final String enumName = ratingTier.toUpperCase().replaceAll(" ", "_");
        try {
            return valueOf(enumName);
        } catch (final IllegalArgumentException e) {
            return ProductRatingTiers.NOTHING_FOUND;
        }
    }

    @Override
    public String toString() {
        return "ProductRatingTiers{" +
                "Rating tier='" + ratingTier + '\'' +
                '}';
    }
}
