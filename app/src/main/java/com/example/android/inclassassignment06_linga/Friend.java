package com.example.android.inclassassignment06_linga;

import java.io.Serializable;
import android.support.annotation.NonNull;


public class Friend implements Serializable {
    String sFriName;
    int sFriAge;
    String sFriInfo;
    boolean sEatSweets;
    String sCanDrinkAlcohol;

    public String getsFriName() {
        return sFriName;
    }

    public void setsFriName(String sFriName) {
        this.sFriName = sFriName;
    }

    public String getsFriInfo() {
        return sFriInfo;
    }

    public void setsFriInfo(String sFriInfo) {
        this.sFriInfo = sFriInfo;
    }

    public int getsFriAge() {
        return sFriAge;
    }

    public void setsFriAge(int sFriAge) {
        this.sFriAge = sFriAge;
    }

    public boolean issEatSweets() {
        return sEatSweets;
    }

    public void setsEatSweets(boolean sEatSweets) {
        this.sEatSweets = sEatSweets;
    }

    public String getsCanDrinkAlcohol() {
        return sCanDrinkAlcohol;
    }

    public void setsCanDrinkAlcohol(String sCanDrinkAlcohol) {
        this.sCanDrinkAlcohol = sCanDrinkAlcohol;
    }

    public Friend(String sFriName, String sFriInfo, int sFriAge, boolean sEatSweets, String sCanDrinkAlcohol) {
        this.sFriName = sFriName;
        this.sFriInfo = sFriInfo;
        this.sFriAge = sFriAge;
        this.sEatSweets = sEatSweets;
        this.sCanDrinkAlcohol = sCanDrinkAlcohol;
    }


    @Override
    public String toString() {
        return "Friend's Name: "+sFriName+
                "\nAge: "+ sFriAge+
                "\nLegal to drink alcohol? "+ sCanDrinkAlcohol+
                "\nDoes he/she like sweets? "+sEatSweets+
                "\nOther Information: " + sFriInfo;
    }
}
