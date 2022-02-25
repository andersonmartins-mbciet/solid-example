package solid.ocp.solucao;

import java.util.List;

public class GeradorDeArquivos {
    public void gerarArquivos(List<Arquivo> arquivos) {
        for (Arquivo arquivo: arquivos) {
            arquivo.gerar();
        }
    }
}
