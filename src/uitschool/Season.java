package uitschool;

public class Season {
    public enum Seasons {WINTER(-1), SPRING(3), SUMMER(10), AUTUMN(4);


        public int getT() {
            return t;
        }

        Seasons(int t){
            this.t = t;

        }
        private int t;
    }
    void getDescription(Seasons seasons){
        System.out.println(seasons.getT());
    }

}
