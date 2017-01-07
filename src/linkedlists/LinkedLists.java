package linkedlists;

public class LinkedLists {

    public static void main(String[] args) {
    	Polynomial p1=new Polynomial();
    	Polynomial p2=new Polynomial();
    	Polynomial result=new Polynomial();
    	 //**********3x^2 + 4x +10 ******* // insert Polynomial expression p1
    	 p1.insert(3, 2);
    	 p1.insert(4, 1);
    	 p1.insert(10, 0);
    	 //************2x^2 - 2x +4 ******* // insert Polynomial expression p2
    	 p2.insert(2, 2);
    	 p2.insert(-6, 1);
    	 p2.insert(4, 0);
    	 //******* now add Polynomials p1 and p2********
    	 result = result.addition(p1, p2);
    	// ***********display the result of addition***********
    	 result.display();


    }
}
