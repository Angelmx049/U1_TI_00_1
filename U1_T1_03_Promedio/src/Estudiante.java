package Model;
public class Estudiante {

        private String nombre;
        private String matricula;
        private double[] notas = new double[5];

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getMatricula() {
                return matricula;
        }

        public void setMatricula(String matricula) {
                this.matricula = matricula;
        }

        public double getNota(int posicion) {
                return this.notas[posicion];
        }

        public void setNota(int posicion, double valor){
                this.notas[posicion]= valor;
        }
}
