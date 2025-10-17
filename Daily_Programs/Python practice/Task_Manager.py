print("TO-DO-LIST")
def option():
    print("Enter 'A' to Add new Task")
    print("Enter 'V' to View Task")
    print("Enter 'R' to Remove tasks")
    print("Enter 'E' to Exit")
Tasks=[]
Task={}
option()
while True:
    ip =(input()).upper()
    if ip == 'A':
        tsk = str(input("Enter New Task: "))
        stat = str(input("Enter Due Date: "))
        Task.update({tsk:stat})
        Tasks.extend(Task.copy())
    elif ip == 'V':
        for task in Tasks:
            print(task)
    elif ip == 'R':
        lo = str(input("Which Task Do You Want To Delete: "))
        Task.pop(lo, None)
    elif ip=='E':
        print("Saving Changes..")
        break