package com.example.qualifier;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageService implements MessageService {
    @Override
    public void sendMsg() {
        System.out.println("Send message by email");
    }
}
