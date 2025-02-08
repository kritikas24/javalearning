import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cyclic {
	public static void main (String[] s) {
		List<Integer> nodes = new ArrayList<>();
		nodes.add(1);
		nodes.add(5);
		//nodes.add(8);
		Collections.sort(nodes);
		Integer arrayLength = 5;
		
		Integer minLength = Collections.max(nodes);

		for (int j=0; j<nodes.size(); j++) {
			int count = 0;
		for(int i = j ; i< j+nodes.size()-1; i++) {
			if (nodes.get((i+1)%nodes.size()) > nodes.get(i%nodes.size())) {
				count +=  Math.max(nodes.get(i%nodes.size()), nodes.get((i+1)%nodes.size())) -
						 Math.min(nodes.get(i%nodes.size()), nodes.get((i+1)%nodes.size()));

			} else if (((i+1)%nodes.size()) < i && arrayLength == nodes.get(nodes.size()-1)) {
				count += nodes.get((i+1)%nodes.size());
			} else if (((i+1)%nodes.size()) < i && arrayLength > nodes.get(nodes.size()-1)) {
				count += (arrayLength - Collections.max(nodes)) + nodes.get((i+1)%nodes.size());
			}
		}
		if (minLength > count) {
			minLength = count;
		}
		}
		
		System.out.println(minLength);
		
	}
}
