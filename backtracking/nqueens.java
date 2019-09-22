package backtracking;

public class nqueens {

	
	private int[][] chesstable;
	private int numofqueens;
	
	private nqueens(int numofqueens)
	{
		this.chesstable=new int[numofqueens][numofqueens];
		this.numofqueens=numofqueens;
		
	}
	
	
	
	public void solve()
	{
		if(setqueens(0))
		{
			printqueens();
		}
		else
		{
			System.out.println("There is no solution..");
		}
	}
	
	
	
	public boolean setqueens(int colindex)
	{
		if(colindex==numofqueens)
		{
			return true;
		}
		
		for(int rowindex=0;rowindex<numofqueens;rowindex++)
		{
			if(isplacevalid(rowindex,colindex))
			{
				chesstable[rowindex][colindex]=1;
				if(setqueens(colindex+1))
				{
					return true;
				}
				
				// backtrack...
				chesstable[rowindex][colindex]=0;
			}
		}
		return false;	
	}
	
	
	private boolean isplacevalid(int rowindex,int colindex)
	{
		for(int i=0;i<colindex;i++)
		{
			if(chesstable[rowindex][i]==1)
				return false;
			
		}
		for(int i=rowindex,j=colindex;i>=0 && j>=0;i--,j--)
		{
			if(chesstable[i][j]==1)
				return false;
		}
		for(int i=rowindex,j=colindex;i<chesstable.length && j>=0;i++,j--)
		{
			if(chesstable[i][j]==1)
			return false;
		}
		return true;
	}
	
	public void printqueens()
	{
		for(int  i=0;i<chesstable.length;i++)
		{
			for(int j=0;j<chesstable.length;j++)
			{
				if(chesstable[i][j]==1)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
nqueens n=new nqueens(5);
		n.solve();
	
		
	}

}
