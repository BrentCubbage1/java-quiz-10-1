package rocks.zipcode.quiz4.collections.culonary;

public abstract class SpiceClass implements Spice{
    private String name;

    public SpiceClass() {
    }

    public SpiceClass(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
