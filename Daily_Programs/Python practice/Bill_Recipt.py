print("Welcome to the Bill Receipt Generator!")
print("Number of items purchased:")
num_items=int(input())
item_list = []
for i in range(num_items):
    item_name = input("Enter item name:")
    item_price = float(input("Enter item price:"))
    item_list.append((item_name, item_price))

print("Itemized Bill Receipt:")
for item in item_list:
    print(f"Item: {item[0]}, Price: {item[1]}")