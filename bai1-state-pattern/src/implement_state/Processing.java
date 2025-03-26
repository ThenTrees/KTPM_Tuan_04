package implement_state;

import state.State;

public class Processing implements State {
    @Override
    public void doAction() {
        System.out.println("package and ship the order");
    }
}
