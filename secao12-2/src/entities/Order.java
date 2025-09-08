package entities;

import entities.enums.OrderStatus;
import entities.Client;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : orderItems) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("ORDER SUMARY: \n");
        sb.append("Order Moment: " + sdf.format(moment) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append(client.toString());
        sb.append("Order Items: \n");
        for (OrderItem item : orderItems) {
            sb.append(item.toString());
        }
        sb.append("\n");
        sb.append("Total Price: " + total());
        return sb.toString();
    }
}
