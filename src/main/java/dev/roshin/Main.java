package dev.roshin;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
            ServiceLoader<MyService> services = ServiceLoader.load(MyService.class);
            for (MyService service : services) {
                service.execute();
            }

        ServiceLoader<MyService> services2 = ServiceLoader.load(MyService.class);
        for (MyService service : services) {
            service.execute();
        }



    }
}