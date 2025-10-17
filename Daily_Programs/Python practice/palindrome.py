print("Enter number to check if it is a palindrome number:")
n=int(input())
num=n
rnum=int(0)
while num!=0:
    d=int(num%10)
    rnum=(rnum*10)+d
    num=int(num/10)

if(n==rnum):
    print(n ,"Is palindrome number")
else:
    print(n ,"Is not palindrome number")        