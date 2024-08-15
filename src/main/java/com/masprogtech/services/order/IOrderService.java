package com.masprogtech.services.order;


import com.masprogtech.entities.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);
}
