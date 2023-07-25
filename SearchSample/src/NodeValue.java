import java.util.List;

public class NodeValue {
	Block searchBlock;
	List<Block> order;
	
	boolean holdFlg;
	Direction direction;
	
	int depth;
	double tmpCost;
	List<Scene> tmpSceneList;
	public Block getSearchBlock() {
		return searchBlock;
	}
	public void setSearchBlock(Block searchBlock) {
		this.searchBlock = searchBlock;
	}
	public List<Block> getOrder() {
		return order;
	}
	public void setOrder(List<Block> order) {
		this.order = order;
	}
	public boolean isHoldFlg() {
		return holdFlg;
	}
	public void setHoldFlg(boolean holdFlg) {
		this.holdFlg = holdFlg;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public double getTmpCost() {
		return tmpCost;
	}
	public void setTmpCost(double tmpCost) {
		this.tmpCost = tmpCost;
	}
	public List<Scene> getTmpSceneList() {
		return tmpSceneList;
	}
	public void setTmpSceneList(List<Scene> tmpSceneList) {
		this.tmpSceneList = tmpSceneList;
	}
	
	
}
