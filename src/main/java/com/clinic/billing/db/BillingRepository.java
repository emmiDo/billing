package com.clinic.billing.db;

import com.clinic.billing.beans.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
