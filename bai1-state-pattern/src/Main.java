import context.OrderContext;
import implement_state.Cancelled;
import implement_state.InitOrder;
import implement_state.Processing;
import implement_state.Shipped;
import state.State;

public class Main {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        // init
        State orderState = new InitOrder();
        orderContext.setOrderState(orderState);
        orderContext.doAction();

        // processing
        orderState = new Processing();
        orderContext.setOrderState(orderState);
        orderContext.doAction();

        //shipped
        orderState = new Shipped();
        orderContext.setOrderState(orderState);
        orderContext.doAction();

        // cancelled
        orderState = new Cancelled();
        orderContext.setOrderState(orderState);
        orderContext.doAction();




    }
}