package it.polimi.ingsw.model.cards;

/**
 * Class representing card's corner
 */
public class Corner {
    private boolean visible; // If true => Corner is visible and a card can be played on
                             // If false => Corner is already occupied by a card
    private final boolean empty; // If true => A card can be played on this corner, if is visible
                                 // If false => The corner is empty, so no card can be played on this corner
    private final GameObject object; // NONE if the corner doesn't contain an object
    private final Kingdom kingdom; // NONE if the corner doesn't contain a kingdom

    /**
     * Corner constructor, it assigns all the parameters (with back corners)
     *
     * @param visible for corner visibility. true => Corner is visible, false => Corner not visible
     * @param empty for corner emptiness. true => Corner empty, false => Corner not empty
     * @param object for corner's object (Can be NONE)
     * @param kingdom for corner's kingdom (Can be NONE)
     */
    public Corner(boolean visible, boolean empty, GameObject object, Kingdom kingdom) {
        this.visible = visible;
        this.empty = empty;
        this.object = object;
        this.kingdom = kingdom;
    }

    /**
     * visible getter
     *
     * @return boolean for visibility. true => Corner is visible, false => Corner not visible
     */
    public boolean getVisible() {
        return visible;
    }

    /**
     * visible setter
     *
     * @param visible boolean for visibility. true => Corner is visible, false => Corner not visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * empty getter
     *
     * @return boolean for emptiness. true => Corner is empty, false => Corner not empty
     */
    public boolean getEmpty() {
        return empty;
    }

    /**
     * object getter
     *
     * @return corner's object
     */
    public GameObject getObject() {
        return object;
    }

    /**
     * kingdom getter
     *
     * @return corner's kingdom
     */
    public Kingdom getKingdom() {
        return kingdom;
    }
}