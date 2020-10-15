
package aplicação;
import java.util.Scanner;

public class compra {
    compramodel compra;
    calculo desc;
    
    /**
     *
     */
    public void realizarcompra(){
        compra = new compramodel();
        
        Scanner dados = new Scanner(System.in);
        System.out.print("Informe o valor da compra:");
        compra.setvalor(dados.nextInt());
        
        
        System.out.print("Informe idade:");
        compra.setidade(dados.nextInt());
        
        
        desc = new calculo();
        compra.setdesconto(desc.calculardesconto(compra.getvalor(),compra.getidade()));
        compra.settotal(desc.calculartotal(compra.getvalor(),compra.getdesconto()));
   System.out.println("valor do desconto:"+compra.getdesconto());
 System.out.println("valor a pagar:"+ compra.gettotal()); 
    }

    void realizarcomrpa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static class realizarcomrpa {

        public realizarcomrpa() {
        }
    }

    static class realizarcompra {

        public realizarcomrpa() {
        }
    }
