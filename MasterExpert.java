package org.example;
public class MasterExpert extends Player{
    private boolean immortal;
    private boolean sweepOn;


    public MasterExpert(boolean isTerrorist, String name) {
        super(isTerrorist, name,1000,100);


    }
    @Override
    public void loanMoney(Player Borrower, int Amount){

    }
    @Override
    public void move(int newX, int newY) {
        if (newX >= 0 && newX <= 100 && newY >= 0 && newY <= 50) {
            xCoordinate = newX;
            yCoordinate = newY;
            System.out.println(name + " moved to (" + xCoordinate + ", " + yCoordinate + ")");
        } else {
            System.out.println(name + " cannot move to the specified position.");
        }
    }

    @Override
    protected int getMaxWeapon() {
        return 2;
    }

    public void attachScope(SniperRifle sniperRifle) {
        sniperRifle.attachScope();
        System.out.println("Scope attached to " + sniperRifle.getName());
    }

    public void detachScope(SniperRifle sniperRifle) {
        sniperRifle.detachScope();
        System.out.println("Scope detached from " + sniperRifle.getName());
    }

    public void setSweepOn(MachineGun machineGun) {
        machineGun.setSweepOn();
        sweepOn = true;
        System.out.println("Sweep feature is now ON for " + machineGun.getName());
    }

    public void setSweepOff(MachineGun machineGun) {
        machineGun.setSweepOff();
        sweepOn = false;
        System.out.println("Sweep feature is now OFF for " + machineGun.getName());
    }

    public void cleanArrow(BAA bowAndArrow) {
        bowAndArrow.cleanArrow();
        System.out.println("Arrow cleaned for " + bowAndArrow.getName());
    }

    public void poisonArrow(BAA bowAndArrow) {
        bowAndArrow.poisonArrow();
        System.out.println("Arrow poisoned for " + bowAndArrow.getName());
    }

    public boolean isImmortal() {
        return immortal;
    }

    public void setImmortal(boolean immortal) {
        this.immortal = immortal;
        System.out.println(name + " is " + (immortal ? "now immortal" : "no longer immortal"));
    }

    public boolean isSweepOn() {
        return sweepOn;
    }
}
