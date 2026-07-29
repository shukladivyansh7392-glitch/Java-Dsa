import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {

        HashSet<Student3> set = new HashSet<>();

        Student3 s2 = new Student3("Divyansh", 1);
        Student3 s1 = new Student3("Divyansh", 1);
        Student3 s3 = new Student3("Divyansh", 1);

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);




//        Set<Integer> Set1 = new HashSet<>();
//        Set<Integer> Set2 = new HashSet<>();
//
//        Set1.add(1);
//        Set1.add(2);
//        Set1.add(3);
//        Set1.add(4);
//
//        Set2.add(3);
//        Set2.add(4);
//        Set2.add(5);
//        Set2.add(6);
//
//        System.out.println(Set1);
//        Set1.retainAll(Set2);
//        System.out.println(Set1);
//        System.out.println(Set2);
//        System.out.println(Set2.containsAll(Set1));


        //HashSet -> 0(1) -> Yaha Element Rendomly Tarah nse store honge
        //LinkedHashSet -> 0(n) -> Yaha jis input mai doge usi mai milenge
        //TreeSet -> BST Based -> 0(logn) sorted

//        Set<Integer> st = new TreeSet<>();
//        st.add(50);
//        st.add(20);
//        st.add(40);
//        st.add(40);
//        st.add(30);
//        System.out.println(st);

    }
}
