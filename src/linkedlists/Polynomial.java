package linkedlists;

public class Polynomial {
	 Node head,last;
	 int degree=0;
	 public void insert(int c, int p){
		 degree = Math.max(p, degree);
		 if(head == null){
			 head = new Node(c,p);
			 head.coefficient = c;
			 head.power = p;
			 last = head;
		 } else{
			 Node newnode = new Node(c,p);
			 if(head.power < p){
				 newnode.next = head;
				 head = newnode;
				 return;
			 }
			 Node temp = head;
			 while (temp.next != null) {
				 if(temp.next.power < p){
					 newnode.next = temp.next;
					 temp.next = newnode; 
					 return;
				 }
				 temp = temp.next;
			}
			 
			 last.next = newnode;
			 last = newnode;
		 }
		 
	 }
	 public void display(){ 
		 Node temp = head;
		 while(temp != null){
			 
			 System.out.print(temp.coefficient + "x^" + temp.power);
			 if(temp.next != null && temp.next.coefficient >= 0){ System.out.print("+");}
			 temp = temp.next;
		 }
		  
	 }
	 public Polynomial addition( Polynomial p1, Polynomial p2){
		  Polynomial p = new Polynomial();
		  Node temp1,temp2,last1,last2;
		  
		  /*
		   * The following if and else condition is to ensure that temp1 always represents the 
		   * polynomial of the highest degree
		   */
		  if(p1.degree < p2.degree){
			  temp1 = p2.head;
			  temp2 = p1.head;
		  }else{
		  temp1 = p1.head;
		  temp2 = p2.head;
		  }
		  
		  while (temp1 != null && temp2 != null) {
			  
			  if(temp1.power == temp2.power){
				  p.insert(temp1.coefficient+temp2.coefficient,temp1.power);
				  temp1 = temp1.next;
				  temp2 = temp2.next;
			  }
			  else if (temp1.power > temp2.power) { 
				 p.insert(temp1.coefficient, temp1.power);
				temp1 = temp1.next;
			  }else if(temp1.power < temp2.power){
				  p.insert(temp2.coefficient, temp2.power);
				  temp2 = temp2.next;
			  }
		  }
		  
		  return p;
		 }

}
