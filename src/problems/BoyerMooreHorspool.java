package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Boyer-Moore-Horspool sub string search algorithm
 */
public class BoyerMooreHorspool {
	/* String to store the file contents */
	private String text = new String();

	/* String to store search pattern */
	private String pattern = new String();

	/* Length of the pattern */
	private int patternLength;

	/* Constructor */
	public BoyerMooreHorspool(String text, String pattern) {
		this.text = text;
		this.pattern = pattern;
		this.patternLength = pattern.length();
	}

	/* get Text */
	public String getText() {
		return text;
	}

	/* set search pattern */
	public void setText(String text) {
		this.text = text;
	}

	/* set pattern */
	public void setPattern(String pattern) {
		this.pattern = pattern;
		this.patternLength = pattern.length();
	}

	/* get pattern */
	public String getPattern() {
		return pattern;
	}

	/**
	 *	Map to store jump ahead values
	 */
	private Map<Character, Integer> moveAheadMap = new HashMap<>();

	/**
	 *	Calculates moveAheadMap
	 */
	public void computeMoveAheadMap(Map<Character, Integer> maMap) {
		char[] pat = pattern.toCharArray();
		for (int i = 0; i < patternLength; i++) {
			maMap.put(pat[i], patternLength - i - 1);
		}
	}

	/**
	 *	BMH algorithm
	 */
	public void BMHStringSearch(String text, String pat) {
		setText(text);
		setPattern(pat);
		
	}
}
