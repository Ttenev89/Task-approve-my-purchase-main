import common.Item;
import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(new Item(1, 15000, Type.CONSUMABLES));
        manager.approve(new Item(2, 5000, Type.PC));
        manager.approve(new Item(3, 6000, Type.PC));
        manager.approve(new Item(4, 3000, Type.GADGETS));
        manager.approve(new Item(5, 1000, Type.CLERICAL));
        manager.approve(new Item(6, 4000, Type.CONSUMABLES));
        manager.approve(new Item(7, 2000, Type.GADGETS));
        manager.approve(new Item(8, 3000, Type.CLERICAL));
    }
}
