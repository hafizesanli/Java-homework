package org.example;
public class Game {
    public static void main(String[] args) {
        Player kayla = new MasterExpert(true,"Kayla");
        Player katie = new BeginnerAmateur(false, "katie");
        Player joseph = new BeginnerAmateur(true, "joseph");
        System.out.println("Operation #1: Kayla shoots at katie");
        kayla.shoot(katie);
        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #2: Kayla shoots at joseph");
        kayla.shoot(joseph);

        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #3: Kayla shoots at joseph");
        kayla.shoot(joseph);

        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #4: Kayla shoots at joseph");
        kayla.shoot(joseph);

        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #5: Kayla shoots at joseph");
        kayla.shoot(joseph);

        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #6: Kayla shoots at joseph");
        kayla.shoot(joseph);

        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #7: Kayla shoots at joseph");
        kayla.shoot(joseph);

        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #8: Kayla shoots at joseph");
        kayla.shoot(joseph);

        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #9: joseph takes cure");
        joseph.takeCure();



        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #10: kayla loads magazine");
        kayla.loadMagazine();

        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #11: kayla loans money to joseph");
        kayla.loanMoney(joseph, 500);



        System.out.println("-----------------------------------------------------");
        System.out.println("Operation #12: kayla loans money to katie");
        kayla.loanMoney(katie,100 );
        System.out.println("-----------------------------------------------------");

        BAA baa = new BAA("Bow and Arrow", 50);
        System.out.println("Bow and Arrow: "+baa.getName());

        baa.poisonArrow();
        System.out.println("Arrow poisoned: " + baa.isArrowPoisoned());
        System.out.println("Damage after poisoning: " + baa.getDamage());
        baa.cleanArrow();
        System.out.println("Arrow cleaned: " + baa.isArrowClean());

        BeginnerAmateur beginner = new BeginnerAmateur(false, "John");
        System.out.println("Beginner: " + beginner.getName());
        System.out.println("Money: " + beginner.getMoney());
        System.out.println("Health: " + beginner.getHealth());
        beginner.move(50, 25);

        Firearms firearm = new Firearms("AK-47", 50);
        System.out.println("Firearm: " + firearm.getName());
        System.out.println("Damage: " + firearm.getDamage());
        System.out.println("Bullet Count: " + firearm.getBulletCount());
        firearm.shoot();
        System.out.println("Bullet Count after shooting: " + firearm.getBulletCount());

        MachineGun machineGun = new MachineGun(true, "Negev", 50);
        System.out.println("Machine Gun: " + machineGun.getName());
        System.out.println("Sweep: " + machineGun.isSweep());
        System.out.println("Damage: " + machineGun.getDamage());
        System.out.println("Bullet Count: " + machineGun.getBulletCount());
        machineGun.shoot();
        System.out.println("Bullet Count after shooting: " + machineGun.getBulletCount());

        MasterExpert master = new MasterExpert(true, "Mike");
        System.out.println("Master Expert: " + master.getName());
        System.out.println("Money: " + master.getMoney());
        System.out.println("Health: " + master.getHealth());
        master.move(70, 30);
        SniperRifle sniperRifle = new SniperRifle(true,10,10,"John",50);
        master.attachScope(sniperRifle);
        master.detachScope(sniperRifle);
        master.setSweepOn(machineGun);
        master.setSweepOff(machineGun);
        master.cleanArrow(baa);
        master.poisonArrow(baa);
        System.out.println("Immortal: " + master.isImmortal());
        master.setImmortal(true);
        System.out.println("Immortal: " + master.isImmortal());
        System.out.println("Sweep On: " + master.isSweepOn());

        Melee melee = new Melee("Knife",   true);
        System.out.println("Melee: " + melee.getName());
        System.out.println("Damage: " + melee.getDamage());
        System.out.println("Effective Range: " + melee.getEffectiveRange());
        System.out.println("Can be fired: " + melee.canBeFired());

        Pistol pistol = new Pistol();
        System.out.println("Pistol Bullet Count: " + pistol.getBulletCount());
        System.out.println("Pistol Misfire Rate: " + pistol.getMisFireRate());



        Player player = new BeginnerAmateur(false, "Bob");
        firearm.shoot();
        System.out.println("Player: " + player.getName());
        System.out.println("Money: " + player.getMoney());
        System.out.println("Health: " + player.getHealth());
        player.move(60, 40);
        System.out.println("Health after healing: " + player.getHealth());


    }
}


