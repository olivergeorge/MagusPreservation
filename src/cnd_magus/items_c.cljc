(ns cnd-magus.items-c
  (:require [cnd-magus.items-h :refer :all]))
;/*
;------------------
;  ITEMS.C
;------------------
;*/
;
;#include <stdio.h>
;#include "items.h"
;
;
;struct objectInfo gObjectData[ MAXOBJECTS] =
;      { { "Dummy", 0, 0, 0, 0, 0, 0 },
;        { "Sword", O_CLASS_WEAPON, 4, O_REQ_ONEHAND, 76, 9, 20 },
;        { "2H-Sword", O_CLASS_WEAPON, 8, O_REQ_TWOHANDS, 74, 15, 75 },
;        { "Axe", O_CLASS_WEAPON, 5, O_REQ_ONEHAND, 85, 10, 20 },
;        { "Dagger", O_CLASS_MIXEDWEAPON, 1, O_REQ_ONEHAND, 88, 6, 10 },
;        { "Bow", O_CLASS_RANGEDWEAPON, 3, O_REQ_TWOHANDS, 83, 9, 20 },
;        { "Crossbow", O_CLASS_RANGEDWEAPON, 4, O_REQ_TWOHANDS, 82, 12, 20 },
;        { "Throwing star", O_CLASS_THROWINGWEAPON, 1, O_REQ_ONEHAND, 89, 9, 5 },
;        { "Confusion", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 93, 5, 0 },
;        { "Fireblade", O_CLASS_SPECIAL, 2, O_REQ_ONEHAND, 173, 0, 150 },
;        { "Helmet", O_CLASS_ARMOR, 3, O_REQ_HEAD, 91, 2, 20 },
;        { "Shield", O_CLASS_ARMOR, 3, O_REQ_ONEHAND, 78, 4, 20 },
;        { "Leather", O_CLASS_ARMOR, 3, O_REQ_BODY, 79, 2, 20 },
;        { "Armour", O_CLASS_ARMOR, 7, O_REQ_BODY, 80, 6, 75 },
;        { "Emerald", O_CLASS_GADGET, 1, O_REQ_NECK, 81, 0, 100 },
;        { "Emerald ring", O_CLASS_GADGET, 0, O_REQ_FINGER, 90, 0, 150 },
;        { "Arrows", O_CLASS_ARROWS, 0, O_REQ_NOTHING, 84, 0, 10 },
;        { "Studded leather", O_CLASS_ARMOR, 4, O_REQ_BODY, 77, 3, 20 },
;        { "Chainmail", O_CLASS_ARMOR, 6, O_REQ_BODY, 75, 5, 60 },
;        { "Lightning bolt", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 55, 10, 0 },
;        { "FireBall", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 60, 5, 0 },
;        { "Portal", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 56, 7, 0 },
;        { "Air", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 72, 7, 0 },
;        { "Fire", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 70, 10, 0 },
;        { "Water", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 68, 8, 0 },
;        { "Earth", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 67, 8, 0 },
;        { "Skeleton", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 64, 15, 0 },
;        { "Zombie", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 65, 15, 0 },
;        { "Vision", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 69, 2, 0 },
;        { "Phantom", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 73, 3, 0 },
;        { "Sleep", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 59, 8, 0 },
;        { "Slayer", O_CLASS_WEAPON, 8, O_REQ_TWOHANDS, 122, 17, 150 },
;        { "FastFeet", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 54, 8, 0 },
;        { "Heal", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 53, 5, 20 },
;        { "StoneAxe", O_CLASS_WEAPON, 10, O_REQ_TWOHANDS, 107, 15, 0 },
;        { "Gloves", O_CLASS_ARMOR, 1, O_REQ_HANDS, 58, 1, 20 },
;        { "Darkness", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 57, 10, 0 },
;        { "Sabre", O_CLASS_WEAPON, 7, O_REQ_ONEHAND, 86, 10, 0 },
;        { "Staff", O_CLASS_WEAPON, 3, O_REQ_TWOHANDS, 87, 8, 20 },
;        { "Chaos", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 66, 20, 0 },
;        { "Demon", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 63, 25, 0 },
;        { "Cloak", O_CLASS_ARMOR, 1, O_REQ_SHOULDERS, 94, 1, 20 },
;        { "Big shield", O_CLASS_ARMOR, 6, O_REQ_ONEHAND, 110, 6, 20 },
;        { "Big helmet", O_CLASS_ARMOR, 4, O_REQ_HEAD, 111, 3, 20 },
;        { "Opal ring", O_CLASS_GADGET, 0, O_REQ_FINGER, 97, 0, 150 },
;        { "Club", O_CLASS_WEAPON, 5, O_REQ_ONEHAND, 119, 11, 20 },
;        { "Topaz", O_CLASS_GADGET, 1, O_REQ_NECK, 123, 0, 300 },
;        { "Opal", O_CLASS_GADGET, 1, O_REQ_NECK, 124, 0, 150 },
;        { "Stonefoot", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 129, 6, 0 },
;        { "Lightning", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 71, 15, 0 },
;        { "DragonTooth", O_CLASS_WEAPON, 4, O_REQ_ONEHAND, 132, 13, 150 },
;        { "Sun's Edge", O_CLASS_WEAPON, 5, O_REQ_ONEHAND, 133, 13, 150 },
;        { "SilverBow", O_CLASS_RANGEDWEAPON, 3, O_REQ_TWOHANDS, 134, 11, 100 },
;        { "Bubble", O_CLASS_TRINKET, 0, O_REQ_NOTHING, 92, 0, 150 },
;        { "Faithful", O_CLASS_ARROWS, 0, O_REQ_NOTHING, 142, 0, 50 },
;        { "SunBow", O_CLASS_SPECIAL, 3, O_REQ_TWOHANDS, 150, 11, 150 },
;        { "Chock", O_CLASS_SPECIAL, 4, O_REQ_ONEHAND, 143, 2, 150 },
;        { "BloodTaste", O_CLASS_WEAPON, 9, O_REQ_TWOHANDS, 144, 19, 200 },
;        { "SunArmour", O_CLASS_ARMOR, 4, O_REQ_BODY, 149, 6, 150 },
;        { "ShadowCloak", O_CLASS_ARMOR, 3, O_REQ_BODY | O_REQ_SHOULDERS, 148, 7, 20 },
;        { "Elven cloak", O_CLASS_ARMOR, 1, O_REQ_SHOULDERS, 147, 3, 50 },
;        { "Focus", O_CLASS_GADGET, 1, O_REQ_HANDS, 146, 0, 150 },
;        { "Terror", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 153, 7, 0 },
;        { "Berzerk", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 152, 3, 0 },
;        { "Protection", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 151, 2, 0 },
;        { "Leadball", O_CLASS_THROWINGWEAPON, 1, O_REQ_ONEHAND, 145, 8, 10 },
;        { "Wooden shield", O_CLASS_ARMOR, 2, O_REQ_ONEHAND, 163, 3, 10 },
;        { "Wakizashi", O_CLASS_WEAPON, 2, O_REQ_ONEHAND, 164, 9, 20 },
;        { "SunHelmet", O_CLASS_ARMOR, 2, O_REQ_HEAD, 157, 3, 70 },
;        { "SunShield", O_CLASS_ARMOR, 3, O_REQ_ONEHAND, 158, 6, 70 },
;        { "ThunderStorm", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 159, 25, 0 },
;        { "HyperSpace", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 160, 20, 0 },
;        { "Panic", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 161, 20, 0 },
;        { "Shooting star", O_CLASS_SPECIAL, 0, O_REQ_ONEHAND, 162, 0, 300 },
;        { "Inferno", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 165, 12, 0 },
;        { "Negator", O_CLASS_TRINKET, 3, O_REQ_NOTHING, 114, 0, 150 },
;        { "Chain'n'ball", O_CLASS_WEAPON, 5, O_REQ_TWOHANDS, 170, 10, 0 },
;        { "SunGloves", O_CLASS_ARMOR, 1, O_REQ_HANDS, 171, 2, 20 },
;        { "Delay", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 172, 2, 0 },
;        { "Ghostblade", O_CLASS_SPECIAL, 4, O_REQ_ONEHAND, 140, 9, 150 },
;        { "Enchant", O_CLASS_SPECIAL, 0, O_REQ_ONEHAND, 178, 0, 100 },
;        { "Purify", O_CLASS_SPELL, 0, O_REQ_ONEHAND, 179, 20, 0 },
;        { "Blue", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 },
;        { "Green", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 },
;        { "Yellow", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 },
;        { "Brown", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 },
;        { "Red", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 },
;        { "Grey", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 },
;        { "White", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 },
;        { "Purple", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 },
;        { "Black", O_CLASS_POTION, 1, O_REQ_ONEHAND, 180, 0, 100 } };

(def ObjectData
  [{:object/name     "Dummy"
    :object/kind     0
    :object/weight   0
    :object/requires #{}
    :object/icon     "art/magus.art0.bmp"
    :object/value    0
    :object/price    0}
   {:object/name     "Sword"
    :object/kind     O_CLASS_WEAPON
    :object/weight   4
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art76.bmp"
    :object/value    9
    :object/price    20}
   {:object/name     "2H-Sword"
    :object/kind     O_CLASS_WEAPON
    :object/weight   8
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art74.bmp"
    :object/value    15
    :object/price    75}
   {:object/name     "Axe"
    :object/kind     O_CLASS_WEAPON
    :object/weight   5
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art85.bmp"
    :object/value    10
    :object/price    20}
   {:object/name     "Dagger"
    :object/kind     O_CLASS_MIXEDWEAPON
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art88.bmp"
    :object/value    6
    :object/price    10}
   {:object/name     "Bow"
    :object/kind     O_CLASS_RANGEDWEAPON
    :object/weight   3
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art83.bmp"
    :object/value    9
    :object/price    20}
   {:object/name     "Crossbow"
    :object/kind     O_CLASS_RANGEDWEAPON
    :object/weight   4
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art82.bmp"
    :object/value    12
    :object/price    20}
   {:object/name     "Throwing star"
    :object/kind     O_CLASS_THROWINGWEAPON
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art89.bmp"
    :object/value    9
    :object/price    5}
   {:object/name     "Confusion"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art93.bmp"
    :object/value    5
    :object/price    0}
   {:object/name     "Fireblade"
    :object/kind     O_CLASS_SPECIAL
    :object/weight   2
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art173.bmp"
    :object/value    0
    :object/price    150}
   {:object/name     "Helmet"
    :object/kind     O_CLASS_ARMOR
    :object/weight   3
    :object/requires #{O_REQ_HEAD}
    :object/icon     "art/magus.art91.bmp"
    :object/value    2
    :object/price    20}
   {:object/name     "Shield"
    :object/kind     O_CLASS_ARMOR
    :object/weight   3
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art78.bmp"
    :object/value    4
    :object/price    20}
   {:object/name     "Leather"
    :object/kind     O_CLASS_ARMOR
    :object/weight   3
    :object/requires #{O_REQ_BODY}
    :object/icon     "art/magus.art79.bmp"
    :object/value    2
    :object/price    20}
   {:object/name     "Armour"
    :object/kind     O_CLASS_ARMOR
    :object/weight   7
    :object/requires #{O_REQ_BODY}
    :object/icon     "art/magus.art80.bmp"
    :object/value    6
    :object/price    75}
   {:object/name     "Emerald"
    :object/kind     O_CLASS_GADGET
    :object/weight   1
    :object/requires #{O_REQ_NECK}
    :object/icon     "art/magus.art81.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Emerald ring"
    :object/kind     O_CLASS_GADGET
    :object/weight   0
    :object/requires #{O_REQ_FINGER}
    :object/icon     "art/magus.art90.bmp"
    :object/value    0
    :object/price    150}
   {:object/name     "Arrows"
    :object/kind     O_CLASS_ARROWS
    :object/weight   0
    :object/requires #{O_REQ_NOTHING}
    :object/icon     "art/magus.art84.bmp"
    :object/value    0
    :object/price    10}
   {:object/name     "Studded leather"
    :object/kind     O_CLASS_ARMOR
    :object/weight   4
    :object/requires #{O_REQ_BODY}
    :object/icon     "art/magus.art77.bmp"
    :object/value    3
    :object/price    20}
   {:object/name     "Chainmail"
    :object/kind     O_CLASS_ARMOR
    :object/weight   6
    :object/requires #{O_REQ_BODY}
    :object/icon     "art/magus.art75.bmp"
    :object/value    5
    :object/price    60}
   {:object/name     "Lightning bolt"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art55.bmp"
    :object/value    10
    :object/price    0}
   {:object/name     "FireBall"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art60.bmp"
    :object/value    5
    :object/price    0}
   {:object/name     "Portal"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art56.bmp"
    :object/value    7
    :object/price    0}
   {:object/name     "Air"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art72.bmp"
    :object/value    7
    :object/price    0}
   {:object/name     "Fire"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art70.bmp"
    :object/value    10
    :object/price    0}
   {:object/name     "Water"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art68.bmp"
    :object/value    8
    :object/price    0}
   {:object/name     "Earth"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art67.bmp"
    :object/value    8
    :object/price    0}
   {:object/name     "Skeleton"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art64.bmp"
    :object/value    15
    :object/price    0}
   {:object/name     "Zombie"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art65.bmp"
    :object/value    15
    :object/price    0}
   {:object/name     "Vision"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art69.bmp"
    :object/value    2
    :object/price    0}
   {:object/name     "Phantom"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art73.bmp"
    :object/value    3
    :object/price    0}
   {:object/name     "Sleep"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art59.bmp"
    :object/value    8
    :object/price    0}
   {:object/name     "Slayer"
    :object/kind     O_CLASS_WEAPON
    :object/weight   8
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art122.bmp"
    :object/value    17
    :object/price    150}
   {:object/name     "FastFeet"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art54.bmp"
    :object/value    8
    :object/price    0}
   {:object/name     "Heal"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art53.bmp"
    :object/value    5
    :object/price    20}
   {:object/name     "StoneAxe"
    :object/kind     O_CLASS_WEAPON
    :object/weight   10
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art107.bmp"
    :object/value    15
    :object/price    0}
   {:object/name     "Gloves"
    :object/kind     O_CLASS_ARMOR
    :object/weight   1
    :object/requires #{O_REQ_HANDS}
    :object/icon     "art/magus.art58.bmp"
    :object/value    1
    :object/price    20}
   {:object/name     "Darkness"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art57.bmp"
    :object/value    10
    :object/price    0}
   {:object/name     "Sabre"
    :object/kind     O_CLASS_WEAPON
    :object/weight   7
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art86.bmp"
    :object/value    10
    :object/price    0}
   {:object/name     "Staff"
    :object/kind     O_CLASS_WEAPON
    :object/weight   3
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art87.bmp"
    :object/value    8
    :object/price    20}
   {:object/name     "Chaos"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art66.bmp"
    :object/value    20
    :object/price    0}
   {:object/name     "Demon"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art63.bmp"
    :object/value    25
    :object/price    0}
   {:object/name     "Cloak"
    :object/kind     O_CLASS_ARMOR
    :object/weight   1
    :object/requires #{O_REQ_SHOULDERS}
    :object/icon     "art/magus.art94.bmp"
    :object/value    1
    :object/price    20}
   {:object/name     "Big shield"
    :object/kind     O_CLASS_ARMOR
    :object/weight   6
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art110.bmp"
    :object/value    6
    :object/price    20}
   {:object/name     "Big helmet"
    :object/kind     O_CLASS_ARMOR
    :object/weight   4
    :object/requires #{O_REQ_HEAD}
    :object/icon     "art/magus.art111.bmp"
    :object/value    3
    :object/price    20}
   {:object/name     "Opal ring"
    :object/kind     O_CLASS_GADGET
    :object/weight   0
    :object/requires #{O_REQ_FINGER}
    :object/icon     "art/magus.art97.bmp"
    :object/value    0
    :object/price    150}
   {:object/name     "Club"
    :object/kind     O_CLASS_WEAPON
    :object/weight   5
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art119.bmp"
    :object/value    11
    :object/price    20}
   {:object/name     "Topaz"
    :object/kind     O_CLASS_GADGET
    :object/weight   1
    :object/requires #{O_REQ_NECK}
    :object/icon     "art/magus.art123.bmp"
    :object/value    0
    :object/price    300}
   {:object/name     "Opal"
    :object/kind     O_CLASS_GADGET
    :object/weight   1
    :object/requires #{O_REQ_NECK}
    :object/icon     "art/magus.art124.bmp"
    :object/value    0
    :object/price    150}
   {:object/name     "Stonefoot"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art129.bmp"
    :object/value    6
    :object/price    0}
   {:object/name     "Lightning"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art71.bmp"
    :object/value    15
    :object/price    0}
   {:object/name     "DragonTooth"
    :object/kind     O_CLASS_WEAPON
    :object/weight   4
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art132.bmp"
    :object/value    13
    :object/price    150}
   {:object/name     "Sun's Edge"
    :object/kind     O_CLASS_WEAPON
    :object/weight   5
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art133.bmp"
    :object/value    13
    :object/price    150}
   {:object/name     "SilverBow"
    :object/kind     O_CLASS_RANGEDWEAPON
    :object/weight   3
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art134.bmp"
    :object/value    11
    :object/price    100}
   {:object/name     "Bubble"
    :object/kind     O_CLASS_TRINKET
    :object/weight   0
    :object/requires #{O_REQ_NOTHING}
    :object/icon     "art/magus.art92.bmp"
    :object/value    0
    :object/price    150}
   {:object/name     "Faithful"
    :object/kind     O_CLASS_ARROWS
    :object/weight   0
    :object/requires #{O_REQ_NOTHING}
    :object/icon     "art/magus.art142.bmp"
    :object/value    0
    :object/price    50}
   {:object/name     "SunBow"
    :object/kind     O_CLASS_SPECIAL
    :object/weight   3
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art150.bmp"
    :object/value    11
    :object/price    150}
   {:object/name     "Chock"
    :object/kind     O_CLASS_SPECIAL
    :object/weight   4
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art143.bmp"
    :object/value    2
    :object/price    150}
   {:object/name     "BloodTaste"
    :object/kind     O_CLASS_WEAPON
    :object/weight   9
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art144.bmp"
    :object/value    19
    :object/price    200}
   {:object/name     "SunArmour"
    :object/kind     O_CLASS_ARMOR
    :object/weight   4
    :object/requires #{O_REQ_BODY}
    :object/icon     "art/magus.art149.bmp"
    :object/value    6
    :object/price    150}
   {:object/name     "ShadowCloak"
    :object/kind     O_CLASS_ARMOR
    :object/weight   3
    :object/requires #{O_REQ_BODY O_REQ_SHOULDERS}
    :object/icon     "art/magus.art148.bmp"
    :object/value    7
    :object/price    20}
   {:object/name     "Elven cloak"
    :object/kind     O_CLASS_ARMOR
    :object/weight   1
    :object/requires #{O_REQ_SHOULDERS}
    :object/icon     "art/magus.art147.bmp"
    :object/value    3
    :object/price    50}
   {:object/name     "Focus"
    :object/kind     O_CLASS_GADGET
    :object/weight   1
    :object/requires #{O_REQ_HANDS}
    :object/icon     "art/magus.art146.bmp"
    :object/value    0
    :object/price    150}
   {:object/name     "Terror"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art153.bmp"
    :object/value    7
    :object/price    0}
   {:object/name     "Berzerk"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art152.bmp"
    :object/value    3
    :object/price    0}
   {:object/name     "Protection"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art151.bmp"
    :object/value    2
    :object/price    0}
   {:object/name     "Leadball"
    :object/kind     O_CLASS_THROWINGWEAPON
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art145.bmp"
    :object/value    8
    :object/price    10}
   {:object/name     "Wooden shield"
    :object/kind     O_CLASS_ARMOR
    :object/weight   2
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art163.bmp"
    :object/value    3
    :object/price    10}
   {:object/name     "Wakizashi"
    :object/kind     O_CLASS_WEAPON
    :object/weight   2
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art164.bmp"
    :object/value    9
    :object/price    20}
   {:object/name     "SunHelmet"
    :object/kind     O_CLASS_ARMOR
    :object/weight   2
    :object/requires #{O_REQ_HEAD}
    :object/icon     "art/magus.art157.bmp"
    :object/value    3
    :object/price    70}
   {:object/name     "SunShield"
    :object/kind     O_CLASS_ARMOR
    :object/weight   3
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art158.bmp"
    :object/value    6
    :object/price    70}
   {:object/name     "ThunderStorm"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art159.bmp"
    :object/value    25
    :object/price    0}
   {:object/name     "HyperSpace"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art160.bmp"
    :object/value    20
    :object/price    0}
   {:object/name     "Panic"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art161.bmp"
    :object/value    20
    :object/price    0}
   {:object/name     "Shooting star"
    :object/kind     O_CLASS_SPECIAL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art162.bmp"
    :object/value    0
    :object/price    300}
   {:object/name     "Inferno"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art165.bmp"
    :object/value    12
    :object/price    0}
   {:object/name     "Negator"
    :object/kind     O_CLASS_TRINKET
    :object/weight   3
    :object/requires #{O_REQ_NOTHING}
    :object/icon     "art/magus.art114.bmp"
    :object/value    0
    :object/price    150}
   {:object/name     "Chain'n'ball"
    :object/kind     O_CLASS_WEAPON
    :object/weight   5
    :object/requires #{O_REQ_TWOHANDS}
    :object/icon     "art/magus.art170.bmp"
    :object/value    10
    :object/price    0}
   {:object/name     "SunGloves"
    :object/kind     O_CLASS_ARMOR
    :object/weight   1
    :object/requires #{O_REQ_HANDS}
    :object/icon     "art/magus.art171.bmp"
    :object/value    2
    :object/price    20}
   {:object/name     "Delay"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art172.bmp"
    :object/value    2
    :object/price    0}
   {:object/name     "Ghostblade"
    :object/kind     O_CLASS_SPECIAL
    :object/weight   4
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art140.bmp"
    :object/value    9
    :object/price    150}
   {:object/name     "Enchant"
    :object/kind     O_CLASS_SPECIAL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art178.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Purify"
    :object/kind     O_CLASS_SPELL
    :object/weight   0
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art179.bmp"
    :object/value    20
    :object/price    0}
   {:object/name     "Blue"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Green"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Yellow"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Brown"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Red"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Grey"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "White"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Purple"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}
   {:object/name     "Black"
    :object/kind     O_CLASS_POTION
    :object/weight   1
    :object/requires #{O_REQ_ONEHAND}
    :object/icon     "art/magus.art180.bmp"
    :object/value    0
    :object/price    100}])

;
;
;void GetItemDescription( struct item *i, char *s )
;{
;  if (!i) return;
;
;  if (i->id == O_ARROWS)
;    sprintf( s, "%s [%d], weight %d",
;    		    gObjectData[ i->id].name,
;    		    i->modifier,
;    		    i->modifier * gObjectData[ i->id].weight);
;  else if (!i->modifier ||
;  		   gObjectData[ i->id].kind == O_CLASS_POTION ||
;  		   i->id == O_ENCHANTSPELL)
;    sprintf( s, "%s, weight %d",
;                gObjectData[ i->id].name,
;      			gObjectData[ i->id].weight);
;  else
;    sprintf( s, "%s %+d, weight %d",
;                gObjectData[ i->id].name,
;      			i->modifier,
;      			gObjectData[ i->id].weight);
;}
