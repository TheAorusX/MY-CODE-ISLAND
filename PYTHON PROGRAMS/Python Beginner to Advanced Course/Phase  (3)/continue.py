for i in range(1, 6):
    if i % 2 == 0:
        continue
    print(i)
# Output: 1 3 5
# Example 2: Skipping specific values
fruits = ["apple", "banana", "cherry", "date"]
for fruit in fruits:
    if fruit == "banana":
        continue
    print("I like", fruit)
# Output: I like apple
#         I like cherry
#         I like date
# Example 3: Using continue in a while loop
count = 0
while count < 5:
    count += 1
    if count == 3:
        continue
    print("Count is", count)
# Output: Count is 1
#         Count is 2
#         Count is 4
#         Count is 5
# Example 4: Nested loops with continue
for i in range(3):
    for j in range(3):
        if j == 1:
            continue
        print(f"i={i}, j={j}")
# Output: i=0, j=0
#         i=0, j=2