package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Assertions;
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


    @Test
    public void Should_Receive_Note_For_Location_When_Added_To_Location () throws NoLocationException {
        /*
               Test Case:
                 1. Add subscriber 1 to location 1
                 2. Send notification to location 1
               Expected result:
                 1. Subscriber 1 receives notification
        */
        subscriptionManager.sendLocationNote(location1);
        verifyOneTimeReceiveLocationNote(subscriber1, location1);
    }

    @Test
    public void Should_Receive_General_Note_When_Added_To_Location () throws NoLocationException {
        /*
                Test Case:
                    1. Add subscriber 1 to location 1
                    2. Send general notification
                Expected result:
	                1. Subscriber 1 receives general notification
        */
        subscriptionManager.sendGeneralNote();
        verifyOneTimeReceiveGeneralNote(subscriber1);
    }

    @Test
    public void Should_Receive_Only_One_General_Note_When_Added_To_Multiple_Location () throws NoLocationException {
                /*
                Test Case:
                    1. Add subscriber 1 to location 1
                    2. Add subscriber 1 to location 2
                    3. Send general note.
                Expected result:
	                1. Subscriber 1 receives only 1 notification
        */
        subscriptionManager.sendGeneralNote();
        verifyOneTimeReceiveGeneralNote(subscriber1);
    }

    @Test
    public void Should_Receive_Only_One_Location_Note_When_Added_Multiple_Times_To_Location () throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 1 to location 1
                3. Send notification to location 1
            Expected result:
                1. Subscriber 1 receives only 1 notification
        */
        subscriptionManager.addSubscriberToLocation(subscriber1, location1);
        subscriptionManager.sendLocationNote(location1);
        verifyOneTimeReceiveLocationNote(subscriber1, location1);
    }

    @Test
    public void Should_Allow_Unsubscribe_From_Any_Location_And_Do_Not_Receive_Note_For_This_Location () throws NoLocationException {
        /*
             Test Case:
                1. Add subscriber 1 to location 1
                2. Remove subscriber 1 from location 1
                2. Send notification to location 1
            Expected result:
	            1. Subscriber 1 do not receives notification.
         */
        subscriptionManager.removeSubscriberFromLocation(subscriber1, location1);
        subscriptionManager.sendLocationNote(location1);
        verifyZeroTimeReceiveLocationNote(subscriber1, location1);
    }

    @Test
    public void Should_Allow_Unsubscribe_From_Every_Location_And_Do_Not_Receive_General_Notes () throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 1 to location 2
                3. Remove subscriber 1 from every location
                4. Send general note
            Expected result:
	            1. Subscriber 1 does not receive any notification.
        */
        subscriptionManager.removeSubscriberFromAllLocation(subscriber1);
        subscriptionManager.sendGeneralNote();
        verifyZeroTimeReceiveGeneralNote(subscriber1);
    }

    @Test
    public void Should_Allow_Unsubscribe_From_Every_Location_And_Do_Not_Receive_Notes_For_Locations () throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 1 to location 2
                3. Remove subscriber 1 from every location
                4. Send notes for notification 1
                5. Send notes for notification 2
            Expected result:
	            1. Subscriber 1 does not receive anynotification.
        */
        subscriptionManager.removeSubscriberFromAllLocation(subscriber1);
        subscriptionManager.sendLocationNote(location1);
        subscriptionManager.sendLocationNote(location2);
        verifyZeroTimeReceiveLocationNote(subscriber1, location1);
        verifyZeroTimeReceiveLocationNote(subscriber1, location2);
    }

    @Test
    public void Should_Not_Receive_Note_For_Location_While_Not_Subscribing_This_Location () throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 2 to location 2
                3. Send notification for location 1
            Expected Result:
                1. Subscriber 1 receives notification
                2. Subscriber 2 does not receive notification.
        */
        subscriptionManager.sendLocationNote(location1);
        verifyOneTimeReceiveLocationNote(subscriber1, location1);
        verifyZeroTimeReceiveLocationNote(subscriber2, location2);
    }

    @Test
    public void Should_Send_General_Note_To_Everyone_in_All_Locations_Once() throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 2 to location 2
	            3. Send general note
            Expected Result:
                1. Subscriber 1 receives general note
                2. Subscriber 2 receives general note
        */
        subscriptionManager.sendGeneralNote();
        verifyOneTimeReceiveGeneralNote(subscriber1);
        verifyOneTimeReceiveGeneralNote(subscriber2);
    }

    @Test
    public void Should_Allow_Remove_Location_And_Users_From_This_Location_Will_Be_Still_Receiving_General_Notes () throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 2 to location 1
                3. Remove location 1
	            4. Send general note
            Expected Result:
	            1. Subscriber 1 receives 1 general note
	            2. Subscriber 2 receives 1 general note
        */
        subscriptionManager.removeLocation(location1);
        subscriptionManager.sendGeneralNote();
        verifyOneTimeReceiveGeneralNote(subscriber1);
        verifyOneTimeReceiveGeneralNote(subscriber2);
    }

    //WYJĄTKI

    @Test
    public void Should_Return_Exception_When_There_Is_No_Person_In_Location_To_Send_Note() throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 2 to location 1
                3. Remove subscriber 1 from location 1
                4. Remove subscriber 2 from location 1
	            4. Send notification to location 1
            Expected Result:
	            1. Return NoLocationException
        */
        subscriptionManager.removeSubscriberFromLocation(subscriber1, location1);
        subscriptionManager.removeSubscriberFromLocation(subscriber2, location1);
        Assertions.assertThrows(NoLocationException.class, () -> subscriptionManager.sendLocationNote(location1));
    }

    @Test
    public void Should_Return_Exception_When_There_Is_No_Location_That_We_Try_To_Send_Note() throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 2 to location 1
                3. Remove location 1
	            4. Send notification to location 1
            Expected Result:
	            1. Return NoLocationException
        */
        subscriptionManager.removeLocation(location1);
        Assertions.assertThrows(NoLocationException.class, () -> subscriptionManager.sendLocationNote(location1));
    }

    @Test
   public void Should_Return_Exception_When_There_Is_No_Person_In_Any_Location_To_Send_General_Note() throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 2 to location 2
                3. Remove subscriber 1 from all locations
	            4. Remove subscriber 2 from all locations
	            5. Send general note.
            Expected Result:
	            1. Return NoLocationException
        */
        subscriptionManager.removeSubscriberFromAllLocation(subscriber1);
        subscriptionManager.removeSubscriberFromAllLocation(subscriber2);

        Assertions.assertThrows(NoLocationException.class, ()->subscriptionManager.sendGeneralNote());
    }
    @Test
    public void Should_Return_Exception_When_We_Try_To_Remove_Subscriber_From_All_Locations_And_Subscriber_Is_Already_Removed() throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Add subscriber 1 to location 2
                3. Remove subscriber 1 from all locations
	            5. Remove subscriber 1 from all locations
            Expected Result:
	            1. Return NoLocationException
        */
        subscriptionManager.removeSubscriberFromAllLocation(subscriber1);
        Assertions.assertThrows(NoLocationException.class, ()->subscriptionManager.removeSubscriberFromAllLocation(subscriber1));
    }


    @Test
    public void Should_Return_Exception_When_We_Try_To_Unsubscribe_The_Location_That_We_Are_Not_In() throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Remove subscriber 1 from location 1
	            3. Remove subscriber 1 from location 1
            Expected Result:
	            1. Return NoLocationException
        */
        subscriptionManager.removeSubscriberFromLocation(subscriber1, location1);
        Assertions.assertThrows(NoLocationException.class, ()->subscriptionManager
                .removeSubscriberFromLocation(subscriber1, location1));
    }

    @Test
    public void Should_Return_Exception_When_We_Try_To_Unsubscribe_The_Location_That_Does_Not_Exist() throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Remove location 1.
	            3. Remove subscriber 1 from location 1
            Expected Result:
	            1. Return NoLocationException
        */
        subscriptionManager.removeLocation(location1);
        Assertions.assertThrows(NoLocationException.class, ()->subscriptionManager.removeSubscriberFromLocation(subscriber1, location1));
    }

    @Test
    public void Should_Return_Exception_When_We_Try_To_Remove_Location_That_Does_Not_Exist() throws NoLocationException {
        /*
            Test Case:
                1. Add subscriber 1 to location 1
                2. Remove location 1.
	            3. Remove location 1.
            Expected Result:
	            1. Return NoLocationException
        */
        subscriptionManager.removeLocation(location1);
        Assertions.assertThrows(NoLocationException.class, ()->subscriptionManager.removeLocation(location1));
    }

    //-------------------------------------METHODS----------------------------------------------------------------------

    private void verifyOneTimeReceiveLocationNote(Subscriber subscriber, Location location){
        Mockito.verify(subscriber, Mockito.times(1)).receiveLocationNote(location);
    }

    private void verifyOneTimeReceiveGeneralNote(Subscriber subscriber) {
        Mockito.verify(subscriber, Mockito.times(1)).receiveGeneralNote();
    }

    private void verifyZeroTimeReceiveLocationNote(Subscriber subscriber, Location location){
        Mockito.verify(subscriber, Mockito.never()).receiveLocationNote(location);
    }

    private void verifyZeroTimeReceiveGeneralNote(Subscriber subscriber) {
        Mockito.verify(subscriber, Mockito.never()).receiveGeneralNote();
    }

}