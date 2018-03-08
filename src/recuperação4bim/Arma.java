package recuperação4bim;
import java.util.Random;
public abstract class Arma {
    private int danoMax;
    int durabilidade;
    String nome;
    public Arma(String nome,int danoMax,int durabilidade){
        this.nome=nome;
        this.durabilidade=durabilidade;
        this.danoMax=danoMax;
    }
    public int atacar(){
    Random randon = new Random();
    int ale = randon.nextInt(danoMax+1);
    if ( durabilidade == 0){
        ale = 0;
    }
        return ale;
    }
    public boolean usaApenasUmaMao(){
        return false;
    }
    public String examinar(){
                return "nome: "+nome+"; Dano máximo: "+danoMax+"; Durabilidade: "+"; Arma de 1 mão: "+usaApenasUmaMao();
    }

    public int getDanoMax() {
        return danoMax;
    }

    public void setDanoMax(int danoMax) {
        this.danoMax = danoMax;
    }
    
}
