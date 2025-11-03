import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ListaUsuarios listaUsuarios = new ListaUsuarios();
        listaUsuarios.setVisible(true);
        listaUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listaUsuarios.pack();
        listaUsuarios.setLocationRelativeTo(null);
    }
}
