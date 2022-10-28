package handlers;

import common.Item;

/**
 * Used as a fallback in approval chain. Should not contain any additional logic. If abstract
 * methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Approver {
  private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

  public static ExecutiveMeeting getInstance() {
    return INSTANCE;
  }

  @Override
  public void approve(Item item) {

    System.out.printf("Purchase of %s with id %s that costs %s requires an approval of executive meeting.%n", item.type(), item.id(), item.cost());
  }

  @Override
  protected boolean canApprove(Item item) {
    return false;
  }
}
