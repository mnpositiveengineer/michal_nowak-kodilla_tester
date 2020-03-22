package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplication {

    private MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    private boolean checkReceiver (String receiver) {
        return receiver != null && !receiver.isEmpty();
    }

    public void processMessage (String message, String receiver) {
        if(checkReceiver(receiver)){
            messageService.send(message, receiver);
        }
    }


}
