package dev.lpa;

import java.util.LinkedList;

public class Iterator {
    static void main() {
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        //testIterator(placesToVisit);
        testIterator2(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack methods
        list.push("Alice Springs");
    }


//    private static void testIterator(LinkedList<String> list) {
//        var iterator = list.iterator();
//        while(iterator.hasNext()) {
////            System.out.println(iterator.next());
//            if(iterator.next().equals("Brisbane")) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
//    }
    private static void testIterator2(LinkedList<String> list) {
        var iterator = list.listIterator();
        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")) {
                iterator.add("Lake Ivanhoe");
            }
        }
        System.out.println(list);
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
    }
}
