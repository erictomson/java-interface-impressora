// Documento: Um Documento tem nome e tipo e ao imprimir mostra na
// tela “Sou um documento do Word” junto com o nome e tipo.
// Criar

public class Documento implements Imprimivel {
    //Atributos da classe Contrato
    private String nome;
    private String tipo;

    public Documento() {
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
        System.out.println("Sou um documento do Word. Documento: " + getNome() + " | Tipo: " + getTipo());
    }
}
