import java.util.*;
public class QueueEx1 {
 int queueLength = 3;
 int items[] = new int[queueLength]; 
 int front = -1;
 int back = -1;
 boolean isFull() {
 return back == queueLength - 1;
 }
 boolean isEmpty() {
 return front == -1 && back == -1;
 }
 void enQueue(int itemValue) {
 if (isFull()) {
 System.out.println("Queue is full");
 } else if (isEmpty()) {
 front = back = 0;
 items[back] = itemValue;
 } else {
 back++;
 items[back] = itemValue;
 }
 }
 void deQueue() {
 if (isEmpty()) {
 System.out.println("Queue is empty. Nothing to deQueue");
 } else if (front == back) {
 front = back = -1;
 } else {
 front++;
 }
 }
 void display() {
 if (isEmpty()) {
 System.out.println("Queue is empty");
 } else {
 for (int i = front; i <= back; i++) {
 System.out.print("\t" + items[i]);
 }
 System.out.println();
 }
 }
 void peak() {
 if (!isEmpty()) {
 System.out.println("Front value is: " + items[front]);
 } else {
 System.out.println("Queue is empty. No front value.");
 }
 }
 public static void main(String[] args) {
 QueueEx1 myQueue = new QueueEx1(); 
 System.out.println("Enqueue: "); 
 myQueue.enQueue(3);
 myQueue.display(); 
 myQueue.enQueue(2);
 myQueue.display();
 myQueue.enQueue(1); 
 myQueue.display();
 myQueue.peak(); 
 System.out.println("DeQueue:"); 
 myQueue.deQueue(); 
 myQueue.display(); 
 myQueue.deQueue(); 
 myQueue.display(); 
 myQueue.peak();
 }
}