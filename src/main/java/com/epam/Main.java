package com.epam;

import com.epam.framework.ApplicationContext;
import com.epam.framework.runner.Application;
import com.epam.userlogic.AngryPoliceman;
import com.epam.userlogic.CoronaDesinfector;
import com.epam.userlogic.Policemen;
import com.epam.userlogic.Room;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.epam", new HashMap<>(Map.of(Policemen.class, AngryPoliceman.class)));
        CoronaDesinfector coronaDesinfector = context.getObject(CoronaDesinfector.class);
        coronaDesinfector.start(new Room());
    }
}
