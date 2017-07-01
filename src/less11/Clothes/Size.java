package less11.Clothes;

public enum Size {
    XXS(37) {
        public void getDescription() {
            System.out.println("Детский размер");
        }
    }, XS(40), S(43), M(45), L(48);

    public void getDescription() {
        System.out.println("Взрослый размер");
    }

    private int eurosize;

    Size(int eurosize) {
        this.eurosize = eurosize;
    }
}
