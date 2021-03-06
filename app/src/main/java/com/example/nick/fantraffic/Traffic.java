package com.example.nick.fantraffic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nick on 16/10/15.
 */
class Traffic {
    String flow;
    String duration;

    Traffic(String flow, String duration){
        this.flow = flow;
        this.duration = duration;
    }

    private static int lastContactId = 0;

    public static List<Traffic> createContactsList(int numContacts) {
        List<Traffic> traffic = new ArrayList<>();

        for (int i = 1; i <= numContacts; i++) {
            traffic.add(new Traffic("Traffic " + ++lastContactId, "email.com"));
        }

        return traffic;
    }
}
