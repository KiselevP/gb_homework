package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private JTextField inputfield;

    public ButtonListener(JTextField inputField) {
        this.inputfield = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton btn = (JButton) actionEvent.getSource();
        inputfield.setText(inputfield.getText() + " " + btn.getText());
    }
}
