

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int* plusOne(int* d, int n, int* returnSize)
{
    int*result=malloc(sizeof(int)*110);
    int k=0,i=n-1;
    int carry=1;
    while(i>=0)
    {
        printf("%d\n",i);
        result[k++]=(d[i]+carry)%10;
        carry=(d[i]+carry)/10;
        i--;
    }
    if(carry==1)
        result[k++]=carry;
    int f=0,l=k-1;
    while(f<l)
    {
        int temp=result[f];
        result[f]=result[l];
        result[l]=temp;
        f++;
        l--;
        
    }
    *returnSize=k;
    return result;
    
}