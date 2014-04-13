package com.github.kospiotr.spring;

import javax.inject.Inject;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Piotr
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-configuration.xml"})
public class BillingServiceTest {

    @Inject
    BillingService billingService;

    @Test
    public void shouldNotProcessPaymentWithNegativeAmount() {
        Payment payment = new Payment("Test", "123", "321", -10);

        boolean result = billingService.processPayment(payment);

        assertFalse(result);
    }

    @Test
    public void shouldNotProcessPaymentWithoutDescription() {
        Payment payment = new Payment(null, "123", "321", 10);

        boolean result = billingService.processPayment(payment);

        assertFalse(result);
    }
}
