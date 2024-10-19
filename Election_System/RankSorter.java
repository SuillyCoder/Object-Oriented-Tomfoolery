import java.util.*;

class RankSorter {

    // Implement a function for setting random counts for the candidates
    public void countSetter(ArrayList<CandidateData> candidateList) {
        Random randCount = new Random();
        for (CandidateData candidate : candidateList) {
            candidate.setCount(randCount.nextInt(500) + 100);  // Random number up to 500
        }
    }

    // Sorting algorithm to sort the candidateList in descending order of counts
    public void candidateSorter(ArrayList<CandidateData> candidateList) {
        // Sort in descending order by count
        countSetter(candidateList);
        Collections.sort(candidateList, Collections.reverseOrder());
        displayRankedList(candidateList);  // Display the sorted list
    }

    // Function to display the sorted list of candidates
    public void displayRankedList(ArrayList<CandidateData> rankedList) {
        if (rankedList.isEmpty()) {
            System.out.println("No candidates available.");
            return;
        }

        for (int i = 0; i < rankedList.size(); i++) {
            System.out.println("Rank No: " + (i + 1));
            System.out.println("Name: " + rankedList.get(i).name);
            System.out.println("Position: " + rankedList.get(i).position);
            System.out.println("Voter Count: " + rankedList.get(i).getCount());
            System.out.println();  // Newline for better readability
        }
    }
}