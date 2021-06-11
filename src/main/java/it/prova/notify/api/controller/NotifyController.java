package it.prova.notify.api.controller;




import it.prova.notify.model.User;
import it.prova.notify.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(path = "api/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class NotifyController {

    @Autowired
    private NotifyService notifyService;


    @GetMapping(path = "test")
    public String test() {
        return "OK";
    }

    @PostMapping(path = "sendmailconfirmregistration")
    public ResponseEntity<String> sendMailConfirmRegistration(@RequestBody User user) {

        notifyService.sendMailConfirmRegistration(user.getEmail(), user.getFirstName(), user.getLastName());


        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
