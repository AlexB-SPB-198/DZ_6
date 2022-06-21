package com.company;

public class Weapon {
    private String NameWeapon;
    private String TypeWeapon;


    public String getNameWeapon() {
        return NameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        NameWeapon = nameWeapon;
    }

    public String getTypeWeapon() {
        return TypeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        TypeWeapon = typeWeapon;
    }

    public String info(){ return getNameWeapon()+" " +getTypeWeapon();

    }
}
