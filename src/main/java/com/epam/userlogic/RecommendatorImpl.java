package com.epam.userlogic;

import com.epam.framework.configuration.annotations.InjectProperty;
import com.epam.framework.configuration.annotations.Singleton;
import com.epam.userlogic.Recommendator;

@Singleton
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("wisky")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from covid-2019 drink: " + alcohol);
    }
}
