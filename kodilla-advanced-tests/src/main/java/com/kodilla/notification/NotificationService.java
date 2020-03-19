package com.kodilla.notification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificationService {

    private Set<Client> clients = new HashSet<>();

    public void addSubscriber(Client client){
        clients.add(client);
    }

    public void unsubscribeSubscriber(Client client){
        clients.remove(client);
    }

    public void sendNotification(Notification notification){
        for (Client client : clients){
            client.receive(notification);
        }
    }
}
