package solid.isp;

public class Pinguim implements Aves {
    @Override
    public void setLocalizacao(Double latitude, Double longitude) {
        //Faz alguma coisa
    }

    @Override
    public void renderizar() {
        //Faz alguma coisa
    }

    // A Interface Aves está forçando a Classe Pinguim a implementar esse método.
    // Isso viola o príncipio ISP
    @Override
    public void setAltitude(Double altitude) {
        //Não faz nada...  Pinguins são aves que não voam!
    }
}
