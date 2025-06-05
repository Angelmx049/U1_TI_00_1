//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        UsuarioSeguro usuario = new UsuarioSeguro();

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        usuario.setNombreUsuario(nombre);

        if (nombre == null && nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no es válido.");
            return;
        }

        String password = JOptionPane.showInputDialog("Ingrese una contraseña válida:");
        usuario.setPassword(password);

        String intento1 = JOptionPane.showInputDialog("Ingrese la contraseña para autenticar:");
        if (usuario.autenticar(intento1)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }
}
