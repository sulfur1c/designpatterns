package main.java.coffeemachine;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine){
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        this.oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        this.oldCoffeeMachine.selectB();
    }
}
