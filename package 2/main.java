package javaapplication4;

/**
 *
 * @author Jakshylyk
 */
class book {
          private String title;
          private String author;
          private int pubDate;
          
          book (String t, String a, int d){
                 title = t;   
                 author = a;
                 pubDate = d;
          }
          
          void show(){
                    System.out.println(title);
                    System.out.println(author);
                    System.out.println(pubDate);
                    System.out.println();
          }
}
class bookDemo{ 
          public static void main(String[] args[]){
                     Book books[] new book[5]
                     books[0] = new book ("Java: A Beginner's Guide", "Schildt", 2014);
          }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}