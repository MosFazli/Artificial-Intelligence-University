public class CSP_Backtracking
{

static int num = 4;


static boolean safe(boolean[][] graph, int[] color)
{

	for (int i = 0; i < num; i++)
	for (int j = i + 1; j < num; j++)
		if (graph[i][j] && color[j] == color[i])
		return false;
	return true;
}

static void print(int[] color)
{
	for (int i = 0; i < num; i++)
	System.out.print(" " + color[i]);
	System.out.println();
}

static boolean coloring(boolean[][] graph, int m,
							int i, int[] color)
{

	if (i == num) {

	if (safe(graph, color))
	{
		print(color);
		return true;
	}
	return false;
	}

	for (int j = 1; j <= m; j++)
	{
	color[i] = j;

	if (coloring(graph, m, i + 1, color))
		return true;
	color[i] = 0;
	}
	return false;
}

public static void main(String[] args)
{
	
	boolean[][] graph = {
	{ false, true, true, true },
	{ true, false, true, false },
	{ true, true, false, true },
	{ true, false, true, false },
	};
	int colorsNum = 3;
	int[] color = new int[num];
	for (int i = 0; i < num; i++)
	color[i] = 0;
}
