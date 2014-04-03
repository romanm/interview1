package edu.designpattern.builderpattern1;

class BuilderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        
        waiter.setPizzaBuilder(new HawaiianPizzaBuilder());
        waiter.constructPizza();
        System.out.println(waiter.getPizza());
        
        waiter.setPizzaBuilder(new SpicyPizzaBuilder());
        waiter.constructPizza();
        System.out.println(waiter.getPizza());
    }
 }
