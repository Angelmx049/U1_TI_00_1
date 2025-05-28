public class Computadora {

    private String marca;
    private String modelo;
    private Boolean encendida;


    public Computadora() {
        this.encendida = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getEncendida() {
        return encendida;
    }

    public void encender() {
        if(!encendida){
            encendida = true;
            System.out.println("Encendida");
        }
    }

    public void apagar(){
        if(encendida){
            encendida = false;
            System.out.println("Apagando");
        }
    }

}
