package recuperação4bim;
public class Pocao extends Item implements IUsavel {
    private int HPRestaurado;
    String nome = getNome();
    public Pocao(String nome, int danoMax, int durabilidade) {
        super(nome, danoMax, durabilidade);
    }
    
    public String examinar(){
        return "Nome: "+nome+"; Valor do HP: "+HPRestaurado;
    }

    public void Pocao (String nome, int HPRestaurado){
    }
    @Override
    public int usar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getHPRestaurado() {
        return HPRestaurado;
    }

    public void setHPRestaurado(int HPRestaurado) {
        this.HPRestaurado = HPRestaurado;
    }
}
