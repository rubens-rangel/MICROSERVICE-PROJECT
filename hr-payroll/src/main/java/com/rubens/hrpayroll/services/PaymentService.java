package com.rubens.hrpayroll.services;

import com.rubens.hrpayroll.entities.Payment;
import com.rubens.hrpayroll.entities.Worker;
import com.rubens.hrpayroll.feignclients.WorkerFeigncClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeigncClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
