package com.sda.project.controller;

import com.sda.project.model.Payment;
import com.sda.project.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/payments")
    public String getPaymentsPage(Model model) {
        model.addAttribute("payments", paymentService.findAll());

        return "payment/payments";
    }

    @GetMapping("/payments/add")
    public String getAddForm(Model model) {
        model.addAttribute("payment", new Payment());
        return "payment/payment-add";
    }

    @PostMapping("/payments/add")
    public String addPaymentForm(@ModelAttribute("payment") Payment payment) {
        paymentService.save(payment);
        return "redirect:/payments";
    }

}
