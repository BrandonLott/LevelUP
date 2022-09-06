package Services;

import DAO.ItemRepository;
import Model.Item;

import java.util.List;

public class ItemService {
    ItemRepository ir;
    public ItemService(){
        ir = new ItemRepository();
    }
    public List<Item> getAllItems(){
        return null;
    }
    public void addItem(){

    }
}
