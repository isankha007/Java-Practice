package com.sankha.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionDemoRunner {
    public static void main(String[] args) {
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");
        cityCode.put(null, "Nothoing");


        for (Map.Entry<String,String> el:cityCode.entrySet()){
            System.out.println(el.getValue()+" "+el.getKey());
        }

        Iterator<String> iterator=cityCode.keySet().iterator();
       /* If you remove an element via Iterator remove() method, exception will not be thrown. However, in case of removing via a particular collection remove() method,
            ConcurrentModificationException will be thrown. Below code snippet will demonstrate this:*/
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            System.out.println(cityCode.get(iterator.next()));
           // cityCode.put("Istambul","Turkey");
        }

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList=new CopyOnWriteArrayList<>(new Integer[] { 1, 3, 5, 8 });
        Iterator<Integer> itr=copyOnWriteArrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            copyOnWriteArrayList.add(9);
        }
    }
}
