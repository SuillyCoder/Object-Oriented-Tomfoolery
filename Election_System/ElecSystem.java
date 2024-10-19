import java.util.*;
public class ElecSystem {
	public static void main(String[] args) {
		CandidateData candidate = new CandidateData();
		VoteSystem vote = new VoteSystem();
		PosRegSystem register = new PosRegSystem();
		RankSorter ranked = new RankSorter();
		ArrayList <CandidateData> candidateList = new ArrayList<CandidateData>();
		Scanner input = new Scanner(System.in);
		int userType = 1;
		while (userType != 0) {
			System.out.println("LGU ELECTION SYSTEM: ONLINE\n\nPlease select user type: \n");
			System.out.println("[1] Voter\n[2] Candidate\n[0] Exit\n");
			System.out.print("Please input choice: ");
			userType = input.nextInt();
			input.nextLine();
			switch(userType) {
				case 1: 
					System.out.println("\nWhat woud you like to do?: \n[1] Vote Candidates\n[2] View Candidate Rankings\n[0] Exit");
					System.out.print("\nEnter choice: ");
					int vChoice = input.nextInt();
					switch(vChoice) {
						case 1:
							vote.displayCandidates(candidateList, candidate);
							break;
						case 2: 
							System.out.println("\nELECTION RANKING RESULTS: \n");
							ranked.candidateSorter(candidateList);
							break;
					}
					break;
					
				case 2: 
					System.out.println("\nWhat woud you like to do?: \n[1] Register for Position\n[2] View Candidate Rankings\n[0] Exit");
					System.out.print("\nEnter choice: ");
					int cChoice = input.nextInt();
					switch(cChoice) {
						case 1:
							register.registerPosition(candidateList, candidate);
							break;
						case 2: 
							System.out.println("ELECTION RANKING RESULTS: \n");
							ranked.candidateSorter(candidateList);
							break;
					}
					break;
			}
		}
	}

}
