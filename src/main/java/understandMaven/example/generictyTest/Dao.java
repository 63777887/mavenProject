package understandMaven.example.generictyTest;

import java.util.*;

public class Dao<T> {
    Map map = new HashMap<String, T>();

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void save(String id, T entity) {
        map.put(id,entity);
    }

    public void get(String id){
        System.out.println( map.get(id));
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        List list=new ArrayList();
        for (Object o :
                map.values()) {
         list.add((T)o);
        }
        return list;
    }

    public void delete(String id){
        map.remove(id);
    }
}
