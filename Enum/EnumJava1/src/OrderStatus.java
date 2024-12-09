public enum OrderStatus {
    //Enum trabalha com constantes semelhantes, onde facilita o código.

    PENDING_PAYMENT("Pendente para pagamento"),
    PROCESSING("Em processamento"),
    SHIPPED("Enviado"),
    DELIVERED("Entregue");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
