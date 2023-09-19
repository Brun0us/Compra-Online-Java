public class Main {
    public static void main(String[] args) {
       UI tela = new UI();

       tela.inicioPrograma();

       Compra compra = new Compra();

       Cliente cliente = new Cliente();
       cliente.setNome(tela.pedirTexto("Qual seu nome: "));
       cliente.setEmail(tela.pedirTexto("Email: "));
       tela.pularLinha();

       compra.setCliente(cliente);
       compra.setCupom(tela.pedirTexto("Adicionar CUPOM: "));
       if (compra.getCupom().equals("QUERO100")){
        System.out.println("CUPOM VALIDO");
       }
       else if (compra.getCupom().equals("QUERO200")){
        System.out.println("CUPOM VALIDO");
       }
       else if (compra.getCupom().equals("QUERO500")){
        System.out.println("CUPOM VALIDO");
       }
       else System.out.println("CUPOM INVALIDO");
       
       tela.pularLinha();

       
       int nProdutos = tela.pedirInt("Quantos produtos você comprou:");
       tela.pularLinha();


       Item[] produtos = new Item[nProdutos];
       for (int i = 0; i < produtos.length; i++) {
        Item novoProduto = new Item();
        novoProduto.setNome(tela.pedirTexto("Nome do Produto: "));
        novoProduto.setPreco(tela.pedirDouble("Qual o preço: "));

        produtos[i] = novoProduto;
       
        tela.pularLinha();
       }

       compra.setCarrinho(produtos);

       compra.setFormaPag(tela.pedirTextos("Qual a forma de Pagamento:", "CRÉDITO", "DÉBITO", "PIX"));
       if(compra.getFormaPag().equals("CRÉDITO") == true) {
        System.out.println("FORMA DE PAGAMENTO VALIDA!");
       }
       else if(compra.getFormaPag().equals("DÉBITO") == true) {
        System.out.println("FORMA DE PAGAMENTO VALIDA!");
       }
       else if(compra.getFormaPag().equals("PIX") == true) {
        System.out.println("FORMA DE PAGAMENTO VALIDA!");
       }
       else System.out.println("FORMA DE PAGAMENTO INVALIDA");

       tela.pularLinha();

       compra.setParcelas(tela.pedirInt("Quantas parcelas: "));

       LojaOnline loja = new LojaOnline();
       NotaFiscal nota = loja.efetuarCompra(compra);

       tela.notaFiscal(nota);

    }
}
