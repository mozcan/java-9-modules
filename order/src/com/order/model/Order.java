package com.order.model;

import java.time.LocalDate;

public record Order(String bookName, LocalDate orderDate) {
}
