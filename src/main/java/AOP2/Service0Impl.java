package AOP2;

import AOP2.annotation.HeheAdvice;

public class Service0Impl implements Service0 {
    @HeheAdvice
    public void a() {
        System.out.println("a");
    }

    @HeheAdvice
    public void b() {
        System.out.println("b");
    }
}
