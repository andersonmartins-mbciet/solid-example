package solid.lsp;

import lombok.Data;

@Data
public class Retangulo {

    private double altura;
    private double largura;

    public double area() {
        return altura * largura;
    }
}
