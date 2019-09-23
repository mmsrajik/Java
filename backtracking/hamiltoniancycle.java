package backt;

public class hamiltoniancycle {

	private int numofvertices;
	private int[] hamiltonianpath;
	private int[][] adjacencymatrix;
	
	public hamiltoniancycle(int[][] adjacencymatrix)
	{
		this.adjacencymatrix=adjacencymatrix;
		this.hamiltonianpath=new int[adjacencymatrix.length];
		this.numofvertices=adjacencymatrix.length;
		
		this.hamiltonianpath[0]=0;
	}
	
	public void solve()
	{
		if(findfeasiblesolution(1))
		{
			showhamiltonianpath();
		}
		else
		{
			System.out.println("No feasible solution..");
		}
	}
	
	
	
	private boolean findfeasiblesolution(int position) {
		if(position==numofvertices)
		{
			if(adjacencymatrix[hamiltonianpath[position-1]][hamiltonianpath[0]]==1)
			{
				return true;
			}
			else
				return false;
		}
		
		for(int vertexindex=1;vertexindex<numofvertices;++vertexindex)
		{
			if(isfeasible(vertexindex,position))
			{
				hamiltonianpath[position]=vertexindex;
				
				if(findfeasiblesolution(position+1))
				{
					return true;
				}
				
				//backtrack....
			}
		}
		return false;
		
	}
	
	private boolean isfeasible(int vertexindex, int actualposition)
	{
		if(adjacencymatrix[hamiltonianpath[actualposition-1]][vertexindex]==0)
			return false;
		
		for(int i=0;i<actualposition;i++)
		{
			if(hamiltonianpath[i]==vertexindex)
			{
				return false;
			}
		}
		return true;

	}
	
	private void showhamiltonianpath()
	{
		System.out.println("hamiltonian cycle");
		for(int i=0;i<hamiltonianpath.length;i++)
			System.out.print(hamiltonianpath[i]+" ");
		
		System.out.print(hamiltonianpath[0]);
	}
	
	public static void main(String args[])
	{
		int[][] matrix= {
				{0,1,1,1,0,0},
				{1,0,1,0,1,0},
				{1,1,1,1,0,1},
				{1,0,1,0,0,1},
				{0,1,0,0,0,1},
				{0,1,1,1,1,1}
		};
		
		hamiltoniancycle cycle=new hamiltoniancycle(matrix);
		cycle.solve();
	}
}
