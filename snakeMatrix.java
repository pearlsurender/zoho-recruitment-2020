public class snakeMatrix {

public static void main(String[] args) {

int n,i,j,k=0;
Scanner s = new Scanner(System.in);
n=s.nextInt();
   for(i=1;i<=n;i++)
   {
       for(j=1;j<=(2*n)-i;j++)  
       {
        System.out.print(j<=n-i?" ":i%2==1?++k:k--);
          /*if(j<=n-i)            //print the spaces
           {
            System.out.print(" ");
           }
           else if(i%2==1)       //print the odd rows
           {
               k++;
               System.out.print(k);
           }
           else                  //print the even rows
           {
            System.out.print(k);
               k--;             //decrement the values
           }*/
       }
       k+=n;                  
       System.out.println();
    }
  }
}
