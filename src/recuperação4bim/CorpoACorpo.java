package recuperação4bim;
public class CorpoACorpo extends Arma {

    public CorpoACorpo(String nome, int danoMax, int durabilidade) {
        super(nome, danoMax, durabilidade);
    }
        public boolean usaApenasUmaMao(){
        return true;
    }
}
