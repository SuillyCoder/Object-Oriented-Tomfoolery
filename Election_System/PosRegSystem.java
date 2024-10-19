import java.util.*;
class PosRegSystem {
	public void registerPosition(ArrayList<CandidateData> candidateList, CandidateData candidate) {
		Scanner input = new Scanner(System.in);
		candidate = new CandidateData();
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		candidate.name = name;
		System.out.println("\nAVAILABLE POSITIONS\n\n[1]Barangay Captain\n[2]Barangay Vice Captain\n[3]Secretary\n[4]Treasurer\n[5]Barangay Tanod\n");
		System.out.print("Please input choice: ");
		int positionChoice = input.nextInt();
		switch(positionChoice) {
			case 1: 
				candidate.position = "Barangay Captain";
				break;
			case 2: 
				candidate.position = "Barangay Vice Captain";
				break;
			case 3: 
				candidate.position = "Secretary";
				break;
			case 4: 
				candidate.position = "Treasurer";
				break;
			case 5: 
				candidate.position = "Barangay Tanod";
				break;
		}
		System.out.println("Successfully registered: "+ candidate.name + "\nas " + candidate.position + "\n");
		candidateList.add(candidate);
	}
}
