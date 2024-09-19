package it.polimi.ingsw.model.game;

import it.polimi.ingsw.model.cards.*;
import it.polimi.ingsw.model.exception.*;

import java.util.*;

/**
 * Class to handle the gaming decks(resource, golden, starting decks)
 */
public class GamingDeck {
    private final ArrayList<Card> deck; // List of Card: use polymorphism

    /**
     * GamingDeck constructor
     *
     * @param deck deck to assign
     */
    public GamingDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    /**
     * Method for returning size of the deck
     *
     * @return size of the deck
     */
    public int deckSize() {
        return deck.size();
    }

    /**
     * deck getter
     *
     * @return deck
     */
    public ArrayList<Card> getDeck() {
        return deck;
    }

    /**
     * Method for shuffling the deck
     */
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    /**
     * Method for drawing a card from the deck
     *
     * @return the top card of the deck and remove it from the list of cards
     * @throws EmptyDeckException if the deck is empty
     */
    public Card drawTopCard() throws EmptyDeckException {
        if (deck.isEmpty()) { // Deck is empty => Throw new EmptyDeckException
            throw new EmptyDeckException("This deck is empty, you can't draw from this deck.");
        } else { // Deck has at least a card that can be drawn
            return deck.removeLast();
        }
    }
}