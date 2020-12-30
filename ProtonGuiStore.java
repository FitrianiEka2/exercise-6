import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProtonGuiStore {
    private JPanel ProtonStore;
    private JTextField tfname;
    private JTextField tfphone;
    private JTextField tfgmail;
    private JList listPersona;
    private JList listSaga;
    private JList listx70;
    private JList listx50;
    private JTextField tfincome;
    private JTextField tfinstallment;
    private JButton calculateInstallmentButton;
    private JButton cancelButton;
    private JButton exitButton;
    private JButton protonSagaButton;
    private JButton protonX70Button;
    private JButton protonX50Button;
    private JButton protonPersonaButton;

    public ProtonGuiStore() {
        calculateInstallmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double income, installment;
                double month = 60;
                double price = 46200;
                income = Double.parseDouble(tfincome.getText());

                installment = price / income / month;
                tfinstallment.setText(String.valueOf(installment));
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfincome.setText("");
                tfinstallment.setText("");
                tfincome.requestFocus();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ProtonGuiStore");
        frame.setContentPane(new ProtonGuiStore().ProtonStore);
        frame.pack();
        frame.setVisible(true);
    }
}