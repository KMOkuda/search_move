import java.util.ArrayList;
import java.util.List;

public class Node implements Cloneable {

	List<Block> order;

	boolean holdFlg;
	List<Direction> dirList;
	int depth;
	double tmpCost;
	List<Scene> tmpSceneList;

	Node currentNode;
	List<Node> childNode;

	VirtualCar car;

	public Node(List<Block> order) {
		this.order = order;
	}

	void search() {
		if (depth == order.size()) {
			updateResult();
		} else {
			if (!judgeRunCrash()) {
				
				if(order.get(depth).getColor() == 2 || holdFlg) {
					for(Direction dir: dirList) {
						if(holdFlg && dir == Direction.UP) {
							continue;
						}
						
						if(!judgeTurnCrash()) {
							double nextCost = tmpCost + calcMoveCost();
							List<Scene> nextSceneList = new ArrayList<>(tmpSceneList);
							nextSceneList.add(new Scene());
						}
					}
				}
				
				
				double nextCost = tmpCost + calcMoveCost();
				List<Scene> nextSceneList = new ArrayList<>(tmpSceneList);
				nextSceneList.add(new Scene());
				

			}
		}
	}

	private boolean judgeTurnCrash() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	private double calcMoveCost() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	private void updateResult() {
		// TODO 自動生成されたメソッド・スタブ

	}

	private boolean judgeRunCrash() {
		return false;
	}

	public int getDepth() {
		return depth;
	}

	
}
