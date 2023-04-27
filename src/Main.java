import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


class T{
    int t=20;
    T(){
        t=40;
    }
}
interface TestInterface{
    void m1();
}
class InterfaceImpl implements TestInterface{

    @Override
    public void m1() {

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stream<String> streamEmpty = Stream.empty();
        Collection<String> collection
                = Arrays.asList("a","b","c");
        Stream<String> streamOfCollection=collection.stream();
        Stream<String> streamOfArray = Stream.of("a","b","C");
        String[] arr= new String[]{"a","b","c"};
        Stream<String> streamOfArrayFull= Arrays.stream(arr);
        Stream<String> streamOfArrayPart=Arrays.stream(arr,1,3);
        Stream<String> streamBuilder= Stream.<String>builder()
                .add("a").add("c").build();
        Stream<String> streamGenrated = Stream.generate(
                ()-> "eleement").limit(10);
        Stream<Integer> streamIterated = Stream.iterate(40,n->n+2).limit(20);
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);
        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");

        List<String> elements =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"))
                        .collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();
        ArrayList al =new ArrayList<String>();
        al.add(10);
        al.add(true);
        al.add("Hello");
        System.out.println(al);
        System.out.println("1"+2+3);
        List<Integer> list=List.of(1,5,6,8,11,30);
        int res=list.stream().filter(e->e%2==0).reduce(0,(e1,e2)->(e1+e2));
        System.out.println(res);
        list.stream().filter(e->e>=50 && e<=65).collect(Collectors.toList());

        Map<String,Integer> hm=new HashMap<>();
        hm.put(new String("abc"),1);
        hm.put(new String("abc"),2);
        System.out.println(hm);
        System.out.println(hm.size());


        String str1="sankh#adeep*";
        int countVowel=0;
        int countCOnsonant=0;
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        for(Character ch:str1.toCharArray()){
            if(set.contains(ch)){
                countVowel++;
            } //else if (ch>97 && ch <122)
            else if (ch>='a' && ch <='z'){
                countCOnsonant++;
            }

        }

        System.out.println(countVowel+" v-C"+countCOnsonant);

        Runnable r=()->{
            System.out.println("so some work here");
        };

        Thread t1=new Thread(r);
        t1.start();

        T obj1=new T();
        System.out.println(obj1.t);
    }
}