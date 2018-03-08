package recuperação4bim;
public class Personagem extends Item {
    private String nome;
    private int maxHP;
    private int HPAtual;
    boolean maosLivres=true;
    public Personagem(String nome, int danoMax, int durabilidade) {
        super(nome, danoMax, durabilidade);
    }
    public void Personagem(String nome, int maxHP){
        setNome(nome);
        setMaxHP(maxHP);
    }
        public void equiparArma(Arma a){
            if (maosLivres){
                if (usaApenasUmaMao()){
                    System.out.println("Arma equipada na mão direita!");
                }else{
                    System.out.println("Arma equipada nas duas mãos!");
                    maosLivres=false;
                }
            }
        }
        public void addPocao(Pocao p){
            
        }
        public void recuperarVida(){
            
        }
        public int sofrerDano (int dano)throws PersonagemFalecidoException {
            int danoRestante = HPAtual - dano;
            if (danoRestante<=0){
                throw new PersonagemFalecidoException();
            }else{
                return danoRestante;
            }
        }
        public String status(){
            String infoArma;
            String infoPoc;
            return "nome: " + nome + "; HP atual: " + HPAtual + "; HP máximo: " + maxHP + ";";
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHPAtual() {
        return HPAtual;
    }
    public void setHPAtual(int HPAtual) {
        this.HPAtual = HPAtual;
    }
}
