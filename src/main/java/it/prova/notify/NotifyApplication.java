package it.prova.notify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.Session;
import java.io.IOException;
import java.util.Properties;


import java.util.Properties;

import javax.mail.Session;

@SpringBootApplication
public class NotifyApplication implements CommandLineRunner{

    @Autowired
    private JavaMailSender javaMailSender;


    public static void main(String[] args) {
        SpringApplication.run(NotifyApplication.class, args);
    }



        @Override
        public void run(String... args) {

            System.out.println("Sending Email...");



                sendEmail();
                //sendEmailWithAttachment();



            System.out.println("Done");

        }

        void sendEmail() {

            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setTo("1@gmail.com", "2@yahoo.com");

            msg.setSubject("Testing from Spring Boot");
            msg.setText("Hello World \n Spring Boot Email");

            javaMailSender.send(msg);

        }
    }

