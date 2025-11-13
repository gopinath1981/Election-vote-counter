package electioncounter;

//ElectionCounter.java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElectionCounter {
 private HashMap<String, Integer> voteMap = new HashMap<>();

 // Add vote to a candidate
 public void addVote(String candidateName) {
     voteMap.put(candidateName, voteMap.getOrDefault(candidateName, 0) + 1);
 }

 // Display all votes
 public void displayResults() {
     System.out.println("\n--- Election Results ---");
     for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
         System.out.println(entry.getKey() + " received " + entry.getValue() + " votes.");
     }
 }

 // Find the winner
 public void displayWinner() {
     String winner = "";
     int maxVotes = 0;

     for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
         if (entry.getValue() > maxVotes) {
             maxVotes = entry.getValue();
             winner = entry.getKey();
         }
     }

     System.out.println("\n🏆 Winner: " + winner + " with " + maxVotes + " votes!");
 }

 // Run the election process
 public void conductElection() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number of votes to be cast: ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 0; i < n; i++) {
         System.out.print("Enter candidate name for vote " + (i + 1) + ": ");
         String candidate = sc.nextLine();
         addVote(candidate);
     }

     displayResults();
     displayWinner();
     sc.close();
 }
}