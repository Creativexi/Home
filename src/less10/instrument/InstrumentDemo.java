package less10.instrument;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(),
                new Tube(),
                new Baraban(),};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
