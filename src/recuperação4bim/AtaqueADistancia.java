package recuperação4bim;
public class AtaqueADistancia extends Arma {

    public AtaqueADistancia(String nome, int danoMax, int durabilidade) {
        super(nome, danoMax, durabilidade);
    }
    public boolean usaApenasUmaMao(){
        return false;
    }
}
