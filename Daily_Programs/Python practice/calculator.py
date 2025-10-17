print("Welcome to the calculator!")
result=0
while True:
    print("Enter + to add    | - to subtract      | * to multiply    | / to divide | q to quit | r to restart")
    print("Enter ^ for power | sr for square root | cr for cube root | ! for factorial")
    print("Enter operation: ")
    op=str(input().lower())
    if op=='q':
        print("Last stored value is: ", result)
        print("Exiting calculator. Goodbye!")
        break
    elif op=='+':
        opp=str(input("new operation: n | continue operation: c  "))
        if opp=='c':
            an=int(input())
            result=int(result+an) # type: ignore
            print("result",result)
        elif opp=='n':
            result=0
            print("enter 1st and 2nd number")
            an1=int(input())
            an2=int(input())
            result=int(result+an1+an2)
            print("result",result)
    elif op=='-':
        opp=str(input("new operation: n | continue operation: c  "))
        if opp=='c':
            an=int(input())
            result=int(result-an) # type: ignore
            print(result)
        elif opp=='n':
            result=0
            print("enter 1st and 2nd number")
            an1=int(input())
            an2=int(input())
            result=int(result+an1-an2)
            print("result",result)
    elif op=='*':
        opp=str(input("new operation: n | continue operation: c  "))
        if opp=='c':
            an=int(input())
            result=int(result*an) # type: ignore
            print(result)
        elif opp=='n':
            result=0
            print("enter 1st and 2nd number")
            an1=int(input())
            an2=int(input())
            result=int(result+(an1*an2))
            print("result",result)
    elif op=='/':
        opp=str(input("new operation: n | continue operation: c  "))
        if opp=='c':
            an=int(input())
            result=int(result/an) # type: ignore
            print(result)
        elif opp=='n':
            result=0
            print("enter 1st and 2nd number")
            an1=int(input())
            an2=int(input())
            result=int(result+(an1/an2))
            print("result",result)
    elif op=='^':
        opp=str(input("new operation: n | continue operation: c  "))
        if opp=='c':
            an=int(input())
            result=int(result**an) # type: ignore
            print(result)
        elif opp=='n':
            result=0
            print("enter 1st and 2nd number")
            an1=int(input())
            an2=int(input())
            result=int(result+(an1**an2))
            print("result",result)
    elif op=='sr':
        opp=str(input("new operation: n | continue operation: c  "))
        if opp=='c':
            result=float(result**(1/2)) # type: ignore
            print(result)
        elif opp=='n':
            result=0
            print("enter number")
            an=int(input())
            result=float(an**(1/2))
            print("result",result)
    elif op=='cr':
        opp=str(input("new operation: n | continue operation: c  "))
        if opp=='c':
            result=float(result**(1/3)) # type: ignore
            print(result)
        elif opp=='n':
            result=0
            print("enter number")
            an=int(input())
            result=float(an**(1/3))
            print("result",result)
    elif op=='!':
        opp=str(input("new operation: n | continue operation: c  "))
        if opp=='c':
            an=int(input())
            fact=1
            for i in range(1, an + 1):
                fact *= i
            result=fact
            print(result)
        elif opp=='n':
            result=0
            print("enter number")
            an=int(input())
            fact=1
            for i in range(1, an + 1):
                fact *= i
            result=fact
            print("result",result)
    elif op=='r':
        print("Restarting calculator...")
        result = 0
        continue
    else:
        print("Invalid operation, please try again.")
        continue