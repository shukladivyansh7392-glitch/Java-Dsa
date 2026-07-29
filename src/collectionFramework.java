import javax.naming.CompositeName;
import java.util.*;

public class collectionFramework {

    public static <list> void main(String[] args){
            //List or collection -- > Interface

        //Arraylist --> concrete class
//        List<Integer> list = new Stack<>();
//
//        //add
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//
//
//        list.remove(0);
//        System.out.println(list);
//
//        //addNull
//        List<Integer> list2 = new Stack<>();
//        list2.add(102);
//        list2.add(103);
//        list2.add(20);
//        list.addAll(list2);
//        System.out.println(list);
//
//        //remove
//        list.removeAll(list2);
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        //clear
//        System.out.println("printing list 2" + list2);
//        list2.clear();
//        System.out.println(list2.size());
//
//        //i want to traverse using to iterator
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println("Element : " +iterator.next());
//        }
//
//        List<Integer> list3 = new Stack<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(14);
//        System.out.println(list3.get(0));
//        System.out.println("Before list :" +list3);
//        list3.set(0,100);
//        System.out.println("After list :" +list3);
//        //Collection<Integer> collection = new ArrayList<>();
//
//        //toArray
//        Object[] arr = list3.toArray();
//        for(Object obj: arr){
//            System.out.println(obj);
//        }
//
//        //Contains
//        System.out.println(list3.contains(0));
//
//        list.add(12);
//        list.add(4);
//        System.out.println("Printing intire list : " +list);
//
//        //sort an arrayList
//        System.out.println("Sorting : ");
//        Collections.sort(list);
//        System.out.println("Printing intire list : " + list);
//        //HW :- How can we sort in decending order
//
//
//      //  ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();     //This Is no empty and this method not allowed linkedlist
//        //System.out.println(" Printing intire list : " + newList);
////        ArrayList<Integer> marks = new ArrayList<>();
////        marks.ensureCapacity(100);   // This Is Empty
////        System.out.println(marks.isEmpty());
//        list.add(30);
//        list.add(24);
//        list.add(30);
//        System.out.println("Printing Original list : " +list);
//        System.out.println(list.lastIndexOf(30));
//        //System.out.println(list.indexOf(12));
//
//
//        //addFirst and addLast
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        list.remove(3);
//        System.out.println("Printing Original list : " +list);
//
//        LinkedList<Integer> ll = new LinkedList<>();   // ye vector nahio hoga
//        ll.add(100);
//        System.out.println(ll);
//        ll.addFirst(1);
//        System.out.println(ll);
//        ll.addLast(101);
//        System.out.println(ll);
//
//        System.out.println(ll.offer(3));

//        System.out.println("Before " + ll);
//        System.out.println("Polling : "  + ll.poll());
//        System.out.println("After " + ll);

//        System.out.println(ll.peek());
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());

//        ll.removeFirst();
//        System.out.println(ll);
//        ll.removeLast();
//        System.out.println(ll);


        Stack<Integer> st=new Stack<>();
        st.push(20);
        System.out.println(st);

        st.push(21);
        System.out.println(st);

        st.push(22);
        System.out.println(st);

        st.pop();
        System.out.println(st);

//        st.peek();
//        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st.search(21));
        System.out.println(st.empty());

    }




}
