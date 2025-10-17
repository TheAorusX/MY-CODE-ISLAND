ln=int(input("Enter No. Of Students: "))
register=[]
for i in range(ln):
    register.append(input())
register.sort()
print("Printing sorted list: ",register)