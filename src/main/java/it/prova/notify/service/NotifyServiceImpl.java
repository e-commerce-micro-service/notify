package it.prova.notify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMailConfirmRegistration(String email, String firstName, String lastName) {

        String subject = "Registration Success";
        String text = "Mr/Miss " + firstName + " " + lastName + " your registration it's completed";

        sendEmail(email, subject, text);

    }


    private void sendEmail(String reciver, String subject, String text) {
        System.out.println("Sending Email...");

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(reciver);

        msg.setSubject(subject);
        msg.setText(text);

        javaMailSender.send(msg);
        System.out.println("Done");

    }
}
