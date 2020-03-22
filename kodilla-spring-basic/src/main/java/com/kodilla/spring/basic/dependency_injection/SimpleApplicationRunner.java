package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {
    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApplication simpleApplication = new SimpleApplication(messageService);
        simpleApplication.processMessage("Test message", "receiver@gmail.com");
    }
}
