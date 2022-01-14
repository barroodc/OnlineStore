package com.solvd.onlineshop.enums;

public enum Jobs {
    ADMINISTRATIVE_ASSISTANT("Administrative Assistant"), BUSINESS_ANALYST("Business Analyst"),
    COMMUNITY_BUILDER("Community Builder"), CUSTOMER_SATISFACTION_MANAGER("Customer Satisfaction Manager"), CUSTOMER_SERVICE_REPRESENTATIVE("Customer Service Representative"),
    DIGITAL_MARKETING_MANAGER("Digital Marketing Manager"), DIGITAL_OPERATIONS_MANAGER("Digital Operations Manager"), DIRECTOR_OF_ECOMMERCE("Director of Ecommerce"),
    FINANCIAL_MANAGER("Financial Manager"), FRONT_END_WEB_DEVELOPER("Front End Web Developer"), GRAPHIC_DESIGNER("Graphic Designer"),
    IT_TECHNICIAN("IT Technician"), MARKETING_SPECIALIST("Marketing Specialist"), NOTHING_FOUND("Nothing Found"),
    RETENTION_SPECIALIST("Retention Specialist"), SEO_CONTENT_WRITER("SEO Content Writer"),
    SOFTWARE_DEVELOPER("Software Developer"), SUPPLY_CHAIN_MANAGER("Supply Chain Manager"),
    USER_EXPERIENCE_DESIGNER("User Experience Designer"), WAREHOUSE_WORKER("Warehouse Worker");

    private String title;

    Jobs(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public static Jobs valueOfName(final String title) {
        final String enumName = title.toUpperCase().replaceAll(" ", "_");
        try {
            return valueOf(enumName);
        } catch (final IllegalArgumentException e) {
            return Jobs.NOTHING_FOUND;
        }
    }


    @Override
    public String toString() {
        return "Jobs{" +
                "Title='" + title + '\'' +
                '}';
    }
}
