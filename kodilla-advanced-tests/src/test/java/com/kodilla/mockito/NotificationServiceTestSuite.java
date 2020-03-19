package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import com.kodilla.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void NotSubscribedClientShouldNotReceiveNotification (){

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }

    @Test
    public void SubscribedClientShouldReceiveNotification (){

        notificationService.addSubscriber(client);
        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void NotificationShouldBeSentToAllSubscribedClients (){

        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);

        notificationService.addSubscriber(client);
        notificationService.addSubscriber(secondClient);
        notificationService.addSubscriber(thirdClient);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);

    }

    @Test
    public void ShouldSendOnlyOneNotificationToMultiTimeSubscribers (){

        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void UnsubscribedClientsShouldNotReceiveNotification (){
        notificationService.addSubscriber(client);
        notificationService.unsubscribeSubscriber(client);
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }

}
