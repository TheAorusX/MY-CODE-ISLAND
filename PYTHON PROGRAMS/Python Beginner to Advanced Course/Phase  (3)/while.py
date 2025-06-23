# Example 1: Basic while loop
count = 1
while count <= 5:
    print("Count is:", count)
    count += 1

# Example 2: Using while loop with user input
password = ""
while password != "python123":
    password = input("Enter the password: ")
print("Access granted!")

# Example 3: Infinite while loop with break
while True:
    num = int(input("Enter a positive number (0 to exit): "))
    if num == 0:
        print("Exiting loop.")
        break
    print("You entered:", num)

# Example 4: Using while loop with else
n = 3
while n > 0:
    print(n)
    n -= 1
else:
    print("Loop finished!")