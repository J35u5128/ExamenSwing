import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetalleUsuario extends JDialog {
    private JPanel contentPane;
    private JLabel Email;
    private JLabel Pais;
    private JLabel Plataforma;
    private JLabel TituloUsuario;
    private JButton buttonCerrar;


    public DetalleUsuario(Usuario usuario) {
        setContentPane(contentPane);
        setModal(true);

        Email.setText(usuario.getEmail());
        Pais.setText(usuario.getPais());
        Plataforma.setText(usuario.getPlataforma());
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
