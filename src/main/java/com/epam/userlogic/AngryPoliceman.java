package com.epam.userlogic;

import com.epam.framework.configuration.annotations.InjectByType;
import com.epam.framework.configuration.annotations.PostConstruct;

public class AngryPoliceman implements Policemen {
    @InjectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        //Прогоняем код после того как конструктор уже настроен
        System.out.println(recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Всех убью!");
    }
}
