public class Producto {

    private String codigo;
    private String nombre;
    private int cantidad;

    public Producto(String codigo,String nombre,int cantidad){
        this.codigo=codigo;
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCodigo(String codigo) {
        if (codigo == null && codigo.isEmpty()) {
            this.codigo = " ";
        } else {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }
}
