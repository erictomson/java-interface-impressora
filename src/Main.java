public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        Foto foto = new Foto();
        Documento documento = new Documento();

        contrato.setNome("Contrato 1");
        contrato.setTipo("Tipo X");

        documento.setNome("Documento 1");
        documento.setTipo("Tipo X");

        foto.setNome("Foto 1");
        foto.setTipo("Tipo X");

        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(documento);
        Impressora.adicionarImprimivel(foto);

        Impressora.imprimirTudo();
    }

}
