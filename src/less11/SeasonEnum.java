package less11;

public enum SeasonEnum {
    SPRING(10), SUMMER(25) {
        public void getDescription() {
            System.out.println("Теплое время года");
        }
    }, AUTUMN(11), WINTER(-10);

    private int t;

    SeasonEnum(int t) {
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }
}

