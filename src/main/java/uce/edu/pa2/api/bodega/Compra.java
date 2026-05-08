package uce.edu.pa2.api.bodega;

public class Compra {
    private Cliente cliente;
    private Double subTotal;
    private Double total;
    
    public Compra(){}

    public Compra(Cliente cliente, Double subTotal) {
        this.cliente = cliente;
        this.subTotal = subTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubtotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
