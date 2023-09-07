import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GIWeapons {
    double atkWeap, atkCritr, atkCrit, atkPercWeap;
    String  nameWeap;
    static int lvlWeap;
    private static Scanner txt = new Scanner(System.in);

    GIWeapons(String nameWeap, int lvlWeap, double atkWeap){
        this.nameWeap="Weapon";
        this.lvlWeap=1;
        this.atkWeap=atkWeap;
    }
    public static int askingLvl(){
        System.out.println("Por favor ingresa el nivel de tu arma!");
        lvlWeap= txt.nextInt();
        return lvlWeap;
    }
    public static void atkWeaponByLvl(){
        askingLvl();
        int[] rangAtk38 = {38, 86, 105, 151, 171, 193, 212, 234, 253, 274, 294, 314, 334, 354};
        int[] rangAtk39 = {39, 94, 113, 169, 189, 216, 236, 263, 282, 309, 329, 355, 375, 401};
        int[] rangAtk40 = {40, 102, 121, 187, 207, 239, 259, 292, 311, 344, 363, 396, 415, 448};
        int[] rangAtk41 = {41, 99, 125, 184, 210, 238, 264, 293, 319, 347, 373, 401, 427, 454};
        int[] rangAtk42 = {42, 109, 135, 205, 231, 266, 292, 327, 353, 388, 414, 449, 475, 510};
        int[] rangAtk44 = {44, 119, 144, 226, 252, 293, 319, 361, 387, 429, 455, 497, 523, 565};
        int[] rangAtk46 = {46, 122, 153, 235, 266, 308, 340, 382, 414, 457, 488, 532, 563, 608};
        int[] rangAtk48 = {48, 133, 162, 261, 292, 341, 373, 423, 455, 506, 537, 590, 621, 674};
    }

    public static void main (String[] args) {
        System.out.println("Hello world!");
    }
}
