package it.polimi.ingsw.model.cards;

/**
 * Class representing game's starter cards
 * It extends Card
 */
public class StarterCard extends Card{
    private final Kingdom[] frontKingdoms;

    /**
     * Starter card constructor, it assigns all the parameters
     *
     * @param side for card side. true => Front, false => Back
     * @param frontCorners for card's front corners
     * @param backCorners for card's back corners
     * @param frontKingdoms for card's front kingdoms
     */
    public StarterCard(boolean side, Corner[] frontCorners, Corner[] backCorners, Kingdom[] frontKingdoms, int ID) {
        super(side, frontCorners, backCorners, ID); // Using the constructor with backCorners
        this.frontKingdoms = frontKingdoms;
    }

    /**
     * frontKingdom getter
     *
     * @return array of front kingdoms
     */
    public Kingdom[] getFrontKingdoms() {
        return frontKingdoms;
    }
}