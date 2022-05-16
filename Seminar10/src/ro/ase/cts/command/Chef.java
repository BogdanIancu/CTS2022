package ro.ase.cts.command;

public class Chef {
    public void cookPizza(){
        new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("the pizza is ready");
        }).start();
    }

    public void cookBurger(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the burger is ready");
    }

    public void cookPasta(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the pasta is ready");
    }

}
