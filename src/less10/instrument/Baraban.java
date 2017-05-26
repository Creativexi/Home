package less10.instrument;

public class Baraban implements Instrument {
    int size;

    @Override
    public void play() {
        System.out.println("Baraban plays " + KEY);
    }
}
