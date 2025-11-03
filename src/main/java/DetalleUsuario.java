import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetalleUsuario extends JDialog {
    private JPanel contentPane;
    private JLabel labelEmail;
    private JLabel labelPais;
    private JLabel labelPlataforma;
    private JButton buttonCerrar;


    public DetalleUsuario(Usuario usuario) {
        setContentPane(contentPane);
        setModal(true);

        labelEmail.setText(usuario.getEmail());
        labelPais.setText(usuario.getPais());
        labelPlataforma.setText(usuario.getPlataforma());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        buttonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(false);
            }
        });
    }
}
