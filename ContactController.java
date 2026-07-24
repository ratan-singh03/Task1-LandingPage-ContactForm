package com.example.task.controller;

import com.example.task.model.Contact;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

    @PostMapping("/contact")
    public String submitForm(@ModelAttribute Contact contact) {

        System.out.println("========== New Contact ==========");
        System.out.println("Name    : " + contact.getName());
        System.out.println("Email   : " + contact.getEmail());
        System.out.println("Message : " + contact.getMessage());
        System.out.println("=================================");

        return "Thank you, " + contact.getName()
                + "! Your message has been received successfully.";
    }
}