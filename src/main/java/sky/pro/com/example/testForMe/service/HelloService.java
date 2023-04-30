package sky.pro.com.example.testForMe.service;

import org.springframework.stereotype.Service;

@Service
public interface HelloService {
    String hello();
    String answerHello(String userName);
}
