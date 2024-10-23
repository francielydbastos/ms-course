package com.francielydbastos.hr_payroll.services;

import com.francielydbastos.hr_payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return new Payment("Nome", 200.0, days);
    }
}
