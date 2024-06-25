public abstract class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract String getType();
    public String getName() {
        return name;
    }
}
