import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

    private Integer id;
    private LocalDateTime moment;
    private OrderStatus status;

    public Order() {
    }
    public Order(Integer id, LocalDateTime moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public String toString(DateTimeFormatter formatter) {
        return "=========== ORDER ========== " + "\n" +
                "Id = " + id + "\n" +
                "Moment = " + (moment.format(formatter)) + "\n" +
                "Status = " + status.getDescription() + "\n";
    }
}
