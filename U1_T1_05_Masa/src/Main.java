import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el altura"));

        Persona per = new Persona();

        per.setNombre(nombre);
        per.setPeso(peso);
        per.setAltura(altura);

        System.out.println("Nombre: " + per.getNombre());
        System.out.println("Peso: " + per.getPeso());
        System.out.println("Altura: " + per.getAltura());
        System.out.println("IMC: " + per.calculaIMC());
        System.out.println("Tu nivel es: " + per.clasificarIMC());
    }
}