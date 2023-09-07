import java.util.*;

public class ItemWeapon extends GIWeapons {
    public ItemWeapon(String nameWeap, int lvlWeap, double atkWeap, double atkCritr, double atkCrit, double atkPercWeap) {
        super(nameWeap, lvlWeap, atkWeap, atkCritr, atkCrit, atkPercWeap);
    }

    public static void createWeapon(){
        List<ItemWeapon> bowsWeapons = new ArrayList<ItemWeapon>();
        ItemWeapon weapon1 = new ItemWeapon("Polar Star", lvlWeap, 6, atkCritr, atkCrit, atkPercWeap);
        bowsWeapons.add(weapon1);
        ItemWeapon weapon2 = new ItemWeapon("Predator", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        bowsWeapons.add(weapon2);
        ItemWeapon weapon3 = new ItemWeapon("Raven Bow", lvlWeap, 2, atkCritr, atkCrit, atkPercWeap);
        bowsWeapons.add(weapon3);
        ItemWeapon weapon4 = new ItemWeapon("Slingshot", lvlWeap, 0, atkCritr, atkCrit, atkPercWeap);
        bowsWeapons.add(weapon4);
        ItemWeapon weapon5 = new ItemWeapon("The First Great Magic", lvlWeap, 6, atkCritr, atkCrit, atkPercWeap);
        bowsWeapons.add(weapon5);
        ItemWeapon weapon6 = new ItemWeapon("The Stringless", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        bowsWeapons.add(weapon6);
        ItemWeapon weapon7 = new ItemWeapon("Alley Hunter", lvlWeap, 5, atkCritr, atkCrit, atkPercWeap);
        bowsWeapons.add(weapon7);
        ItemWeapon weapon8 = new ItemWeapon("Messenger", lvlWeap, 2, atkCritr, atkCrit, atkPercWeap);
        bowsWeapons.add(weapon8);

        ArrayList<ItemWeapon> catalystWeapons = new ArrayList<ItemWeapon>();
        ItemWeapon catalyst1 = new ItemWeapon("A Thousand Floating Dreams", lvlWeap, 5, atkCritr, atkCrit, atkPercWeap);
        catalystWeapons.add(catalyst1);
        ItemWeapon catalyst2 = new ItemWeapon("Blackcliff Agate", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        catalystWeapons.add(catalyst2);
        ItemWeapon catalyst3 = new ItemWeapon("Dodoco Tales", lvlWeap, 3, atkCritr, atkCrit, atkPercWeap);
        catalystWeapons.add(catalyst3);
        ItemWeapon catalyst4 = new ItemWeapon("Emerald Orb", lvlWeap, 2, atkCritr, atkCrit, atkPercWeap);
        catalystWeapons.add(catalyst4);
        ItemWeapon catalyst5 = new ItemWeapon("Kagura's Verity", lvlWeap, 6, atkCritr, atkCrit, atkPercWeap);
        catalystWeapons.add(catalyst5);
        ItemWeapon catalyst6 = new ItemWeapon("Magic Guide", lvlWeap, 0, atkCritr, atkCrit, atkPercWeap);
        catalystWeapons.add(catalyst6);
        ItemWeapon catalyst7 = new ItemWeapon("Otherworldly Story", lvlWeap, 1, atkCritr, atkCrit, atkPercWeap);
        catalystWeapons.add(catalyst7);
        ItemWeapon catalyst8 = new ItemWeapon("Skyward Atlas", lvlWeap, 7, atkCritr, atkCrit, atkPercWeap);
        catalystWeapons.add(catalyst8);

        ArrayList<ItemWeapon> swordsWeapons = new ArrayList<ItemWeapon>();
        ItemWeapon sword1 = new ItemWeapon("Amenoma Kageuchi", lvlWeap, 3, atkCritr, atkCrit, atkPercWeap);
        swordsWeapons.add(sword1);
        ItemWeapon sword2 = new ItemWeapon("Fillet Blade", lvlWeap, 1, atkCritr, atkCrit, atkPercWeap);
        swordsWeapons.add(sword2);
        ItemWeapon sword3 = new ItemWeapon("Blackcliff Longsword", lvlWeap, 5, atkCritr, atkCrit, atkPercWeap);
        swordsWeapons.add(sword3);
        ItemWeapon sword4 = new ItemWeapon("Haran Geppaku Futsu", lvlWeap, 6, atkCritr, atkCrit, atkPercWeap);
        swordsWeapons.add(sword4);
        ItemWeapon sword5 = new ItemWeapon("Harbinger of Dawn", lvlWeap, 1, atkCritr, atkCrit, atkPercWeap);
        swordsWeapons.add(sword5);
        ItemWeapon sword6 = new ItemWeapon("Iron Sting", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        swordsWeapons.add(sword6);
        ItemWeapon sword7 = new ItemWeapon("Mistsplitter Reforged", lvlWeap, 7, atkCritr, atkCrit, atkPercWeap);
        swordsWeapons.add(sword7);
        ItemWeapon sword8 = new ItemWeapon("The Flute", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        swordsWeapons.add(sword8);

        ArrayList<ItemWeapon> polearmsWeapons = new ArrayList<ItemWeapon>();
        ItemWeapon polearm1 = new ItemWeapon("The Catch", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        polearmsWeapons.add(polearm1);
        ItemWeapon polearm2 = new ItemWeapon("Calamity Queller", lvlWeap, 7, atkCritr, atkCrit, atkPercWeap);
        polearmsWeapons.add(polearm2);
        ItemWeapon polearm3 = new ItemWeapon("Deathmatch", lvlWeap, 3, atkCritr, atkCrit, atkPercWeap);
        polearmsWeapons.add(polearm3);
        ItemWeapon polearm4 = new ItemWeapon("Halberd", lvlWeap, 2, atkCritr, atkCrit, atkPercWeap);
        polearmsWeapons.add(polearm4);
        ItemWeapon polearm5 = new ItemWeapon("Lithic Spear", lvlWeap, 5, atkCritr, atkCrit, atkPercWeap);
        polearmsWeapons.add(polearm5);
        ItemWeapon polearm6 = new ItemWeapon("Missive Windspear", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        polearmsWeapons.add(polearm6);
        ItemWeapon polearm7 = new ItemWeapon("Primordial Jade Winged-Spear", lvlWeap, 7, atkCritr, atkCrit, atkPercWeap);
        polearmsWeapons.add(polearm7);
        ItemWeapon polearm8 = new ItemWeapon("White Tassel", lvlWeap, 1, atkCritr, atkCrit, atkPercWeap);
        polearmsWeapons.add(polearm8);

        ArrayList<ItemWeapon> claymoresWeapons = new ArrayList<ItemWeapon>();
        ItemWeapon claymore1 = new ItemWeapon("Akuoumaru", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        claymoresWeapons.add(claymore1);
        ItemWeapon claymore2 = new ItemWeapon("Blackcliff Slasher", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        claymoresWeapons.add(claymore2);
        ItemWeapon claymore3 = new ItemWeapon("Debate Club", lvlWeap, 1, atkCritr, atkCrit, atkPercWeap);
        claymoresWeapons.add(claymore3);
        ItemWeapon claymore4 = new ItemWeapon("Lithic Blade", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        claymoresWeapons.add(claymore4);
        ItemWeapon claymore5 = new ItemWeapon("Prototype Archaic", lvlWeap, 5, atkCritr, atkCrit, atkPercWeap);
        claymoresWeapons.add(claymore5);
        ItemWeapon claymore6 = new ItemWeapon("Royal Greatsword", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        claymoresWeapons.add(claymore6);
        ItemWeapon claymore7 = new ItemWeapon("Serpent Spine", lvlWeap, 4, atkCritr, atkCrit, atkPercWeap);
        claymoresWeapons.add(claymore7);
        ItemWeapon claymore8 = new ItemWeapon("The Unforged", lvlWeap, 6, atkCritr, atkCrit, atkPercWeap);
        claymoresWeapons.add(claymore8);

    }
}
