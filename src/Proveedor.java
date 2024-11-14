// Clase abstracta que define un proveedor
abstract class Proveedor {
    protected Mediator mediator; // Referencia al Mediador
    protected String nombre; // Nombre del proveedor

    public Proveedor(String nombre) {
        this.nombre = nombre; // Constructor para establecer el nombre
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator; // Establece el mediador
    }

    public abstract void comunicar(); // Método abstracto a implementar por los proveedores
}