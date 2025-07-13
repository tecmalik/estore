package org.estore.estore.service;

import org.estore.estore.dto.request.CreateOrderRequest;
import org.estore.estore.dto.request.FindOrderByIDRequest;
import org.estore.estore.dto.response.CreateOrderResponse;
import org.estore.estore.dto.response.FindOrderByIDResponse;

public interface OrderService {
    CreateOrderResponse create(CreateOrderRequest order);
//    FindOrderByIDResponse findOrderById(FindOrderByIDRequest orderID);
}
