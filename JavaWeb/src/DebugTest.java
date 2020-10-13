import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","tjpu");
        map.put("major","cs");

        String age=map.get("age");
        System.out.println("age="+age);

        map.remove("major");
        System.out.println(map);
    }
}
