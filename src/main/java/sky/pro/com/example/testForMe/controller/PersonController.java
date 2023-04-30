package sky.pro.com.example.testForMe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.com.example.testForMe.service.PersonService;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public String getPersonInfo(@RequestParam("number") Integer number) {
        final String person;
        person = personService.getPerson(number);
        return person;
    }
}
