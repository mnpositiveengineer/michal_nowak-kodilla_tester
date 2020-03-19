package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SubscriptionManager {

    private Map<Location, Set<Subscriber>> generalSubscription = new HashMap<>();

    public void addSubscriberToLocation(Subscriber subscriber, Location location) {
        if (generalSubscription.containsKey(location)) {
            generalSubscription.get(location).add(subscriber);
        } else {
            Set<Subscriber> newLocation = new HashSet<>();
            newLocation.add(subscriber);
            generalSubscription.put(location, newLocation);
        }
    }

    public void removeSubscriberFromLocation(Subscriber subscriber, Location location) throws NoLocationException {
        if (generalSubscription.containsKey(location)) {
            generalSubscription.get(location).remove(subscriber);
        } else {
            throw new NoLocationException();
        }
    }

    public void removeSubscriberFromAllLocation(Subscriber subscriber) {
        for(Map.Entry<Location, Set<Subscriber>> locations : generalSubscription.entrySet()){
            locations.getValue().remove(subscriber);
        }
    }

    public void removeLocation (Location location) throws NoLocationException {
        if (generalSubscription.containsKey(location)) {
            Set<Subscriber> temporaryList = generalSubscription.get(location).stream().collect(Collectors.toSet());
            generalSubscription.remove(location);
            Location temporaryLocation = null;
            if (generalSubscription.containsKey(temporaryLocation)) {
                for (Subscriber subscriber : temporaryList) {
                    generalSubscription.get(temporaryLocation).add(subscriber);
                }
            } else {
                generalSubscription.put(temporaryLocation, temporaryList);
            }
        } else {
            throw new NoLocationException();
        }
    }

    public void sendLocationNote (Location location) throws NoLocationException {
        if (generalSubscription.containsKey(location)) {
            for (Subscriber subscriber : generalSubscription.get(location)) {
                subscriber.receiveLocationNote(location);
            }
        } else {
            throw new NoLocationException();
        }
    }

    public void sendGeneralNote () throws NoLocationException {
        if (generalSubscription.isEmpty()){
            throw new NoLocationException();
        } else {
            Set<Subscriber> setOfSubscribers = new HashSet<>();
            for (Map.Entry<Location, Set<Subscriber>> subscriber : generalSubscription.entrySet()) {
                setOfSubscribers = subscriber.getValue().stream().collect(Collectors.toSet());
            }
            for (Subscriber subscriber : setOfSubscribers) {
                subscriber.receiveGeneralNote();
            }
        }
    }
}
