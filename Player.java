package org.example;
import java.util.List;

import java.util.ArrayList;
import java.util.Random;
public abstract class Player {
    protected String name;
    protected int money;
    protected int health;
    protected final boolean isTerrorist;
    /*private int bulletCount;*/ // I tried this but removed it because there was no need for a separate pistol class
    protected final Pistol pistol;

    protected int xCoordinate;
    protected int yCoordinate;
    protected boolean immortal;
    protected List<Weapon> weapons;

    public Player(boolean isTerrorist, String name,int money, int health) {
        this.name = name;
        this.money = money;
        this.health = health;
        this.isTerrorist = isTerrorist;
        /*this.bulletCount = 20;*/
        this.pistol = new Pistol(); //I created a new object and took an instance of the Pistol class and assigned the instance to the 'pistol' variable.
        this.xCoordinate = RandomXPosition(0, 100);
        this.yCoordinate = RandomYPosition(0, 50);
        this.weapons = new ArrayList<>();



    }
    public int RandomXPosition(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
    public int RandomYPosition(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    public boolean isTerrorist() {
        return isTerrorist;
    }

    public boolean isImmortal() {
        return immortal;
    }

    public String getName() {
        return name;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public int getMoney() {
        return money;
    }

    public int getHealth() {
        return health;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }


    public void shoot(Player target){
        if (target.isTerrorist == this.isTerrorist) {
            System.out.println("Failed! Target player is on the same side!");
        } else if (target.health == 0) {
            System.out.println("Failed! The enemy is already dead!");
        } else if (pistol.getBulletCount() == 0) {
            System.out.println("Failed! No bullet left in magazine!");
        } else {
            pistol.bulletCount--;
            Random random = new Random();
            if (random.nextDouble() <= this.pistol.getMisFireRate()) {
                System.out.println("Failed! Pistol misfired!");
            } else {
                target.health -= 20; //I reduced health assuming the player was hit
                System.out.println("Success! Pinpoint accuracy!");
                System.out.println("Info: There are " + pistol.getBulletCount() + " bullet(s) left in " + this.name + "'s magazine.");
                System.out.println("Info: " + target.name + "'s health level is decreased to " + target.health + ".");
            }
        }

    }
    public void loadMagazine () {
        if (this.money < 100) {
            System.out.println("Failed! " + this.name + " cannot afford it now!");
        } else {
            this.money -= 100;
            pistol.bulletCount = 20;
            System.out.println("Success! The real war begins now!");
            System.out.println("Info: " + this.name + " has now " + pistol.getBulletCount() + " bullets in the magazine!");
            System.out.println("Info: " + this.name + " has now " + this.money + " dollars!");
        }
    }

    public void takeCure () {
        if (this.money < 500) {
            System.out.println("Failed! " + this.name + " cannot afford it now!");
        } else {
            this.money -= 500;
            this.health = 100;
            System.out.println("Success! " + this.name + " is now as fit as s(he) has never been before!");
            System.out.println("Info: " + this.name + "'s health level is now " + this.health + ".");
            System.out.println("Info: " + this.name + " has now " + this.money + " dollars!");
        }
    }

    public abstract void loanMoney (Player Borrower,int Amount);/* ""I added this part to BeginnerAmateur""{
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

    }*/
    public void buyWeapon(Weapon weapon) {
        if (weapons.size() > getMaxWeapon()) {
            weapons.add(weapon);
            System.out.println(name + " bought a " + weapon.getName());
        } else {
            System.out.println(name + " can't have more weapons.");
        }
    }
    protected abstract int getMaxWeapon();
    public abstract void move(int newX, int newY);
    public void dropWeapon(Weapon weapon) {
        if (weapons.remove(weapon)) {
            System.out.println(name + " dropped the " + weapon.getName());
        } else {
            System.out.println(name + " does not have the " + weapon.getName());
        }
    }

    public void exchangeWeapon(Player otherPlayer, Weapon weapon) {
        if (this instanceof MasterExpert && otherPlayer instanceof MasterExpert) {
            if (weapons.contains(weapon) && otherPlayer.getWeapons().contains(weapon)) {
                weapons.remove(weapon);
                otherPlayer.getWeapons().remove(weapon);
                weapons.add(weapon);
                otherPlayer.getWeapons().add(weapon);
                System.out.println(name + " and " + otherPlayer.getName() + " exchanged " + weapon.getName());
            } else {
                System.out.println("Both players should have the " + weapon.getName() + " to perform the exchange.");
            }
        } else {
            System.out.println("Only Master Expert players can perform weapon exchange.");
        }
    }






    /*public void buyWeapon(Weapon weapon) {
        double cost = weapon.getCost();
        if (money >= cost) {
            money -= cost;
            for (int i = 0; i < weapons.length; i++) {
                if (weapons[i] == null) {
                    weapons[i] = weapon;
                    break;
                }
            }
        }
    }*/
}




