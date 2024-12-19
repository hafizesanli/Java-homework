package org.example;
public class BeginnerAmateur extends Player{

    public BeginnerAmateur(boolean isTerrorist, String name) {
        super(isTerrorist, name,500,100);

    }
    @Override
    public void loanMoney(Player Borrower, int Amount){
        if (Borrower.isTerrorist) {
            System.out.println("Failed! Come on! Too young to be a spy!");
        } else if (this.money < Amount) {
            System.out.println("Failed! " + this.name + " cannot afford it now!");
        } else {
            this.money -= Amount; //I reduced the amount assuming the money was given
            Borrower.money += Amount;
            System.out.println("Success! " + this.name + " is a perfect philanthropist!");
            System.out.println("Info: " + this.name + " has now " + this.money + " dollars!");
            System.out.println("Info: " + Borrower.name + " has now " + Borrower.money + " dollars!");
        }

    }
    @Override
    public void move(int newX, int newY) {
        if (newX >= 0 && newX <= 100 && newY >= 0 && newY <= 50) {
            xCoordinate = newX;
            yCoordinate = newY;
            System.out.println(name + " moved to (" + xCoordinate + ", " + yCoordinate + ")");
        } else {
            System.out.println(name + " can't move to the specified position.");
        }
    }

    @Override
    protected int getMaxWeapon() {
        return 5;
    }
}
