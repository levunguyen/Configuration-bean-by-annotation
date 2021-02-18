package com.example.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

//        ---------------------------Primary
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfigPrimary.class);
        MessageService messageService = applicationContext.getBean(MessageService.class);
        messageService.sendMsg();
        applicationContext.close();

    }
}
