// Contrato: Um contrato tem nome e tipo e ao imprimir mostra na tela “Sou
// um contrato muito legal” junto com o nome e tipo.

public class Contrato implements Imprimivel {
    //Atributos da classe Contrato
    private String nome;
    private String tipo;

    public Contrato() {
        this.setNome("");
        this.setTipo("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal. Contrato: " + getNome() + " | Tipo: " + getTipo());
    }
}
