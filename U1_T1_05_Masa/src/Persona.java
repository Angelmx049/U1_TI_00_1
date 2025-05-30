import java.security.spec.RSAOtherPrimeInfo;

public class Persona {

    private String nombre;
    private double altura;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calculaIMC(){
        return peso/(altura*altura);
    }

    public String clasificarIMC(){
        double imc = calculaIMC();

        if (calculaIMC()<18.5){
            return  "Bajo peso";
        }
        else if (calculaIMC()>18.5&&calculaIMC()<25){
            return  "Altura";
        }
        else if (calculaIMC()>25&&calculaIMC()<30){
            return  "Peso";
        }
        else {
            return  "Obesidad";
        }
    }

}
