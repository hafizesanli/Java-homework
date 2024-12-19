package org.example;
public class SniperRifle extends Firearms{
    private boolean scope;
    private double fieldViewDistance;
    private int damage;
    private double misfireRate;
    private int bulletCount;
    private String name;
    private int cost;
    private double effectiveRange;
    private boolean scopeAttached;

    public SniperRifle(boolean scope, double misfireRate,double fieldViewDistance, String name, int bulletCount){
        super(name,bulletCount);
        this.bulletCount=100;
        this.misfireRate=misfireRate;
        this.damage=10;
        this.scope = scope;
        this.fieldViewDistance = fieldViewDistance;
        this.scopeAttached = false;
        this.name= name;
        this.effectiveRange=100;
        this.cost=50;

    }
    public void attachScope() {
        scopeAttached = true;
    }

    public void detachScope() {
        scopeAttached = false;
    }

    public boolean isScopeAttached() {
        return scopeAttached;
    }

    public double getMisfireRate() {
        return misfireRate;
    }

    public double getDamage() {
        return damage;
    }

    public int getBullet() {
        return bulletCount;
    }

    public boolean isScope() {
        return scope;
    }

    public double getFieldViewDistance() {
        return fieldViewDistance;
    }


    @Override
    public double getEffectiveRange() {
        return effectiveRange;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getBulletCount() {
        return bulletCount;
    }


    public void shoot(){
        if(scope){
            misfireRate = 0.45;
            damage += 10;
            fieldViewDistance = 100.0;
            bulletCount --;

        }else{
            misfireRate =0.01;
            fieldViewDistance= 50.0;
            bulletCount --;
        }

    }

}
