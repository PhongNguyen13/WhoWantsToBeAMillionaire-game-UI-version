package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

public class PlayerController implements MouseListener {

    public PlayerFrame view;
    public PlayerModel model;

    public PlayerController(PlayerFrame view, PlayerModel model) {
        this.view = view;
        this.model = model;
        this.view.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String username = this.view.getUserNameField().getText();
        this.model.checkUserName(username);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.view.getContinueLabel().setIcon(new ImageIcon("src/Image/Continue2.png"));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.view.getContinueLabel().setIcon(new ImageIcon("src/Image/Continue.png"));
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

}
