// Foto: Uma foto tem nome e tipo e ao imprimir mostra na tela imprime na
// tela “Sou uma selfie” junto com o nome e tipo.

public class Foto implements Imprimivel {
    //Atributos da classe Contrato
    private String nome;
    private String tipo;

    public Foto() {
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
        System.out.println("Sou uma selfie. Foto: " + getNome() + " | Tipo: " + getTipo());
    }
}
