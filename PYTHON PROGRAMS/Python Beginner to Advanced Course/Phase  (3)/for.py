# Example 1: Skipping even numbers in a loop
for i in range(1, 6):
    if i % 2 == 0:
        continue
    print("Odd number:", i)

print("---")

# Example 2: Skipping specific values
fruits = ["apple", "banana", "cherry", "date"]
for fruit in fruits:
    if fruit == "banana":
        continue
    print("I like", fruit)

print("---")

# Example 3: Using continue in a while loop
count = 0
while count < 5:
    count += 1
    if count == 3:
        continue
    print("Count is", count)

print("---")

# Example 4: Nested loops with continue
for i in range(3):
    for j in range(3):
        if j == 1:
            continue
        print(f"i={i}, j={j}")