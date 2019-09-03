import java.util.List;
import java.util.Map;

public class Person {
    private String id;
    private String name;
    private List<String> friend;
    private Map<String,String> girls;
    public Person(){}
    public Person(String id,String name){
        super();
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFriend() {
        return friend;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }

    public Map<String, String> getGirls() {
        return girls;
    }

    public void setGirls(Map<String, String> girls) {
        this.girls = girls;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
