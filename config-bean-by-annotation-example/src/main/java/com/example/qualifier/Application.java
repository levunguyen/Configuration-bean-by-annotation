package com.example.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
//        ---------------------------Qualifier
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfigQualifier.class);

        Mobile mobile = applicationContext.getBean(Mobile.class);
        mobile.getMessageService().sendMsg();
        applicationContext.close();

    }
}
