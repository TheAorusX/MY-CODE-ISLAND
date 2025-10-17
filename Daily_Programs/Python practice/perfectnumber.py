print("Enter the number that u want to check")
n=int(input())
s=int(0)
for i in range(1,n,+1):
    if(n%i==0):
        s=s+i
    
if(s==n):
    print(n, "Is a Perfect Number")
else:
    print(n, "Is not a Perfect Number")