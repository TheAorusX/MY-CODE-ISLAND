print("Enter number who's factorial you want to find:")
num=int(input())
fact=(int)(1)
for i in range (1,(num+1),+1):
    fact=(int)(i*fact)
    print(fact,end=" ")