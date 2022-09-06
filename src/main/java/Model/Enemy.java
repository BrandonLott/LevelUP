package Model;

public class Enemy {
    public int id;
    public String name;
    public int enemyLevel;
    public int expPointValue;
    public int dealDamage;
    public int dropRate;

    public Enemy(int id, String name, int level, int expPointValue, int dealDamage, int dropRate) {
    }


    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", enemyLevel=" + enemyLevel +
                ", expPointValue=" + expPointValue +
                ", dealDamage=" + dealDamage +
                ", dropRate=" + dropRate +
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

    public int getEnemyLevel() {
        return enemyLevel;
    }

    public void setEnemyLevel(int enemyLevel) {
        this.enemyLevel = enemyLevel;
    }

    public int getExpPointValue() {
        return expPointValue;
    }

    public void setExpPointValue(int expPointValue) {
        this.expPointValue = expPointValue;
    }

    public int getDealDamage() {
        return dealDamage;
    }

    public void setDealDamage(int dealDamage) {
        this.dealDamage = dealDamage;
    }

    public int getDropRate() {
        return dropRate;
    }

    public void setDropRate(int dropRate) {
        this.dropRate = dropRate;
    }

    public Enemy(String name, int id, int enemyLevel, int expPointValue, int dealDamage, int dropRate) {
        this.name = name;
        this.id = id;
        this.enemyLevel = enemyLevel;
        this.expPointValue = expPointValue;
        this.dealDamage = dealDamage;
        this.dropRate = dropRate;


    }
}
