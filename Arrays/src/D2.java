import org.junit.Test;

public class D2 {
	
@Test
public void abc() {
	
	int [][]a=new int[2][3];
	 a[0][0]=10;
	 a[0][1]=11;
	 a[0][2]=12;
	 a[1][0]=13;
	 a[1][1]=14;
	 a[1][2]=15;

int	size=a.length;
System.out.println(size);

for(int i=0;i<a.length;i++)//a.length is number of raws here 2 calculate students is row and their subject is column
{
	 for(int j=0;j<a[i].length;j++) {// 
		
		 System.out.println(a[i][j]);
		 
		 
	 }
	 System.out.println();
}
//System.out.println(a[0].length)=3
// -System.out.println(a[1].length)=3
}

}		
	
		



