public class NotaFiscal {
    
    Cliente cliente;
    Item[] itens;

    private int codNota;
    private double total;
    private double valorParcela;
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Item[] getItens() {
        return itens;
    }
    public void setItens(Item[] itens) {
        this.itens = itens;
    }
    public int getCodNota() {
        return codNota;
    }
    public void setCodNota(int codNota) {
        this.codNota = codNota;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getValorParcela() {
        return valorParcela;
    }
    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }


}
