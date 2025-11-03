import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaUsuarios extends JFrame {
    private JButton buttonAnhadir;
    private JTextArea AreaUsuarios;
    private JPanel Panel;

    public ListaUsuarios() {
        super("Lista de Usuarios");
        setContentPane(Panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

        buttonAnhadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddUsuario addUsuario = new AddUsuario(ListaUsuarios.this);
                addUsuario.pack();
                addUsuario.setVisible(true);
            }
        });
    }

    public void anadirUsuario(String email, String pais, String so) {
        Usuario usuario = new Usuario(email, pais, so);
        AreaUsuarios.append(usuario.toString() + "\n");
    }
}
