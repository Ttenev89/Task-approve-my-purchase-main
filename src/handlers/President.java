package handlers;

import common.Item;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver {

    @Override
    protected boolean canApprove(Item item) {
        final double cost = item.cost();
        return switch (item.type()) {
            case CONSUMABLES -> cost <= 1000;
            case CLERICAL -> cost <= 2000;
            case GADGETS -> cost <= 3000;
            case GAMING -> cost <= 5000;
            case PC -> cost <= 8000;
        };
    }
}
