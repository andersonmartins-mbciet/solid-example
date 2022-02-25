package solid.ocp;

import java.util.List;

public class GeradorDeArquivos {
    public void gerarArquivos(List<Arquivo> arquivos) {
        for (Arquivo arquivo: arquivos) {
            if (arquivo instanceof ArquivoCsv) {
                ((ArquivoCsv)arquivo).gerarCsv();
            }
             else if (arquivo instanceof ArquivoPdf) {
                ((ArquivoPdf)arquivo).gerarPdf();
            }
        }
    }

}
