package hra.listenery;

public enum Teleporteri {
    DUCH("Duch"), GOLEM("Golem"), LUCISTNIK("Lucistnik"), OHNIVAK("Ohnivak"), VIDLAK("Vidlak");

    private String jmeno;

    Teleporteri(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }
}
