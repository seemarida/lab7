import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class ListExamples {

  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
  static List<String> filter(List<String> list, StringChecker sc) {
    List<String> myResult = new ArrayList<>();
    for(String s: list) {
      if(sc.checkString(s)) {
        myResult.add(0, s);
      }
    }
    return myResult;
  }


  // Takes two sorted list of strings (so "a" appears before "b" and so on),
  // and return a new list that has all the strings in both list in sorted order.
  static List<String> merge(List<String> list1, List<String> list2) {
    List<String> myResult = new ArrayList<>();
    int index1 = 0, index2 = 0;
    while(index1 < list1.size() && index2 < list2.size()) {
      if(list1.get(index1).compareTo(list2.get(index2)) < 0) {
        myResult.add(list1.get(index1));
        index1 += 1;
      }
      else {
        myResult.add(list2.get(index2));
        index2 += 1;
      }
    }
    while(index1 < list1.size()) {
      myResult.add(list1.get(index1));
      index1 += 1;
    }
    while(index2 < list2.size()) {
      myResult.add(list2.get(index2));
      // change index1 below to index2 to fix test
      index2 += 1;
    }
    return myResult;
  }


}
