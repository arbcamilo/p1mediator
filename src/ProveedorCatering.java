// Clase que representa un proveedor de catering
class ProveedorCatering extends Proveedor {
    public ProveedorCatering(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicar() {
        System.out.println(nombre + " está listo para ofrecer comida."); // Comunicación del proveedor de catering
    }
}