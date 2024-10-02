package entities;

import entitiesEnum.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;
    
    private Client client;
    private List<OrderItem> items = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public Order(){
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

    public List<OrderItem> getItems() {
        return items;
    }
    
    public void addItem(OrderItem item){
        items.add(item);
    }
    
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    
    public Double total(){
        double sum = 0;
        for (OrderItem o : items){
            sum += o.subTotal();
        }
        return sum;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)+"\n");
        sb.append("Order status: ");
        sb.append(status+"\n");
        sb.append("Client: ");
        sb.append(client.toString()+"\n");
        sb.append("Order items: \n");
        for (OrderItem o : items){
            sb.append(o.getProduct().toString()+o.toString()+"\n");
        }
        sb.append(String.format("Total price: $%.2f",total()));
        
        return sb.toString();
    }
}
