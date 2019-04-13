package org.dgp;

import java.util.Comparator;

/**
 * Implement a comparator for sorting Strings alphabetically
 * @author dpeters
 *
 */
class AlphabetizeStringsComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}
