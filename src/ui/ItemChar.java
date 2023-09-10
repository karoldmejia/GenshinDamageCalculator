package ui;

import java.util.ArrayList;
import java.util.List;
public class ItemChar extends GICharacters{
    public static List<ItemChar> characteres = new ArrayList<ItemChar>();
    ItemChar(String nameChar, int lvlChar, double atkChar, double critrChar, double critChar, double elmChar, List<ItemWeapon> charWeapon) {
        super(nameChar, lvlChar, atkChar, critrChar, critChar, elmChar, charWeapon);
    }

    public static void createChar(){
        ItemChar char1 = new ItemChar("Albedo", lvlChar, 65, critrChar, critChar, elmChar, ItemWeapon.swordsWeapons);
        characteres.add(char1);
        ItemChar char2 = new ItemChar("Lynette", lvlChar, 64, critrChar, critChar, elmChar, ItemWeapon.swordsWeapons);
        ItemChar char3 = new ItemChar("Kaeya", lvlChar, 64, critrChar, critChar, elmChar, ItemWeapon.swordsWeapons);
        ItemChar char4 = new ItemChar("Qiqi", lvlChar, 67, critrChar, critChar, elmChar, ItemWeapon.swordsWeapons);
        ItemChar char5 = new ItemChar("Alhaitham", lvlChar, 69, critrChar, critChar, elmChar, ItemWeapon.swordsWeapons);
        ItemChar char6 = new ItemChar("Kamisato Ayaka", lvlChar, 72, critrChar, critChar, elmChar, ItemWeapon.swordsWeapons);
        ItemChar char7 = new ItemChar("Candace", lvlChar, 60, critrChar, critChar, elmChar, ItemWeapon.polearmsWeapons);
        ItemChar char8 = new ItemChar("Xiangling", lvlChar, 61, critrChar, critChar, elmChar, ItemWeapon.polearmsWeapons);
        ItemChar char9 = new ItemChar("Rosaria", lvlChar, 63, critrChar, critChar, elmChar, ItemWeapon.polearmsWeapons);
        ItemChar char10 = new ItemChar("Hu Tao", lvlChar, 51, critrChar, critChar, elmChar, ItemWeapon.polearmsWeapons);
        ItemChar char11 = new ItemChar("Zhongli", lvlChar, 62, critrChar, critChar, elmChar, ItemWeapon.polearmsWeapons);
        ItemChar char12 = new ItemChar("Yaoyao", lvlChar, 60, critrChar, critChar, elmChar, ItemWeapon.polearmsWeapons);
        ItemChar char13 = new ItemChar("Arataki Itto", lvlChar, 60, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char14 = new ItemChar("Freminet", lvlChar, 64, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char15 = new ItemChar("Xinyan", lvlChar, 63, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char16 = new ItemChar("Diluc", lvlChar, 68, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char17 = new ItemChar("Beidou", lvlChar, 61, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char18 = new ItemChar("Dehya", lvlChar, 63, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char19 = new ItemChar("Aloy", lvlChar, 62, critrChar, critChar, elmChar, ItemWeapon.bowsWeapons);
        ItemChar char20 = new ItemChar("Tartaglia", lvlChar, 67, critrChar, critChar, elmChar, ItemWeapon.bowsWeapons);
        ItemChar char21 = new ItemChar("Yoimiya", lvlChar, 69, critrChar, critChar, elmChar, ItemWeapon.bowsWeapons);
        ItemChar char22 = new ItemChar("Fischl", lvlChar, 64, critrChar, critChar, elmChar, ItemWeapon.bowsWeapons);
        ItemChar char23 = new ItemChar("Venti", lvlChar, 64, critrChar, critChar, elmChar, ItemWeapon.bowsWeapons);
        ItemChar char24 = new ItemChar("Gorou", lvlChar, 59, critrChar, critChar, elmChar, ItemWeapon.bowsWeapons);
        ItemChar char25 = new ItemChar("Wanderer", lvlChar, 68, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char26 = new ItemChar("Sucrose", lvlChar, 57, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char27 = new ItemChar("Ningguang", lvlChar, 60, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char28 = new ItemChar("Nahida", lvlChar, 66, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char29 = new ItemChar("Barbara", lvlChar, 56, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);
        ItemChar char30 = new ItemChar("Klee", lvlChar, 67, critrChar, critChar, elmChar, ItemWeapon.claymoresWeapons);

    }

}
