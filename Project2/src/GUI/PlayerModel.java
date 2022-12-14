package GUI;

import java.util.Observable;
import Model.Player;

public class PlayerModel extends Observable {

    public Player player;

    public PlayerModel() {
        this.player = new Player();
    }

    public void setUserName(String username) {
        this.player.setUserName(username);
    }

    public void checkUserName(String username) {
        if (!username.isEmpty()) {
            this.setUserName(username);
            this.player.setEntered(true);
        } else {
            this.player.setEntered(false);
        }
        this.setChanged();
        this.notifyObservers(this.player);
    }
}
