package handlers;

import common.Item;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    @Override
    protected boolean canApprove(Item item) {
        final double cost = item.cost();
        return switch (item.type()) {
            case CONSUMABLES -> cost <= 300;
            case CLERICAL -> cost <= 500;
            case GADGETS -> cost <= 1000;
            case GAMING -> cost <= 2000;
            case PC -> cost <= 5000;
        };
    }
}
