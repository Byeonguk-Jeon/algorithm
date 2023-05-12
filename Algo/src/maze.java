
public class maze {

	static int N = 8;
	
	static int [][] maze = {
			{0,0,0,0,0,0,0,1},		
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
					
	};
	
	static final int PATHWAY_COLOR = 0; //white
	static final int WALL_COLOR = 1; //blue
	static final int BLOCKED_COLOR = 2; //red
	static final int PATH_COLOR = 3; // green ��ġ�� �湮�غ����� ������ �ƴ��� �𸥴� 
	
	public static void main(String[] args) {
		
		boolean result = findMazePath(0, 0);
		if(result) {
			System.out.println("find exit");
		}else {
			System.out.println("Not found");
		}

	}
	
	public static boolean findMazePath(int x, int y) {

		if (x < 0 || y < 0 || x >= N || y >= N)
			return false; // �̷��� ���� �ٱ�

		else if (maze[x][y] != PATHWAY_COLOR) // �̹� �湮�ްų� ���ΰ�� 
			return false;
		else if (x == N - 1 && y == N - 1) {
			maze[x][y] = PATH_COLOR;
			return true;
		} else {
			maze[x][y] = PATH_COLOR;
			// ������ 4���� ��ǥ 
			// �� �� �� �� 
			if (findMazePath(x - 1, y) || findMazePath(x, y + 1) || findMazePath(x + 1, y) || findMazePath(x, y - 1)) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOR; // dead end
			return false;

		}

	}

	
}