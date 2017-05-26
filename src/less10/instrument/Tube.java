package less10.instrument;

public class Tube implements Instrument{
    int diametr;

    @Override
    public void play() {
        System.out.println("Tube plays " + KEY);
    }
}
