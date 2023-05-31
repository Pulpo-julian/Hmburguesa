import java.util.List;

public class Venta {

    private List<Hamburguesa> hamburguesas;

    private Integer total;

    private boolean tieneDescuento;

    public Venta(List<Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    public List<Hamburguesa> getHamburguesas() {
        return hamburguesas;
    }

    public void validarDescuento(String tipo) {

        long cantidadTipo = hamburguesas.stream()
                .filter(hamburguesa -> hamburguesa.getPrecio().getTipo().equals(tipo))
                .count();

        if(cantidadTipo >= 3) {
            this.tieneDescuento = true;
        }

    }

    public void calcularTotal() {
        int totalVenta = 0;
        for(Hamburguesa hamburguesa: hamburguesas) {
            totalVenta += hamburguesa.getPrecio().getValor();
        }
        this.total = totalVenta;
    }
}
