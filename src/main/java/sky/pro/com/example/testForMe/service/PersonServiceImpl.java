package sky.pro.com.example.testForMe.service;

import org.springframework.stereotype.Service;
import sky.pro.com.example.testForMe.domain.Driver;
import sky.pro.com.example.testForMe.domain.Person;
import sky.pro.com.example.testForMe.domain.TruckDriver;


import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    List<Person> persons = new ArrayList<>(List.of(
        new Person("жан", "рено", "1234",2),
                new Person("люк", "бессон", "68534",3),
                new Person("жерар", "депардье", "44187",0),
                new Driver("джейсон", "стетхем", "44187", "3568",2),
                new TruckDriver("роберт", "патрикк", "1000", "24597",4)

    ));
    String[] professions = {
            "безработный","водитель","плотник", "столяр",
    };

    @Override
    public String getPerson(Integer number) {
        final Person person;
        if(number>= persons.size()){}
        person = persons.get(number);
        final String personDescriptoin = " " + person.getName() + " " + person.getSurname() + " " + person.getPassport()+professions[person.getProfessionNumber()];
        return personDescriptoin;

    }
}
