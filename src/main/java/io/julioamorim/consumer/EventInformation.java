package io.julioamorim.consumer;

import io.julioamorim.model.Events;

public class EventInformation {

    private Events event;
    private String emailAddress;


    @Override
    public String toString() {
        return "EventInformation{" +
                "event=" + event +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}