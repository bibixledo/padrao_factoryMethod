package padrao_factorymethod;

public class FabricaDePizza {
    public static Pizza getPizza(String tipoDaPizza){
        Pizza obj = null;
        if(tipoDaPizza.equalsIgnoreCase("Doce")){
            obj = new Doce();
        }
        else if(tipoDaPizza.equalsIgnoreCase("Salgada")){
            obj = new Salgada();
        }
        else if(tipoDaPizza.equalsIgnoreCase("Integral")){
            obj = new Integral();
        }       
        return obj;
    }
}
