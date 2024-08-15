package com.masprogtech.services.order;


import com.masprogtech.dtos.OrderDto;
import com.masprogtech.entities.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
