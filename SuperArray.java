public class SuperArray{
  //1a
  private String [] data;
  private int size; //The current size
  //1b
  public SuperArray(){
    data= new String[10];
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
  //Private Methods 1g
  private void resize(){
    String[] biggerArray=new String[data.length*2];
        for (int i=0; i<data.length;i++){
            biggerArray[i]=data[i];
        }
        data= biggerArray;
  }
}
