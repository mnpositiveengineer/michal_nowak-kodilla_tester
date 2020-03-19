package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SubscriptionManagerTestSuite {

    SubscriptionManager subscriptionManager = new SubscriptionManager();

    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    Subscriber subscriber1 = Mockito.mock(Subscriber.class);
    Subscriber subscriber2 = Mockito.mock(Subscriber.class);

    @BeforeEach
    public void doBeforeEach() {
        subscriptionManager.addSubscriberToLocation(subscriber1, location1);
        subscriptionManager.addSubscriberToLocation(subscriber1, location2);
        subscriptionManager.addSubscriberToLocation(subscriber2, location1);
        subscriptionManager.addSubscriberToLocation(subscriber2, location2);
    }

    //1. Osoba zainteresowana moze zostac zapisana do danej lokalizacji, i zacznie otrzymywac powiadomienia.
    @Test
    public void Should_Receive_Note_For_Location_When_Added_To_Location () throws NoLocationException {
        subscriptionManager.sendLocationNote(location1);
        subscriptionManager.sendLocationNote(location2);
        Mockito.verify(subscriber1, Mockito.times(1)).receiveLocationNote(location1);
        Mockito.verify(subscriber1, Mockito.times(1)).receiveLocationNote(location2);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveLocationNote(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveLocationNote(location2);
    }

    @Test
    public void Should_Receive_General_Note_When_Added_To_Location () throws NoLocationException {
        subscriptionManager.sendGeneralNote();
        Mockito.verify(subscriber1, Mockito.times(1)).receiveGeneralNote();
        Mockito.verify(subscriber2, Mockito.times(1)).receiveGeneralNote();
    }

    @Test
    public void Should_Receive_Only_One_General_Note_When_Added_To_Multiple_Location () throws NoLocationException {
        subscriptionManager.sendGeneralNote();
        Mockito.verify(subscriber1, Mockito.times(1)).receiveGeneralNote();
        Mockito.verify(subscriber2, Mockito.times(1)).receiveGeneralNote();
    }

    @Test
    public void Should_Receive_Only_One_Location_Note_When_Added_Multiple_Times_To_Location () throws NoLocationException {
        subscriptionManager.addSubscriberToLocation(subscriber1, location1);
        subscriptionManager.addSubscriberToLocation(subscriber2, location2);
        subscriptionManager.sendLocationNote(location1);
        subscriptionManager.sendLocationNote(location2);
        Mockito.verify(subscriber1, Mockito.times(1)).receiveLocationNote(location1);
        Mockito.verify(subscriber2, Mockito.times(1)).receiveLocationNote(location2);
    }

    //2. Mozna wycofac subskrypcje z danej lokalizacji.
    @Test
    public void Should_Allow_Unsubscribe_From_Any_Location_And_Do_Not_Receive_Note_For_This_Location () throws NoLocationException {
        subscriptionManager.removeSubscriberFromLocation(subscriber1, location1);
        subscriptionManager.sendLocationNote(location1);
        subscriptionManager.sendLocationNote(location2);
        Mockito.verify(subscriber1, Mockito.times(1)).receiveLocationNote(location2);
        Mockito.verify(subscriber1, Mockito.never()).receiveLocationNote(location1);
    }

    //3. Mozna wycofac subskrypcje ze wszystkich lokalizacji, co równa sie kompletnemu wypisaniu klienta z powiadomien.
    @Test
    public void Should_Allow_Unsubscribe_From_Every_Location_And_Do_Not_Receive_General_Notes () {
        subscriptionManager.removeSubscriberFromAllLocation(subscriber1);
        Mockito.verify(subscriber1, Mockito.never()).receiveGeneralNote();
    }

    @Test
    public void Should_Allow_Unsubscribe_From_Every_Location_And_Do_Not_Receive_Notes_For_Locations () {
        subscriptionManager.removeSubscriberFromAllLocation(subscriber1);
        Mockito.verify(subscriber1, Mockito.never()).receiveLocationNote(location1);
        Mockito.verify(subscriber1, Mockito.never()).receiveLocationNote(location2);
    }

    //4. Powiadomienie dla osób w danej lokalizacji powinno dotrzec tylko do okreslonej grupy osób.
    @Test
    public void Should_Not_Receive_Note_For_Location_While_Not_Subscribing_This_Location () {
        Mockito.verify(subscriber1, Mockito.never()).receiveLocationNote(location2);
        Mockito.verify(subscriber2, Mockito.never()).receiveLocationNote(location1);
    }

    //5. Mozliwosc wysylki powiadomienia do wszystkich.
    @Test
    public void Should_Allow_Remove_Location_And_Users_From_This_Location_Will_Not_Be_Receiving_Notes_About_This_Location () throws NoLocationException {
        subscriptionManager.removeLocation(location1);
        Mockito.verify(subscriber1, Mockito.never()).receiveLocationNote(location1);
        Mockito.verify(subscriber2, Mockito.never()).receiveLocationNote(location1);
    }

    //6. Mozliwosc skasowania danej lokalizacji.
    @Test
    public void Should_Allow_Remove_Location_And_Users_From_This_Location_Will_Be_Still_Receiving_General_Notes () throws NoLocationException {
        subscriptionManager.removeLocation(location1);
        subscriptionManager.sendGeneralNote();
        Mockito.verify(subscriber1, Mockito.times(1)).receiveGeneralNote();
        Mockito.verify(subscriber2, Mockito.times(1)).receiveGeneralNote();
    }

    //7. Sprawdzenia wyjątków

    @Test
    public void Should_Return_Exception_When_There_Is_No_Person_In_Location_To_Send_Note() throws NoLocationException {
        subscriptionManager.removeLocation(location1);
        try {
            subscriptionManager.sendLocationNote(location1);
        } catch (NoLocationException e) {}
    }

    @Test
    public void Should_Return_Exception_When_There_Is_No_Location_That_We_Try_To_Send_Note() throws NoLocationException {
        subscriptionManager.removeLocation(location1);
        try {
            subscriptionManager.sendLocationNote(location1);
        } catch (NoLocationException e){}
    }

    @Test
   public void Should_Return_Exception_When_There_Is_No_Person_In_Any_Location_To_Send_General_Note() throws NoLocationException {
        subscriptionManager.removeLocation(location1);
        subscriptionManager.removeLocation(location2);
        try {
            subscriptionManager.sendGeneralNote();
        } catch (NoLocationException e) {
        }
    }

    @Test
    public void Should_Return_Exception_When_We_Try_To_Unsubscribe_The_Location_That_We_Are_Not_In() throws NoLocationException {
        subscriptionManager.removeSubscriberFromLocation(subscriber1, location1);
        try {
            subscriptionManager.removeSubscriberFromLocation(subscriber1, location1);
        } catch (NoLocationException e) {
        }
    }

    @Test
    public void Should_Return_Exception_When_We_Try_To_Unsubscribe_The_Location_That_Does_Not_Exist() throws NoLocationException {
        subscriptionManager.removeLocation(location1);
        try {
            subscriptionManager.removeSubscriberFromLocation(subscriber1, location1);
        } catch (NoLocationException e) {
        }
    }

    @Test
    public void Should_Return_Exception_When_We_Try_To_Remove_Location_That_Does_Not_Exist() {
        try {
            subscriptionManager.removeLocation(location1);
        } catch (NoLocationException e) {
        }
    }
}