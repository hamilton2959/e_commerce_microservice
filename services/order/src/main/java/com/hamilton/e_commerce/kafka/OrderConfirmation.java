package com.hamilton.e_commerce.kafka;

import com.hamilton.e_commerce.customer.CustomerResponse;
import com.hamilton.e_commerce.order.PaymentMethod;
import com.hamilton.e_commerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
