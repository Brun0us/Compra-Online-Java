public class LojaOnline {
    
    public NotaFiscal efetuarCompra(Compra compra){
        
        NotaFiscal notaF = new NotaFiscal();
        notaF.setCliente(compra.getCliente());;
        notaF.setItens(compra.getCarrinho());
        notaF.setCodNota(gerarCodNota());
        notaF.setTotal(calcularTotal(compra));
        notaF.setValorParcela(calcularParcela(notaF.getTotal(), compra.getParcelas()));

        return notaF;
    }

    private double calcularTotal(Compra compra){
        double total = 0;
        for (Item itens : compra.getCarrinho()) {
            double itensPreco = itens.getPreco();
            total = total + itensPreco;
        }

        double cupom = verificarCupom(compra.getCupom());

        total = total - cupom;

        if(compra.getFormaPag().equals("DÉBITO") == true){
            double desc = 0.05 * total;
            total = total - desc;
        }
        else if(compra.getFormaPag().equals("PIX") == true){
            double desc = 0.10 * total;
            total = total - desc;
        }
        
        return total;

    }

    private double verificarCupom (String cupom){
        double c;
        if (cupom.equals("QUERO100")){
            c = 100;
            return c;
        }
        else if (cupom.equals("QUERO200")){
            c = 200;
            return c;
        }
        else if (cupom.equals("QUERO500")){
            c = 500;
            return c;
        }
        else return 0;

    }

    private double calcularParcela(double total, int parcelas){
        double soma = (1 + 0.03);
        double p = total * (0.03 * (Math.pow(soma, parcelas))) / ((Math.pow(soma, parcelas) - 1));
        return p;
    }

    private int gerarCodNota(){
        int cod = (int) (Math.random() * 999);
        return cod;
    }

}


