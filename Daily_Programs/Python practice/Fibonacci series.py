end = int(input("Enter the upper limit for Fibonacci series: "))
a, b = 0, 1
print("Fibonacci series up to", end, ":")
while a <= end:
    print(a, end=" ")
    a, b = b, a + b
print()