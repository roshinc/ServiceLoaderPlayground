package dev.roshin;

public class MyServiceImpl2 implements MyService {

    public MyServiceImpl2() {
        System.out.println("MyServiceImpl2 is created.");
    }

    @Override
    public void execute() {
        System.out.println("MyServiceImpl2 is doing something.");
    }
}