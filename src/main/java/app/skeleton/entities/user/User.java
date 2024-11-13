package app.skeleton.entities.user;

import java.util.UUID;

import static skeleton.common.SystemErrors.INVALID_PASSWORD;
import static skeleton.common.SystemErrors.INVALID_USERNAME;

// TODO: Implement the entity
public class User {

    private UUID id;
    private String username;
    private String password;

    public User (String username, String password, UUID id) {
        setUsername(username);
        setPassword(password);
        this.id = UUID.randomUUID();
    }

    private void setUsername(String username) {
        if (username.length() > 5 && containsDigit(username)) {
            this.username = username;
        } else {
            throw new IllegalArgumentException(INVALID_USERNAME);
        }
    }

    private boolean containsDigit(String username) {
        boolean hasDigit = false;
        for (char c : username.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        return hasDigit;
    }

    private void setPassword(String password) {
        if (password.length() == 6 && containsOnlyOneDigit(password)){
            this.password = password;
        } else {
            throw new IllegalArgumentException(INVALID_PASSWORD);
        }
    }

    private boolean containsOnlyOneDigit(String password) {
        boolean hasOnlyOneDigit = false;
        int sumOfDigits = 0;
        for (char c : username.toCharArray()) {
            if (Character.isDigit(c)) {
                sumOfDigits++;
            }
        }
        if (sumOfDigits == 1){
            hasOnlyOneDigit = true;
        }
        return hasOnlyOneDigit;
    }

}
