package ivtl;
import java.util.*;
public class primerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0,c=0,j=0,o=0;
		Scanner x=new Scanner(System.in);
int sr=x.nextInt();
int ed=x.nextInt();

for(j=sr;j<=ed;j++)
{
for(i=1;i<=ed;i++)
{
	if(j%i==0)
	{
		c++;
	}
}
if(c==2)
{   
	c=0;
	o++;
}
else
{
	c=0;
}

     }
System.out.println(o);

	
	}
}
