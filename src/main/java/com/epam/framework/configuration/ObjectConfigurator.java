package com.epam.framework.configuration;

import com.epam.framework.ApplicationContext;

public interface ObjectConfigurator {
    //Механизм настройки созданных объектов
    void configure(Object t, ApplicationContext context);
}
