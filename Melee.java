package org.example;
public class Melee extends Weapon{
    private boolean canBeFired;

    public Melee(String name, boolean canBeFired) {
        super(name);
        this.canBeFired = canBeFired;
    }

    public boolean canBeFired() {
        return canBeFired;
    }
}
