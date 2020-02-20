package com.ifpb.edu;

import com.ifpb.edu.config.PicoInit;
import com.ifpb.edu.service.HelloService;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class app {

    public static void main(String[] args) {
        HelloService service = PicoInit.context().getComponent(HelloService.class);
        System.out.println(service.hello("Dudxs"));
    }

}
