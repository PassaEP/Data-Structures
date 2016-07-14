/*ange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package listtest;


/* by Passa Pungchai 
*/
public class GeneralList {
    class Node { 
	Node    next = null, previous = null; 
	int     data; 
	public Node (int item){
	    data = item; next = previous = null; 

	}
    }
    // GL data members 
    Node head = null, tail = null; //2 pointers for the 1st and last nodes 
    int count = 0;    // total number of nodes 
    // GL Function members
    public GeneralList() {}
    public int size() {return count;}
    public boolean empty() {return count == 0;} 

    void addToFront(Node newBranch) { 
	newBranch.next = head; head.previous = newBranch; 
	head = newBranch; count++; 
    }

    void addToEnd(Node newBranch) {
	tail.next = newBranch; newBranch.previous = tail; 
	tail = newBranch; 
    }

    public GeneralList insert(int item, int index) { 
	Node newNode = new Node(item);    
	if (count == 0) {
	    head = tail = newNode; 
	    count++; 
	    return this;
	}
	if (index <= 0){
	    addToFront(newNode); 
	    count++;
	    return this; 
	}

	if (index >= count){
	    addToEnd(newNode); 
	    return this; 
	}
	Node current = head; 

	for (int i = 1; i < count; i++){
	    current = current.next; 
	}

	newNode.next = current.next; 
	newNode.previous = current; 
	newNode.next.previous = current.next = newNode; 
    	return this;
    }

    public void show(){
	System.out.printf("\n ========================== LIST CONTENTS ===============================\n"); 
	Node current = head; 
	int k = 0; 
	while (current != null){
	    System.out.printf("%3d: %4d |", k, current.data); 
	    k++; current = current.next;  
	}
    	
    	System.out.printf("\n"); 
    }

}




