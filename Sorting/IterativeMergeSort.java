public class IterativeMergeSort{

  static void Merge(int a[], int l , int mid, int h){
    
    int i = l;
    int j = mid+1;
    
    int k= l;
    int c[] = new int[100];
    while(i <=mid && j<=h){

      if( a[i] < a[j])

        c[k++] = a[i++];
        
      
      else
        c[k++] = a[j++];
      
    }
    for(; i<=mid;i++)
      c[k++] = a[i];
    

    for(; j<=h;j++)
      c[k++] = a[j];
    

    for(i=l;i<=h;i++)
      a[i] = c[i];
    
  }
static void  MergeSort(int A[],int n)
{
    int p,l,h,mid,i;
    for(p=2;p<=n;p=p*2)
    {

        for(i=0;i+p-1<=n;i=i+p)
        {
            l=i;
            h=i+p-1;
            mid=(l+h)/2;
            Merge(A,l,mid,h);
        }
    }
    if(p/2<n)
    Merge(A,0,p/2-1,n);
}


   public static void main(String[] args){

    int a[] = {33,44,2,4,5,22,5,224,53,244,5342,1};
    int l = 0;
    int h = a.length;
    int mid = (l+h)/2;
    
    MergeSort(a, h-1);
        for(int i = 0; i <h; i++){
      System.out.print(a[i]+" ");
    }

  }
}
