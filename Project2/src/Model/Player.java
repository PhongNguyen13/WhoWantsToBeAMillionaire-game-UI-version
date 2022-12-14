package Model;

import java.util.Objects;

public class Player implements Comparable<Player> {

    private String userName;
    private int winning;
    private boolean entered;

    public Player() {
        this.userName = null;
        this.winning = 0;
        this.entered = false;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getWinning() {
        return winning;
    }

    public void setWinning(int winning) {
        this.winning = winning;
    }

    public boolean isEntered() {
        return entered;
    }

    public void setEntered(boolean entered) {
        this.entered = entered;
    }

    @Override
    public String toString() {
        return this.getUserName();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.userName);
        return hash;
    }

    /**
     * Check whether the username is existed or not
     *
     * @param obj
     * @return true if the username is already used, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        return true;
    }

    /**
     * Compare the prize of the players
     *
     * @param o
     * @return the higher prize
     */
    
    @Override
    public int compareTo(Player o) {
        return o.winning - this.winning;
    }
}
