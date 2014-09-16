package edu.gatech.gem5.game;

public class Character extends Human {

    public Character(String name, int pilot, int fighter, int trader, int engineer, int investor, Ship ship) {
        super(name, pilot, fighter, trader, engineer, investor, ship);
    }

    public String toString() {
        return "*PLAYER CHARACTER*\n" + super.toString();
    }

    public static Character createCharacterFromStrings(String nameString, String pilotString, String fighterString, String traderString, String engineerString, String investorString, String shipString) {
        int pilot = Integer.parseInt(pilotString);
        int fighter = Integer.parseInt(fighterString);
        int trader = Integer.parseInt(traderString);
        int engineer = Integer.parseInt(engineerString);
        int investor = Integer.parseInt(investorString);
        // Implement this with a Ship constructor once Ship class is created.
        // Ship ship = null;
        Ship ship = new Gnat();

        return new Character(nameString, pilot, fighter, trader, engineer, investor, ship);
    }
}