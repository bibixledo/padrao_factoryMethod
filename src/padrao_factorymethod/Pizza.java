package padrao_factorymethod;

public abstract class Pizza {
    protected String sabor;
    protected String tamanho;
    protected float preco;
    protected String borda;
    protected String adicionais;
   
    public String getSabor(){return sabor;}
    public String getTamanho(){return tamanho;}
    public float getPreco(){return preco;}
    public String getBorda(){return borda;}
    public String getAdicionais(){return adicionais;}
}
