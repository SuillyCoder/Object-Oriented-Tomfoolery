import java.util.*;
class VoteSystem {
	
	public void displayCandidates(ArrayList<CandidateData> candidateList, CandidateData candidate) {
		if (candidateList.isEmpty())
			System.out.println("No Candidates have been registered\n");
		else {
			String[] positions = {"Barangay Captain", "Barangay Vice Captain","Secretary", "Treasurer","Barangay Tanod"};
			System.out.print("\nAVAILABLE CANDIDATES:\n\n");	
			for (int i = 0; i < 5; i++) {
				System.out.println(positions[i]);
				for (int j = 0; j < candidateList.size(); j++) {
					if (candidateList.get(j).position == positions[i]) 
						System.out.println("   -" + candidateList.get(j).name);
				}
			}
			voteProcess(candidateList, positions, candidate);
			System.out.println("\nThank you for exercising your right to vote! Mabuhay Pilipinas!\n\n");
		}
	}
	
	public void voteProcess(ArrayList<CandidateData> candidateList, String[] positions, CandidateData candidate) {
		Scanner input = new Scanner(System.in);
		for (int x = 0; x < 5; x++) {
			System.out.println("\nPOSITION VOTING FOR: " + positions[x]);	
			System.out.print("Please enter name of desired candidate (press X to skip): ");
			String candidateName = input.nextLine();
			if (candidateName != "x" && candidateName != "X") {
				for (int y = 0; y < candidateList.size(); y++){
					if (candidateList.get(y).name == candidateName) {
						candidate.setCount(candidate.getCount() + 1);
					}
				}
			}
		}
	}
}
