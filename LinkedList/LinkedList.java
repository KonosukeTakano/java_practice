/**
 * 
 */
package java_practice;

/**
 * @author kouko
 *
 */
public class LinkedList {
	
	Node head;
	
	static class Node {
		   
        int data;
        Node next;
   
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
	
	public static LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node(data);
		
		if (list.head == null) {
            list.head = new_node;
        }else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
   
            // Insert the new_node at last node
            last.next = new_node;
        }
		
		return list;
	}
	
	public static void printList(LinkedList list) {
		Node currentNode = list.head;
		
		System.out.print("LinkedList: ");
		
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			
			//次のノードに進む
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	public static LinkedList deleteByKey(LinkedList list, int key) {
		Node currentNode = list.head, prev = null;
		
		//先頭ノードが削除したいキーを持っている場合
		if(currentNode != null && currentNode.data == key) {
			list.head = currentNode.next;
			
			System.out.println(key + " found and deleted");
			
			return list;
		}
		
		//先頭ノード以降のノードが削除したいキーを持っている場合
		while(currentNode != null && currentNode.data != key) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		
		if(currentNode != null) {
			prev.next = currentNode.next;
			
			System.out.println(key + " found and deleted");
			
		}
		
		//削除したいキーが見つからなかった場合
		if(currentNode == null) {
			System.out.println(key + " not found");
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		System.out.println("Hello");
		LinkedList list = new LinkedList();
		
		list = insert(list,3);
		list = insert(list,2);
		list = insert(list,0);
		list = insert(list,4);
		
		printList(list);
		
		list.head.next.next.next.next = list.head.next;
		
		System.out.println(Solution.detectCycle(list.head).data);
	}

}