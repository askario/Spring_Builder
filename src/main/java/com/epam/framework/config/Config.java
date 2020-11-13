package com.epam.framework.config;

import org.reflections.Reflections;

public interface Config {
    //Конфиг содержит информацию о том, какие пакеты надо сканировать и какие имплементации есть
    <T> Class<? extends T> getImplClass(Class<T> ifc);

    Reflections getScanner();
}
