package Strings;

public class Design {

  /**
   *
   *    abcdef  -> abcdef
   *
   *    fedabc  -> abcdef
   *
   *
   *    Sorting  -> count  - o(n)  sc - o(n)
   *
   *
   *
   *
   *
   */






     // state
    A a = new A();

    B b = new B();

 //behavior
    public  void badMethodPractice(){

         a.hashCode();
         b.toString();
    }


  public void badMethodPractice( A x , B  y){  // this is a un

    a.hashCode();
    b.toString();

    }

  public static void main(String[] args) {

    Design d = new Design();
    d.badMethodPractice() ;


    d.badMethodPractice(new A() , new B());


  }

}



class A {

}


class B{


}
