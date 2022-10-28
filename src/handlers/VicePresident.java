package handlers;

import common.Item;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver{

    @Override
    protected boolean canApprove(Item item) {
        final double cost = item.cost();
        return switch (item.type()) {
            case CONSUMABLES -> cost <= 700;
            case CLERICAL -> cost <= 1500;
            case GADGETS -> cost <= 2000;
            case GAMING -> cost <= 4500;
            case PC -> cost <= 6500;
        };
    }
}
