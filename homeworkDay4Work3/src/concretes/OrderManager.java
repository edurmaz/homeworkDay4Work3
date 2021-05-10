package concretes;

import abstracts.OrderService;
import entities.Order;

public class OrderManager implements OrderService {
    @Override
    public void add(Order order) {
        System.out.println("Sipariþ oluþturuldu.");
    }

    @Override
    public void update(Order order) {
        System.out.println("Sipariþ güncellendi.");
    }

    @Override
    public void delete(Order order) {
        System.out.println("Sipariþ silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Sipariþler listendi say xd :).");
    }
}