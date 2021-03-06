package edu.gatech.gem5.game.data;

/**
 * A container class for data of the various tech level types.
 *
 * @author Creston Bunch
 */

public class TechType {

    private String name;
    private int rank;
    private double occurrence;
    private double wealth;

    /**
     * Get the name of this tech level.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the rank of this tech level.
     *
     * @return the rank
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Get the occurrence of this tech level.
     *
     * @return the occurrence
     */
    public double getOccurrence() {
        return this.occurrence;
    }

    /**
     * Get the wealth of this tech level.
     *
     * @return the wealth
     */
    public double getWealth() {
        return this.wealth;
    }

}
