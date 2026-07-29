import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Map {
    static void main(String[] args) {

        Integer arr[] = {5,1,7,2,8};
        Arrays.sort(arr, new ReverseCmp());
        for(int a: arr){
            System.out.print(a + " ");
        }

//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student(19, "Divya", 49));
//        students.add(new Student(19, "Piyush", 39));
//        students.add(new Student(77, "Kavya", 51));
//        students.add(new Student(22, "Manya", 55));
//
//        System.out.println(students);

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        })

      //  Collections.sort(students, new WeightComparator());

       // Collections.sort(students,(o1,o2) -> return o1.weight-o2.weight);

        //comparing
        //thencomparing
        //System.out.println(students);

















//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(90);
//
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);


    }
}
