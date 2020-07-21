package frequencyOfWords;

public class StringFrequency {
	private String word;
	private int occurence;
	
	protected StringFrequency(String word, int occurence) {
		setWord(word);
		setOccurence(occurence);
	}
	
	protected String getWord() {
		return this.word;
	}
	
	protected int getOccurence() {
		return this.occurence;
	}
	
	protected void setWord(String word) {
		this.word = word;
	}
	
	protected void setOccurence(int occurence) {
		this.occurence = occurence;
	}	
}
