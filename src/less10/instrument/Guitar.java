package less10.instrument;

public class Guitar implements Instrument {
    int stringsNum;

    @Override
    public void play() {
        System.out.println("Guitar plays " + KEY);
    }
}
