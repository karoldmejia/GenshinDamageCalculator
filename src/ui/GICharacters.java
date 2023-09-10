package ui;
import java.util.*;

public class GICharacters {
    static double atkChar, critrChar, critChar, elmChar;
    static int lvlChar;
    static String nameChar;
    static List<ItemWeapon> charWeapon;

    GICharacters(String nameChar, int lvlChar, double atkChar, double critrChar, double critChar, double elmChar, List<ItemWeapon> charWeapon){
        this.atkChar=atkChar;
        this.critrChar=0.05;
        this.critChar=0.5;
        this.nameChar=nameChar;
        this.elmChar=0;
        this.lvlChar=1;
        this.charWeapon = charWeapon;
    }
    public static String getNameChar() {
        return nameChar;
    }
    public static int getLvlChar() {
        return lvlChar;
    }
    public static double getAtkChar() {
        return atkChar;
    }
    public static double getCritrChar() {
        return atkChar;
    }
    public static double getCritChar() {
        return atkChar;
    }
    public static double getElmChar() {
        return atkChar;
    }

}