package org.example;
public class RangedWeapon extends Weapon{
    private int bulletCount;

    public RangedWeapon(String name, int bulletCount) {
        super(name);
        this.bulletCount = bulletCount;
    }

    public int getBulletCount() { return bulletCount; }
}
