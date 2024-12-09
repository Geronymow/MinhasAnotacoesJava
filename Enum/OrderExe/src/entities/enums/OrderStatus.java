package entities.enums;

public enum OrderStatus {

    PENDING_PAYMENT("Pending Payment"),
    PROCESSING("Processing"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered");

    private final String status;

    OrderStatus(String Status) {
        this.status = Status;
    }

    public String getStatus() {
        return status;
    }

    public static OrderStatus ignoreCase(String status) {
        OrderStatus os1 = null;
        if (status != null) {
            for (OrderStatus os : OrderStatus.values()) {
                if (os.status.equalsIgnoreCase(status)) {
                    return os;
                }
                os1 = os;
            }
        }
        return os1;
    }
}
