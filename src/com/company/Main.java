package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Medic medic = new Medic();
        HavingSuperAbility[] array = {warrior, magic, medic};
        for (int i = 0; i < array.length; i++) {
            array[i].applySuperAbility("Critical damage");
        }

    }
}