package com.example.demo;

public class Panda {
    private KungFu kungFu;

    public Panda(KungFu kungFu) {
        this.kungFu = kungFu;
    }
    public Panda(String string) {
    }
    public KungFu getKungFu() {
        return kungFu;
    }
    public void setKungFu(KungFu kungFu) {
        this.kungFu = kungFu;
    }

    @Override
    public String toString() {
        return "Panda{" + "kungFu:" + kungFu + "}";
    }
}
