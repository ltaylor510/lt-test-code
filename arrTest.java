import java.util.*;


public class arrTest {
public static void main(String args[]){
ArrayList<String> al = new ArrayList<String>();
//HashMap<Integer,String> hm = new HashMap<Integer,String>();
Map<Integer,String> hm = new TreeMap<Integer,String>();

al.add("hello");
al.add("yes");
al.add("that's it");
al.add("two times naw.");

hm.put(1,"one");
hm.put(4,"four");
hm.put(7,"seven");
hm.put(10,"ten");

for (String i: al){
System.out.println(i);
}
System.out.println(al.get(3));

Set set  = hm.entrySet();
Iterator it = set.iterator();
while(it.hasNext()){
Map.Entry es = (Map.Entry)it.next();   
    int Key = (int)es.getKey();
    String Value = (String)es.getValue();

System.out.println(Key + ":"+ Value);

}
}
}



