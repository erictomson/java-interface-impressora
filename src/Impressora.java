// Criar uma classe abstrata Impressora contendo uma lista de imprimíveis.
public abstract class Impressora {

    // Lista de impressão
    private static Imprimivel[] documentos = new Imprimivel[10];

    // Controlar posição na lista de imprimíveis
    private static int posLista=-1;

    // Esse método será encarregado de percorrer a
    // lista de imprimíveis e fazer a impressão
    public static void imprimirTudo(){
        for(int i=0;i<documentos.length;i++) {
            if(documentos[i] == null) {
                break;
            }
            documentos[i].imprimir();
            documentos[i]=null;
        }
    }

    // Esse método será encarregado de adicionar um imprimível à lista da impressora.
    public static void adicionarImprimivel(Imprimivel imprimivel){
        for(int i=0;i<documentos.length;i++) {
            if(documentos[i] == null) {
                documentos[i] = imprimivel;
                break;
            }
        }
    }
    //posLista++;
    //documentos[posLista]=imprimivel;


}
