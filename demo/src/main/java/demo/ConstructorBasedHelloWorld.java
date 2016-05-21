package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mark on 2/6/2016.
 */
@Component
public class ConstructorBasedHelloWorld {
    private HelloWorldService helloWorldService;

    @Autowired
    public ConstructorBasedHelloWorld(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(){
        helloWorldService.sayHello();
    }
}
