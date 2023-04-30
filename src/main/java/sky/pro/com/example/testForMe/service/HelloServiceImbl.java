package sky.pro.com.example.testForMe.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImbl {
    public String hello(){
        return "<b>hello<b>";
    }
    public String answerHello(String userName){
        return "<b>answer hello<b>" + userName;
    }
}
