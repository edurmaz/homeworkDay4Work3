package abstracts;

import entities.Order;

public interface OrderService {
    void add(Order order);

    void delete(Order order);

    void update(Order order);

    void getAll();
}