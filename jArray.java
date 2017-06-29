import java.util.*;

public class jArray {
public static void main(String args[]){

ArrayList<String> alist = new ArrayList<String>();
alist.add("yes");
alist.add("no");

String[] nums = {"one","two","three"};
int[] j = {2,300,777,231};
for(String s:nums){ 
System.out.println(s);
}

for(int ns:j){
System.out.println(ns);
}
System.out.println(j[1]+" "+j[2]);
System.out.println(nums[2]);
System.out.println(alist);

}
}


