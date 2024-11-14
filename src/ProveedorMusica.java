// Clase que representa un proveedor de música
class ProveedorMusica extends Proveedor {
    public ProveedorMusica(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicar() {
        System.out.println(nombre + " está listo para proporcionar música."); // Comunicación del proveedor de música
    }
}