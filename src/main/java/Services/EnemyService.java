package Services;

import DAO.EnemyRepository;
import Model.Enemy;
import java.util.List;

public class EnemyService {
    EnemyRepository er;
    public EnemyService() {
        er = new EnemyRepository();
    }
    public List<Enemy> getAllEnemies(){
        return er.getAllEnemies();
    }
    public List<Enemy> getAllEnemiesByLevel(int level){
        return er.getAllEnemiesByLevel(level);
    }
    public void addEnemy(String name, int id){
        Enemy existingEnemy = er.getEnemyByName(name);
        if (existingEnemy == null){
            er.addEnemy();
        }


    }

}
