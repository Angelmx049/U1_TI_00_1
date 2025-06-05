import javax.swing.*;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario.isEmpty()) {
            this.nombreUsuario = nombreUsuario;
        } else {
            System.out.println("El nombre no puede ser nulo ni vacio");

        }
    }

    public void setPassword(String password) {
        if(password.length() < 8) {
            System.out.println(" La contraseña debe ser de 8 caracteres");
        } else if (password.length() > 8) {
            System.out.println(" La contraseña debe ser menor que 8 caracteres");
        }

        int mayuscula = 0;
        int minuscula = 0;
        int digitos = 0;

        for(int e = 0; e < password.length(); e++) {
            char c = password.charAt(e);
            if (Character.isUpperCase(c)) mayuscula ++;
            else if (Character.isLowerCase(c)) minuscula ++;
            else if (Character.isDigit(c)) digitos++;
        }

        if (mayuscula > 0 && minuscula > 0 && digitos > 0) {
            this.password = password;
        }
        else {
            System.out.println("Ingrese una contraseña valida");
        }
    }

    public boolean autenticar(String intentPassword){
        if (intentPassword.equals(this.password)){
            return true;
        }
        return false;
    }
}
