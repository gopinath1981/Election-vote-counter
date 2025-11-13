package electioncounter;

//Main.java
public class Main {
 public static void main(String[] args) {
     System.out.println("=== Election Vote Counter ===");
     ElectionCounter counter = new ElectionCounter();
     counter.conductElection();
 }
}

