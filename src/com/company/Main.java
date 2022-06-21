package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(800, 60);
        boss.weapon.setTypeWeapon("Cold");
        boss.weapon.setNameWeapon("Sword");

        System.out.println(boss.info());
    }
}
