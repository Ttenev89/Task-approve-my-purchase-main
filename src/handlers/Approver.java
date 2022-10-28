package handlers;

import common.Item;

public abstract class Approver {

  protected Approver next;

  /** If needed, be free to change signature of abstract methods. */
  protected abstract boolean canApprove(Item item);

  public void approve(Item item) {
    if (canApprove(item)) {
      System.out.printf("%s approved purchase of %s with id %s that costs %s%n", getClass().getSimpleName(), item.type(), item.id(), item.cost());
      return;
    }

    System.out.printf("Purchase of %s with id %s needs approval from higher position than %s.%n", item.type(), item.id(), getClass().getSimpleName());
    next.approve(item);
  }

  /** Method used for registering next approver level. DO NOT CHANGE IT. */
  public Approver registerNext(Approver next) {
    this.next = next;
    return next;
  }
}
