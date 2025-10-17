import time 
pwd=str(input("Enter the password you want to set: "))
print("Password set successfully!")
l = len(pwd)
encrypted_pwd = ""
for i in range(l):
    ch = ord(pwd[i])
    if ch >= 65 and ch <= 90:  # Uppercase letters
        ch = ch + 5
    elif ch >= 97 and ch <= 122:  # Lowercase letters
        ch = ch + 5
    elif ch >= 48 and ch <= 57:  # Digits
        ch = ch + 2
    elif ch == 32:  # Space
        ch = ord('$')
    else:  # Other characters
        encrypted_pwd += pwd[i]
        continue
    encrypted_pwd += chr(ch)
print("Encrypted password:", encrypted_pwd)
time.sleep(4)
Dc = str(input("Do you want to decrypt the password? (yes/no): ")).lower()
if Dc == 'no':
    print("Exiting the program.")
elif Dc == 'yes':
    decrypted_pwd = ""
    for i in range(l):
        ch = ord(encrypted_pwd[i])
        if ch >= 65 and ch <= 90:  # Uppercase letters
            ch = ch - 5
        elif ch >= 97 and ch <= 122:  # Lowercase letters
            ch = ch - 5
        elif ch >= 48 and ch <= 57:  # Digits
            ch = ch - 2
        elif ch >=123 and ch <= 126:  # Special characters
            ch = ch - 5
        elif ch>=91 and ch<=96:  # Special characters
            ch = ch - 5
        elif ch>=57 and ch<=59:  # Digits
            ch = ch - 2
        elif ch == ord('$'):  # Space
            ch = ord(' ')
        else:  # Other characters
            decrypted_pwd += encrypted_pwd[i]
            continue
        decrypted_pwd += chr(ch)
    print("Password decryption completed!")
    print("Decrypted password is:", decrypted_pwd)
    print("Exiting the program.")
