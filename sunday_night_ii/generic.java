

class Generic_main {


  public static void main(String[] args) {
    System.out.println("Hello there world");

    Generic <Integer> iObj = new Generic<Integer>(15);
    System.out.println(iObj.getObject());

    // instance of String type
    Generic <String> sObj = new Generic<String>("GeeksForGeeks");
    System.out.println(sObj.getObject());

    Specific_i test_i = new Specific_i(5);
    System.out.println(test_i.getObject());

    Specific_s test_s = new Specific_s("Hi Mom");
    System.out.println(test_s.getObject());


  }

}


class Generic<T> {
  // An object of type T is declared
  T obj;

  Generic(T obj){
    this.obj = obj;
  }

  public T getObject() {
    return this.obj;
  }

}

class Specific_i {
  int obj;

  Specific_i(int obj){
    this.obj = obj;
  }

  public int getObject() {
    return this.obj;
  }

}

class Specific_s {
  String obj;

  Specific_s(String obj){
    this.obj = obj;
  }

  public String getObject() {
    return this.obj;
  }

}
