package com.epam.framework.runner;

import com.epam.framework.ApplicationContext;
import com.epam.framework.ObjectFactory;
import com.epam.framework.config.Config;
import com.epam.framework.config.JavaConfig;

import java.util.Map;

public class Application {
    public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        Config config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        //todo homework - implement all singletons which are not lazy
        //todo - Просканировать покеты, где аннотация синглтон, засунуть в контекст
        context.setFactory(objectFactory);

        return context;
    }
}
