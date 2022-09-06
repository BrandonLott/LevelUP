package Model;

public class Item {
    public String name;
    public int id;
    public int extraDamage;

    public Item(String name, int id, int extraDamage) {
        this.name = name;
        this.id = id;
        this.extraDamage = extraDamage;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", extraDamage=" + extraDamage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExtraDamage() {
        return extraDamage;
    }

    public void setExtraDamage(int extraDamage) {
        this.extraDamage = extraDamage;
    }
}
