# Example 1: Breaking out of a for loop
for i in range(10):
    if i == 5:
        print("Breaking at", i)
        break
    print(i)

print("---")

# Example 2: Breaking out of a while loop
count = 0
while True:
    print("Count:", count)
    if count == 3:
        print("Break the loop")
        break
    count += 1

print("---")

# Example 3: Using break in a loop to search for an item
numbers = [2, 4, 6, 8, 10]
for num in numbers:
    if num == 6:
        print("Found 6, breaking loop")
        break
    print("Checked:", num)

print("---")

# Example 4: Nested loops with break
for x in range(3):
    for y in range(3):
        if y == 1:
            print(f"Breaking inner loop at x={x}, y={y}")
            break
        print(f"x={x}, y={y}")