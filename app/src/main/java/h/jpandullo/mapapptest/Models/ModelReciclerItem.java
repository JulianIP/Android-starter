package h.jpandullo.mapapptest.Models;

public class ModelReciclerItem {
    public String nombre;
    public String descripcion;

    public ModelReciclerItem(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
