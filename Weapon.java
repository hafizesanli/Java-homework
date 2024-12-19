package org.example;
public class Weapon {
        private String name;
        private int cost;
        private int damage;
        private double effectiveRange;

        public Weapon(String name) {
            this.name = name;
            this.cost = 80;
            this.damage = 50;
            this.effectiveRange = 100;
        }

        public String getName() {
            return name;
        }

        public int getCost() {
            return cost;
        }

        public double getDamage() {
            return damage;
        }

        public double getEffectiveRange() {
            return effectiveRange;
        }
}

