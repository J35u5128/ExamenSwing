import javax.swing.*;
import java.awt.event.*;

public class AddUsuario extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField Email;
    private JRadioButton Spain;
    private JRadioButton France;
    private JRadioButton Italy;
    private JRadioButton Windows;
    private JRadioButton Germany;
    private JRadioButton MacOS;
    private JRadioButton Linux;
    private ListaUsuarios listaUsuarios;

    public AddUsuario(ListaUsuarios listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        String email = Email.getText();
        String pais = "";
        if (Spain.isSelected()) {
            pais = "Spain";
        } else if (France.isSelected()) {
            pais = "France";
        } else if (Italy.isSelected()) {
            pais = "Italy";
        } else if (Germany.isSelected()) {
            pais = "Germany";
        }
        String so = "";
        if (Windows.isSelected()) {
            so = "Windows";
        } else if (MacOS.isSelected()) {
            so = "MacOS";
        } else if (Linux.isSelected()) {
            so = "Linux";
        }
        listaUsuarios.anadirUsuario(email, pais, so);
        dispose();
    }

    private void onCancel() {
        dispose();
    }
}
