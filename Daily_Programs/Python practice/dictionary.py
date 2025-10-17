print("Enter the names and thr ages of the members of the Class")
data={}
print("Enter the number of students in class")
n=int(input())
i=0
while i<n:
    name=str(input("Enter name: "))
    name=name.lower()
    age=int(input("Enter age: "))
    data[name]=age
    i=i+1
print("Enter the name you want to search")
srh=str(input())
srh=srh.lower()
if srh in data:
    print("Match Found")
    print(f"{srh} : {data[srh]}")
else:
    print("Match Not Found")