package com.epam.userlogic;

import com.epam.framework.configuration.annotations.InjectByType;

@Deprecated
public class CoronaDesinfector {
    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policemen policeman;

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вон!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Вы можете рискнуть зайти обратно в комнату!");
    }

    private void desinfect(Room room) {
        System.out.println("Зачитывается молитва: 'корона изыди!' - молитва прочитана, вирус низвергнут в ад");
    }
}
