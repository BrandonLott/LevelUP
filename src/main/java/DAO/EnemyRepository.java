package DAO;

import Model.Enemy;
import UTIL.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EnemyRepository {
    Connection conn;
    public EnemyRepository(){

            conn = ConnectionUtil.getConnection();

    }
    public List<Enemy> getAllEnemies(){
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * From Enemy");
            while(rs.next()){
                Enemy loadedEnemy = new Enemy(rs.getInt("id"),rs.getString("name"), rs.getInt("level"), rs.getInt("expPointValue"), rs.getInt("dealDamage"), rs.getInt("dropRate"));
                getAllEnemies().add(loadedEnemy);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public List<Enemy> getAllEnemiesByLevel(int level){
        return null;
    }
    public void addEnemy(){
    }
    public Enemy getEnemyByName(String name){
        return null;
    }

}
