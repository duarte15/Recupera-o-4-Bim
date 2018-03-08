package recuperação4bim;
public abstract class Item extends Arma{
    private String nome;
    int danoMax = getDanoMax();
    public Item(String nome, int danoMax, int durabilidade) {
        super(nome, danoMax, durabilidade);
    }
    public String examinar(){
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
