package it.polimi.ingsw.model.exception;

/**
 * Exception raised when try to get a player from gameTable with a given username
 */
public class NoPlayerWithSuchUsernameException extends Exception {
    public NoPlayerWithSuchUsernameException(String message) {
        super(message);
    }
}