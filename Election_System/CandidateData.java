class CandidateData implements Comparable<CandidateData> {
	public String name; 
	public String position;
	private int voterCount; 
	
	public void setCount(int newCount){
		this.voterCount = newCount;
	}
	
	public int getCount() {
		return this.voterCount;
	}
	@Override
    public int compareTo(CandidateData otherCandidate) {
        return Integer.compare(this.voterCount, otherCandidate.voterCount);
    }
}
