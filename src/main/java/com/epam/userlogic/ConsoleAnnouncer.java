package com.epam.userlogic;

import com.epam.framework.configuration.annotations.InjectByType;

public class ConsoleAnnouncer implements Announcer {
    @InjectByType
    private Recommendator recommendator;

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
