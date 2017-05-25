package less9.animals;

public class Cat extends Animal {
    String name;

    public Cat(String food, String location) {
        super(food, location);
    }

    public String getEars() {
        return name;
    }

    public void setEars(String ears) {
        this.name = ears;
    }

    void makeNoise() {
        System.out.println("Cat noise");
    }

    void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public String toString() {
        return "//Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
