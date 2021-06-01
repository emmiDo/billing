package com.clinic.billing.controller;

import com.clinic.billing.beans.Billing;
import com.clinic.billing.db.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/api")
public class BillingController {

    @Autowired
    BillingRepository billingRepository;

    @PostMapping("/billings")
    public ResponseEntity<Billing> createRetailer(@RequestParam(required = true) long visitId) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Date billedTime = new Date(currentTimeMillis);

            Billing _billing = billingRepository.save(
                    new Billing(visitId, billedTime));
            return new ResponseEntity<>(_billing, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
