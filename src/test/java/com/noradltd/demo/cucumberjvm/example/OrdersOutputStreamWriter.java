package com.noradltd.demo.cucumberjvm.example;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class OrdersOutputStreamWriter {

	public void write(List<Order> orders, OutputStream ordersOutputStream) {
		for (Order order : orders) {
			try {
				ordersOutputStream.write(order.toString().getBytes());
				ordersOutputStream.write(System.getProperty("line.separator").getBytes());
			} catch (IOException e) {
				//bury
			}
		}
	}

}
