import java.util.Scanner;

public class UI {

    public void inicioPrograma(){
        escrever("======================");
        escrever("     LOJA ONLINE");
        escrever("======================");

    }

    public void escrever(String msg){
        System.out.println(msg);
    }
    
    public void pularLinha(){
        System.out.println(" ");
    }

    public String pedirTexto(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        String txt = sc.nextLine();

        return txt;
        
    }

    public String pedirTextos(String msg,String msg2,String msg3,String msg4){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        System.out.println(msg2);
        System.out.println(msg3);
        System.out.println(msg4);
        String txt = sc.nextLine();

        return txt;
        
    }
    public int pedirInt(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int in = sc.nextInt();

        return in;
        
    }
    public double pedirDouble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        double dbl = sc.nextDouble();

        return dbl;
        
    }

    public void notaFiscal(NotaFiscal nota){
        
        escrever("======================");
        escrever("     NOTA FISCAL");
        escrever("======================");
        pularLinha();
        escrever("Cliente: " + nota.getCliente().getNome());
        escrever("Email: " + nota.getCliente().getEmail());
        pularLinha();
        escrever("======================");
        escrever("       PRODUTOS");
        escrever("======================");
        
        for (Item item : nota.getItens()) {
            escrever("Produto: " + item.getNome());
            escrever("Preço: R$" + item.getPreco());
            pularLinha();
        }
        
        escrever("======================");
        escrever("      DESCRIÇÃO");
        escrever("======================");
        pularLinha();
        escrever("Código: " + nota.getCodNota());
        escrever("Total: R$" + nota.getTotal());
        escrever("Valor Parcela: R$" + String.format("%.1f", nota.getValorParcela()));;
        pularLinha();
        escrever("======================");
        escrever("AGRADECEMOS A PREFERÊNCIA!");
        escrever("======================");
     


    }
    
}
