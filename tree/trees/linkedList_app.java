package trees;
//create a class node with int value ndnnode next ceate a class linked list with head null then use 2 functionscreate and display nd invoke these methods in linked list app class to create a single linked list 
class Nodee{
	public Nodee(int value) {
		
		this.value = value;
		next = null;
	}
	int value;
	Nodee next=null;
}
class singlelinkedlis			{
	Nodee head=null;
	public void create(int data ) {
		Nodee node=new Nodee(data);
		if(head==null) {
			head=node;
		}
		else {
			Nodee temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public void display() {
		Nodee temp=head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
		
		
	}
}
public class linkedList_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlelinkedlist on= new singlelinkedlist();
		on.create(5);
		on.create(3);
		on.create(8);
		on.create(9);
		on.display();

	}

}
