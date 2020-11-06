public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i=0; i<s.size();i++){
      if (i!=s.indexOf(s.get(i))){
        s.remove(i);
        i--;
      }
    }
    }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray returnSA= new SuperArray(a.size()+b.size());
    for (int i=0; i<a.size();i++){
      if(b.contains(a.get(i))){
          returnSA.add(a.get(i));
      }
    }
    removeDuplicates(returnSA);
    return returnSA;
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    SuperArray numbers = new SuperArray();
    numbers.add("9");    numbers.add("2");     numbers.add("2");     numbers.add("3");
    numbers.add("4");    numbers.add("1");
    SuperArray numbers2= new SuperArray();
    numbers2.add("0");    numbers2.add("4");  numbers2.add("2");      numbers2.add("2");
    numbers2.add("9");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(findOverlap(numbers,numbers2));
  }
}
