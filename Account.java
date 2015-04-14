public class Account {

  private int id;
  private double balance;

  Account() {
    System.out.println("** In default constructor");
    balance = 0;
    id = 0;
  }

  Account (double amt) {
    System.out.println("** In constructor with input amt");
    balance = amt;
  }

  Account (int myId, double amt) {
    System.out.println("** In constructor with input id,amt");
    id = myId;
    balance = amt;
  }

  public void deposit (double amt) {
    balance = balance + amt;
  }

  public void withdraw (double amt) {
    balance = balance - amt;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double amt) {
    balance = amt;
  }


}