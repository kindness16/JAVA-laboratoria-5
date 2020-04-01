/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javakons;

/**
 *
 * @author Jakshylyk
 */
class A {
void callme(){
          System.out.println("Внутри А метод callme");
}
}
class B extends A {
          void callme(){
          System.out.println("Внутри В метод callme");
          }
          }
class C extends A {
          void callme(){
                    System.out.println("Внутри С метод callma");
          }
          }
class Dispatch{
          public static void main(String[] args){
                  A a = new A();
                  B b = new B();
                  C c = new C();
                  A r;
                  r = a;
                  r.callme();
                  r= b;
                  r.callme();
                  r = c;
                  r.callme();
          }
    /**
     * @param args the command line arguments
     */
     {
        // TODO code application logic here
    }

}
