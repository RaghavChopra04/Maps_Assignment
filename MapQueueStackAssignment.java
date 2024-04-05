package DSA;

import java.util.*;


public class MapQueueStackAssignment {
    public static void main(String[] args){
        /// sorted based on Key
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(12, "Streamed");
        tm.put(1, "Fire");
        tm.put(7, "Vlogging");
        tm.put(8, "Lamborghini");
        tm.put(11, "Lenovo");
        tm.put(14, "TreeMaps");
        System.out.println(tm);

        //// sorted based on Value
        TreeMap<String, Integer> tm1 = new TreeMap<>();
        tm1.put("Streamed", 12);
        tm1.put("Fire",1);
        tm1.put("Vlogging" , 4);
        tm1.put("Lamborghini" , 18);
        tm1.put( "Lenovo" , 6 );
        tm1.put( "TreeMaps" , 10);
        tm1.put( "Anderson" , 19);
        System.out.println(tm1);

        /// Check if duplicate elements exist...
        int[] arr = {3,2,4,2,5 ,5,1,9,6};
        HashMap<Integer, Integer> mp = new HashMap();
//        int count = 1;
        for(int i = 0 ; i < arr.length ; i++){
            int count = 1;
            if(mp.containsKey(arr[i])){
                count++;
            }
            mp.put(arr[i] , count);
        }
        if(mp.containsValue(2)){
            System.out.println("Yes Duplicate Element exists");
        }
        else {
            System.out.println("No Duplicacy!");
        }
        System.out.println(mp);

        //// Rwturn largest element
        TreeMap<Integer, Integer> t = new TreeMap<>();
        int[] arr11 = {21,5,78,1009,3,91,3,54,2,4};
        for(int i = 0; i < arr.length ; i++){
            t.put(arr11[i] , i);
        }
        System.out.println("The largest element in given array is: " + t.lastEntry().getKey());

        /// RansomeNote constructed by Magazine or not???
        HashMap<Character , Integer> rnsm = new HashMap<>();
        HashMap<Character , Integer> mgzn = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ransome Note: ");
        String rnsmnote = sc.next();
        System.out.println("Enter Magazine: ");
        String magzine = sc.next();

        for(int i = 0; i< rnsmnote.length() ;i++){
            char c = rnsmnote.charAt(i);
            if(rnsm.containsKey(c)){
                rnsm.put(c , rnsm.get(c) + 1);
            }
            else {
                rnsm.put(c , 1);
            }
        }
        for(int i = 0; i< magzine.length() ;i++){
            char c = magzine.charAt(i);
            if(mgzn.containsKey(c)){
                mgzn.put(c , mgzn.get(c) + 1);
            }
            else {
                mgzn.put(c , 1);
            }
        }
        boolean ans = true;
        for(Map.Entry<Character , Integer> e : rnsm.entrySet()){
            if(!mgzn.containsKey(e.getKey()) || e.getValue()>mgzn.get(e.getKey())){
                ans = false;
                break;
            }
        }
        System.out.println(ans);







    }
}
