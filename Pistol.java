package org.example;
public class Pistol {
    public int bulletCount;
    private double misFireRate;

    public Pistol() {
        this.bulletCount = 20;
        this.misFireRate = 0.1;
    }

    public int getBulletCount() {
        return bulletCount;
    }

    public double getMisFireRate() {
        return misFireRate;
    }
}
