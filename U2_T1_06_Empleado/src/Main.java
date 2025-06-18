
public class Main {
    public static void main(String[] args) {


        EmpleadoTiempoCompleto Empleado1 = new EmpleadoTiempoCompleto("20243ds" , "Angel",500, "0");
        System.out.println(Empleado1.calcularSalario());

        EmpleadoPorHoras Empleado2 = new EmpleadoPorHoras("20242ds","Aguilar",400,8);
        System.out.println(Empleado2.calcularSalario());



    }
}