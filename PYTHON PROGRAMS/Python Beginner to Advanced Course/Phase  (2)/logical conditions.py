# Examples of 'and'
print(True and True)      # True
print(True and False)     # False
print(5 > 2 and 3 < 4)    # True
print('a' in 'apple' and 10 != 5)  # True
print(0 and 1)            # 0 (falsy value)

# Examples of 'or'
print(True or False)      # True
print(False or False)     # False
print(5 < 2 or 3 < 4)     # True
print('z' in 'apple' or 10 == 10)  # True
print([] or [1,2,3])      # [1, 2, 3] (first truthy value)

# Examples of 'not'
print(not True)           # False
print(not False)          # True
print(not (5 > 2))        # False
print(not 0)              # True (0 is falsy)
print(not 'hello' == 'world')  # True