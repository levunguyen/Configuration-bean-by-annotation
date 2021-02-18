package com.example.qualifier;

import org.springframework.stereotype.Component;

@Component
public class FacebookMessageService implements MessageService {
    @Override
    public void sendMsg() {
        System.out.println("Send message by Facebook");
    }
}
