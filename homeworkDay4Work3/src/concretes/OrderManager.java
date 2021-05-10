package concretes;

import abstracts.OrderService;
import entities.Order;

public class OrderManager implements OrderService {
    @Override
    public void add(Order order) {
        System.out.println("Sipari� olu�turuldu.");
    }

    @Override
    public void update(Order order) {
        System.out.println("Sipari� g�ncellendi.");
    }

    @Override
    public void delete(Order order) {
        System.out.println("Sipari� silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Sipari�ler listendi say xd :).");
    }
}