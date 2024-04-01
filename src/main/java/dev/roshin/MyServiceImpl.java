package dev.roshin;

public class MyServiceImpl implements MyService {

    public MyServiceImpl() {
        System.out.println("Service Created");
    }

    @Override
    public void execute() {
        System.out.println("Service Executed");
    }
}