package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student a = new Student("Dimitri");
        Student b = new Student("Dineashia");
        Student c = new Student("Reana");
        Student d = new Student("Mark");
        Student e = new Student("James");


        StudentTree t = new StudentTree();
        t.insert(a);
        t.insert(b);
        t.insert(c);
        t.insert(d);
        t.insert(e);

        t.inorder();
        System.out.println("");
        System.out.println("");
        System.out.println("After the PreOder:");
        t.preOrder();
        System.out.println("");
        System.out.println("");
        System.out.println("After the PostOrder:");
        t.postOrder();
        System.out.println("");
        System.out.println("");


        t.delete(e);
        System.out.println("After the Delete:");

        t.inorder();

        System.out.println("");
        System.out.println("");
        t.search("Reana");
        System.out.println("");
        System.out.println("");
        t.search("Jonathan");
    }
}
