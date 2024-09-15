package sorting;
public class quicksorting {


static void print(int a[]){
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
    }
    System.out.println();
}

static void swap(int a[],int st,int end){
    int temp=a[st];
    a[st]=a[end];
    a[end]=temp;
}

static void quickSorting(int a[],int st,int end){
    if (st>=end)return;
    int pi = partition(a,st,end);
    quickSorting(a, st, pi - 1);
    quickSorting(a, pi + 1, end); 
}


/*8 3 2 4 1*/
/*3 2 4 1 8*/
/*3 2 4 1*/  /*8*/ /**/
/*2 4 3 1*/
/*2 4*/ /*3*/ /*1*/
/*2*/ /*4*/
/*2 4*/ /*3*/ /*1*/
/*1 2 4*/ /*3*/
/*1 2 3 4*/ /*8*/ /**/
/*1 2 3 4 8*/

static int partition(int a[],int st,int end){

int pi = a[st];
int count = 0;
for (int i = st + 1; i <=end; i++) {
    if (a[i]<=pi) {
        count++;
    }
}
int pivotIdx = st + count;
swap(a, st, pivotIdx);
int i=st,j=end;
while (i<pivotIdx && j > pivotIdx) {
    while (a[i]<= pi)i++;
    while(a[j] > pi)j--;
    if( i < pivotIdx && j >pivotIdx){
        swap(a, i, j);
        i++;
        j--;
    } 
}

return pivotIdx;
}

    public static void main(String[] args) {
        int a[]={8,3,2,4,1};
        System.out.println("input array");
        print(a);
        System.out.println("output array");
        quickSorting(a, 0, a.length - 1);
        print(a);
        
    }
}
