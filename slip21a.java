import java.util.Hashtable;
import java.util.Map;

//doubt in this code hashtabe use

public class slip21a {
    public static void main(String[] args) {
        Hashtable<String,String >cityCode=new Hashtable<>(Map.of("pune","023","delhi","024"));
        System.out.println("______*****______");

        cityCode.forEach((city,code)->System.out.println(city+"\t"+code));
        String search ="pune";
        String code =cityCode.get(search);
        
         System.out.println("STD code for:"+search+":"+(code!=null?code:"city not found"));
    }
    
}
