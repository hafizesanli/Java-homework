package org.example;
public class Firearms extends RangedWeapon{

    private int damage;
    private double effectiveRanged;
    private String name;
    private int bulletCount;
    private double misfireRate;
    private int cost;
    private double effectiveRange;


    public Firearms(String name,int bulletCount){
        super(name,bulletCount);

        this.damage = 50;
        this.effectiveRanged = 60.50;
        this.name =name;
        this.bulletCount = 20;
        this.misfireRate = 0.3;
        this.cost=40;



    }



    public double getDamage() {
        return damage;
    }

    public double getEffectiveRanged() {
        return effectiveRanged;
    }


    public int getBulletCount() {
        return bulletCount;
    }

    public String getName() {
        return name;
    }

    public void shoot(){
        if(bulletCount>0){
            bulletCount --;
            damage += 10.0;
        }

    }
}
