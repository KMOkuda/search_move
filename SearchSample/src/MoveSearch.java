import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveSearch {
	private MoveSearch instance = new MoveSearch();
	List<List<Block>> permutation;
	List<Node> topNode;
	
	private MoveSearch() {
		permutation.add(new ArrayList<Block>(Arrays.asList(new Block(1, 1, 1), new Block(2, 2, 2), new Block(2, 4, 5))));
		permutation.add(new ArrayList<Block>(Arrays.asList(new Block(1, 1, 1), new Block(2, 2, 2), new Block(2, 4, 5))));
		permutation.add(new ArrayList<Block>(Arrays.asList(new Block(1, 1, 1), new Block(2, 2, 2), new Block(2, 4, 5))));
		permutation.add(new ArrayList<Block>(Arrays.asList(new Block(1, 1, 1), new Block(2, 2, 2), new Block(2, 4, 5))));
		permutation.add(new ArrayList<Block>(Arrays.asList(new Block(1, 1, 1), new Block(2, 2, 2), new Block(2, 4, 5))));
		permutation.add(new ArrayList<Block>(Arrays.asList(new Block(1, 1, 1), new Block(2, 2, 2), new Block(2, 4, 5))));
	}
	
	public void search() {
		for(List<Block> blocks: permutation) {
			Node node = new Node(blocks);
			node.search();
		}
	}
	
	
	
}
