print("Enter number to be checked: ")
n=int(input())
num=n
s=int(0)
while num!=0:
    d=int(num%10)
    s=s+(d*d*d)
    num=(num/10)

if(s==n):
    print(n, "Is An Armstrong Number")
else:
    print(n, "Is Not An Armstrong Number")