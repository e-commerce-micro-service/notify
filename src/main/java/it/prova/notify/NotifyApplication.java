package it.prova.notify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.Session;
import java.util.Properties;


import java.util.Properties;

import javax.mail.Session;

@SpringBootApplication
public class NotifyApplication {


    public static void main(String[] args) {
        SpringApplication.run(NotifyApplication.class, args);
    }


}
