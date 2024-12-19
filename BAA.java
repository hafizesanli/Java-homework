package org.example;
public class BAA extends RangedWeapon{
    private boolean supportsPoison;
    private boolean isArrowPoisoned;
    private double damage;
    private int arrows;
    private int cost;
    private String name;
    private boolean arrowClean;
    private boolean arrowPoisoned;

    public BAA(String name, int bulletCount) {
        super(name, bulletCount);

        this.supportsPoison = supportsPoison;
        this.isArrowPoisoned = false;
        this.damage = 0.0;
        this.arrows = arrows;
        this.cost = 100;
        this.name = name;
        this.arrowClean = true;
        this.arrowPoisoned = false;
    }




    public boolean supportsPoison() {
        return supportsPoison;
    }

    public boolean isArrowPoisoned() {
        return arrowPoisoned;
    }

    public void poisonArrow() {
        arrowClean = false;
        arrowPoisoned = true;
        if (supportsPoison && arrows > 0) {
            isArrowPoisoned = true;
            damage += 15.0;
            arrows--;
        }

    }
    public double getDamage() {
        return damage;
    }

    public int getArrows() {
        return arrows;
    }


    public int getCost() {
        return cost;
    }


    public String getName() {
        return name;
    }
    public double getEffectiveRange() {
        return 90.0; // Example effective range
    }

    public void cleanArrow() {
        arrowClean = true;
        arrowPoisoned = false;
    }

    public boolean isArrowClean() {
        return arrowClean;
    }



}
