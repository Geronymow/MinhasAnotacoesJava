package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private static List<OrderItem> orderList = new ArrayList<>();
    private OrderItem orderItem;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, OrderItem orderItem) {
        this.moment = moment;
        this.status = status;
        this.orderItem = orderItem;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }


    public static List<OrderItem> getOrderList() {
        return orderList;
    }

    public void addOrderInList(OrderItem orderItem) {
        orderList.add(orderItem);
    }

    public void RemoveOrderInList(OrderItem orderItem) {
        orderList.remove(orderItem);
    }

    public double total(double v) {
        double totalValue = 0;
        for (OrderItem orderItem: orderList){
           totalValue += orderItem.subTotal();
        }
        return totalValue;
    }

    public String print() {
        return "Total Price: " + total(getOrderItem().subTotal());
    }

}

