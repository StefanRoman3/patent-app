package com.sda.project;

import com.sda.project.model.Patent;
import com.sda.project.model.Payment;
import com.sda.project.model.User;
import com.sda.project.service.PatentService;
import com.sda.project.service.PaymentService;
import com.sda.project.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AcceptanceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private PatentService patentService;

    @Autowired
    private PaymentService paymentService;

    @Test
    void acceptanceTest() {
        User user = userService.findByEmail("user@gmail.com");

        // create patents
        Patent patent1 = new Patent("patent1", "description1", "Romania");
        patent1.setUser(user);
        Patent patent2 = new Patent("patent2", "description2", "England");
        patent2.setUser(user);
        patentService.save(patent1);
        patentService.save(patent2);

        // pay patent
        Payment payment = new Payment(LocalDate.now(), 20.5);
        payment.setPatent(patent1);
        paymentService.save(payment);

        assertThat(payment.getId()).isNotNull();
        assertThat(payment.getPatent().getId()).isNotNull();
    }
}