package org.example;
public class MachineGun extends Firearms{
    private double misfireRate;
    private boolean sweep;
    private int damage;
    private int bulletCount;
    private int cost;
    private String name;
    private double effectiveRange;

    public MachineGun(boolean sweep, String name,int bulletCount){
        super(name,bulletCount);
        this.sweep = sweep;
        this.bulletCount=10;
        this.misfireRate=0.1;
        this.damage=20;
        this.cost = 50;



    }

    public double getDamage() {
        return damage;
    }

    public boolean isSweep() {
        return sweep;
    }

    @Override
    public double getEffectiveRanged() {
        return super.getEffectiveRanged();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getEffectiveRange() {
        return effectiveRange;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public double getMisfireRate() {
        return misfireRate;
    }

    public int getBulletCount() {
        return bulletCount;
    }
    public void shoot(){
        if(sweep & bulletCount>0){
            bulletCount -= 10;
            damage += 10.0;

        }else{
            bulletCount--;
        }
    }

    public void setSweepOff() {
    }

    public void setSweepOn() {
    }
}
