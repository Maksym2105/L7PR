package app.coffee;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {

    private final Queue<Order> orders = new LinkedList<>();
    private int nextOrderNumber = 1;

    public void add(String customerName) {
        orders.add(new Order(nextOrderNumber++ , customerName));
    }

    public void deliver(){
        if(orders.isEmpty()) {
            throw new IllegalStateException("There is no order to deliver");
        }else{
            orders.poll();
        }
    }

    public Order deliverByNum(int num){
        for(Order order : orders){
            if(order.getOrderId() == num){
                orders.remove();
                return order;
            }
        }
        throw new IllegalStateException("There is no order to deliver");
    }

    public void draw(){
        System.out.println("=============");
        System.out.println("Num | Name");
        for(Order order : orders){
            System.out.printf("%d | %s%n" , order.getOrderId() , order.getCustomerName());
        }
    }

    }

