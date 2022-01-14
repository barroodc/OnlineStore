package com.solvd.onlineshop.enums;


public enum OrderStatus {

    AWAITING_FULFILLMENT("Awaiting Fulfillment"), AWAITING_PAYMENT("Awaiting Payment"), AWAITING_PICKUP("Awaiting Pickup"),
    AWAITING_SHIPMENT("Awaiting Shipment"), CANCELLED("Cancelled"), COMPLETED("Completed"),
    DECLINED("Declined"), DISPUTED("Disputed"), MANUAL_VERIFICATION_REQUIRED("Manual Verification Required"), NOTHING_FOUND("Nothing Found"), PARTIALLY_REFUNDED("Partially Refunded"),
    PARTIALLY_SHIPPED("Partially Shipped"), PENDING("Pending"), REFUNDED("Refunded"),
    SHIPPED("Shipped");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static OrderStatus valueOfName(final String status) {
        final String enumName = status.toUpperCase().replaceAll(" ", "_");
        try {
            return valueOf(enumName);
        } catch (final IllegalArgumentException e) {
            return OrderStatus.NOTHING_FOUND;
        }
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "Status='" + status + '\'' +
                '}';
    }
}
