package handlers;

import common.Item;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {
    @Override
    protected boolean canApprove(Item item) {
        final double cost = item.cost();
        return switch (item.type()) {
            case CONSUMABLES -> cost <= 500;
            case CLERICAL -> cost <= 1000;
            case GADGETS -> cost <= 1500;
            case GAMING -> cost <= 3000;
            case PC -> cost <= 6000;
        };
    }
}
