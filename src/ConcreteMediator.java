// Clase que implementa el Mediator
import java.util.ArrayList;
import java.util.List;

class ConcreteMediator implements Mediator {
    private List<Proveedor> proveedores = new ArrayList<>(); // Lista de proveedores

    @Override
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor); // Agrega un nuevo proveedor y establece el mediador
        proveedor.setMediator(this);
    }

    @Override
    public void coordinar() {
        System.out.println("Coordinando proveedores:");
        for (Proveedor proveedor : proveedores) {
            proveedor.comunicar(); // Llama a la comunicación de cada proveedor
        }
    }
}