package com.hamilton.e_commerce.payment;

import com.hamilton.e_commerce.customer.CustomerResponse;
import com.hamilton.e_commerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
