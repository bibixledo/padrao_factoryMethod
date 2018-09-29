package padrao_factorymethod;
import javax.swing.JOptionPane;

public class Padrao_FactoryMethod {
    
    //Imprimir os dados do objeto
    public static void imprimir(Pizza obj){
        String saida = "SABOR: " + obj.getSabor() + "\n";
        saida += "TAMANHO: " + obj.getTamanho() + "\n";
        saida += "BORDA: " + obj.getBorda() + "\n" ;
        saida += "ADICIONAIS: " + obj.getAdicionais() + "\n";
        saida += "PREÇO: R$ " + obj.getPreco() + "\n";
        JOptionPane.showMessageDialog(null, saida);
    }
   
    public static void main(String[] args) {
        
        boolean controle = true;
        Object[] opcoes = { "Doce", "Salgada","Integral"};
        Object tipoDaPizza;
        do{
            tipoDaPizza = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"Doce");
            Pizza obj = FabricaDePizza.getPizza(tipoDaPizza.toString());
            imprimir(obj);
        }while(controle);
    } 
}
