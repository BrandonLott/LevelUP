package DAO;


import Model.Item;
import UTIL.ConnectionUtil;

import java.sql.Connection;
import java.util.List;

public class ItemRepository {
    Connection conn;
    public ItemRepository(){
        conn = ConnectionUtil.getConnection();
    }
    public List<Item> getAllEnemies(){
        return null;
    }
    public List<Item> getAllEnemiesByLevel(int level){
        return null;
    }
    public void addEnemy(){
    }
    public Item getEnemyByName(String name){
        return null;
    }

}
