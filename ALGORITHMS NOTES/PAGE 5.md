ALGORITHMS :

> Frequency Count Method:
Algorithm Sum(A,n)
{
    s=0;________________________1
    for(i=0;i<n;i++) // if n=5__n+1
        s=s+A[i];_______________n
}
return s;_______________________1

OUTPUT :
i=0
i=1
i=2
i=3
i=4


Time Function f(n)=2n+3
order of n

s, n, i each are of size 1 and A is of size n
Space Complexity S(n)=n+3
order of n

Algorithm Add(A,B,n)
    for (i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                C[i,j]=A[i,j]+B[i,j]
            }
        }
