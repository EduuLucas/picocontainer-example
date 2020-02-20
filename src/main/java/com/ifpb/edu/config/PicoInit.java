package com.ifpb.edu.config;

import com.ifpb.edu.service.impl.CapslockServiceImpl;
import com.ifpb.edu.service.impl.HelloServiceImpl;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoContainer;
import org.picocontainer.behaviors.Caching;

public class PicoInit {

    private static MutablePicoContainer pico;

    public static PicoContainer context() {
        if (pico == null) initialize();
        return pico;
    }

    private static void initialize() {
        pico = new DefaultPicoContainer(new Caching());
        pico.addComponent(CapslockServiceImpl.class);
        pico.addComponent(HelloServiceImpl.class);
    }

}
