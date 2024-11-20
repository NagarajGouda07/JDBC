package com.xworkz.orderform.repository;

import com.xworkz.orderform.dto.OrderDto;

public interface OrderRepo {

	boolean Save(OrderDto orderDto);

}
