package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mark on 2/6/2016.
 */
@Component
public class SetterBasedHelloWorld {

    private HelloWorldService setterBasedHelloWorld;

    @Autowired
    public void setSetterBasedHelloWorld(HelloWorldService setterBasedHelloWorld) {
        this.setterBasedHelloWorld = setterBasedHelloWorld ;
    }

    public void getMessage() {
        setterBasedHelloWorld.sayHello();
    }


}
