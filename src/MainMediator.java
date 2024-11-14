// Clase principal para ejecutar el ejemplo del patrón Mediator
public class MainMediator {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator(); // Crea un nuevo Mediador

        // Crea proveedores de catering y música
        Proveedor catering = new ProveedorCatering("Catering XYZ");
        Proveedor musica = new ProveedorMusica("Música ABC");

        // Agrega proveedores al mediador
        mediator.agregarProveedor(catering);
        mediator.agregarProveedor(musica);

        mediator.coordinar(); // Llama a la coordinación de proveedores
    }
}