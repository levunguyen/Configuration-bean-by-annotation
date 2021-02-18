package com.example.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageService implements MessageService {

    @Override
    public void sendMsg() {
        System.out.println("Send message by email");
    }
}
