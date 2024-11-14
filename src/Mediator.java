// Interfaz que define las operaciones del Mediator
interface Mediator {
    void coordinar(); // Método para coordinar proveedores
    void agregarProveedor(Proveedor proveedor); // Método para agregar nuevos proveedores
}