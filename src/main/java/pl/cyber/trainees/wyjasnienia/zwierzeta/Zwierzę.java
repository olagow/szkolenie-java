package pl.cyber.trainees.wyjasnienia.zwierzeta;

public class Zwierzę {

    private final Double wzrost;
    private final boolean czyMaSiers;

    public Zwierzę(Double wzrost, boolean czyMaSiers) {
        this.wzrost = wzrost;
        this.czyMaSiers = czyMaSiers;
    }

    public Double getWzrost() {
        return wzrost;
    }

    public boolean isCzyMaSiers() {
        return czyMaSiers;
    }

    public String dajGlos() {
        return"";

    }

    public String dajGlos2() {
        return"";

    }
}
