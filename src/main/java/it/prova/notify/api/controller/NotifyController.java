package it.prova.notify.api.controller;


import it.prova.notify.EmailUtil;
import it.prova.notify.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.Session;
import java.util.Properties;

@RestController
@RequestMapping(path = "api/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class NotifyController {


    @GetMapping(path = "test")
    public String test() {
        return "OK";
    }

    @PostMapping(path = "sendmailconfirmregistration")
    public ResponseEntity<String> sendMailConfirmRegistration(@RequestBody User user) {

        System.out.println("SimpleEmail Start");

        String smtpHostServer = "localhost";
        String emailID = user.getEmail();

        Properties props = System.getProperties();

        props.put("localhost", smtpHostServer);

        Session session = Session.getInstance(props, null);

        String mailText = "Gentile " + user.getFirstName() + " " + user.getLastName() + " la registrazione è avvenuta con successo";

        EmailUtil.sendEmail(session, emailID, "Registrazione effettuata", mailText);


        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
