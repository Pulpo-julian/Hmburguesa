public enum Precio {
    A(12000, "A"),
    B(15000, "B"),
    C(18000, "C");

    private Integer valor;
    private String tipo;

    Precio(Integer valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public Integer getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}
