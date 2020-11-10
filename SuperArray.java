public class SuperArray{
  //1a
  private String [] data;
  private int size; //The current size
  //1b
  public SuperArray(){
    data= new String[10];
    size=0;
  }
  public SuperArray(int initialCapacity){
    data= new String[initialCapacity];
    size=0;
  }
  //Methods 1c
  public int size(){
    return size;
  }
  //1d
  public boolean add(String element){
    if (size>= data.length){
      resize();
    }
    data[size] = element;
    size ++;
    return true;
  }
  //1e
  public String get(int index){
    if (index<size&&index>=0){
      return data[index];
    }
    else return null;
  }
  //1f
  public String set(int index, String element){
    if (index<size&&index>=0){
      String replacedvalue=data[index];
      data[index]=element;
      return replacedvalue;
  }
    else return null;
  }
  //class 11/4/20
  public boolean isEmpty(){
    return (size==0);
  }

  public void clear(){
    data=new String[10];
    size=0;
  }

  public String toString(){
    String result="[";
    if (size==0){
      return "[]";
    }
    else{
    for (int i=0; i<size-1;i++){
      result += data[i] + ", ";
    }
    result +=data[size-1]+ "]";
  }
    return result;
  }

  public boolean contains(String s){
    for(int i=0; i<size; i++){
      if (data[i].equals(s))
        return true;
    }
    return false;
  }
  public int indexOf(String s){
    for (int i=0; i<size; i++){
      if (data[i].equals(s))
        return i;
    }
    return -1;
  }

  public void add(int index, String element){
    for (int i=size; i>index; i--){
      data[i]=data[i-1];
    }
    data[index]=element;
    size++;
  }

  public String remove(int index){
    if (index>=size||index<0){
      return null;
    }
    else {
      String removed=data[index];
      if (size>0){
        for (int i=index; i<size()-1;i++){
          data[i]=data[i+1];
        }
      size--;
    }
    return removed;
    }
  }

   public String[] toArray(){
     String[] safe=new String[size];
     for(int i=0; i<size; i++){
       safe[i]=data[i];
     }
     return safe;
  }
  //HW16
  public int lastIndexOf(String value){
    int lIndex = -1;
    for(int i = size()-1; i >= 0; i --){
      if(data[i].equals(value)){
        lIndex = i;
        return lIndex;
      }
    }
    return lIndex;
  }

  //Private Methods 1g
  private void resize(){
    String[] biggerArray=new String[data.length*2];
        for (int i=0; i<data.length;i++){
            biggerArray[i]=data[i];
        }
        data= biggerArray;
  }
}
