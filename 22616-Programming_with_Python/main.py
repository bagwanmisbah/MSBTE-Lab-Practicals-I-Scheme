text = 'miSBaH  iQBal  bAGWAn'
print("UPPER : ", text.upper())
print("LOWER : ", text.lower())
print("TITLE : ", text.title())
str = "I SAW A ROSE IN A GLASS VASE THROUGH THE ROSE TINTED GLASS WINDOW" ; str2 = "ROSE" ; str3 = "GLASS"
print("The first occurrence of ROSE and GLASS is at : ", end="")
print("\n", str.find(str2, 4))
print("\n", str.find(str3, 4))
print("The last occurrence of ROSE and GLASS is at : ", end="")
print("\n", str.rfind(str2, 4))
print("\n", str.rfind(str3, 4))
str3 = "Bagwan"
str4 = "My name is Misbah Bagwan"
if str4.startswith(str3):
    print("str1 begins with : " + str3)
else:
    print("str1 does not begin with : " + str3)
if str4.endswith(str3):
    print("str1 ends with : " + str)
else:
    print("str1 does not end with : " + str)
str5 = "MISBAH BAGWAN"
str6 = "misbah bagwan"
if str5.isupper():
    print("All characters in str are upper cased")
else:
    print("All characters in str are not upper cased")
if str6.islower():
    print("All characters in str1 are lower cased")
else:
    print("All characters in str1 are not lower cased")
str7 = "My name is Misbah Bagwan"
print(" The length of string is : ", len(str7))
str8 = "Python is an easy programming language"
print("The string after centering with '-' is : ", end="")
print(str8.center(20, '-'))
print("The string after ljust is : ", end="")
print(str8.ljust(20, '-'))
print("The string after rjust is : ", end="")
print(str8.rjust(20, '-'))
str9 = "PYTHON MAD ETI "
str10 = " 22616"
print(str.isalpha(),str10.isalnum(),str10.isspace())
str11 = "i took the elevator and entered the flat"
str12 = "lift"
str13 = "elevator"
print ("The string after replacing strings is : ", end="")
print (str11.replace( str12, str12, 2))

-----------------------------------------------------------------------------------------------
'''def sayName(str1):
    print("My name is  " + str1)  # STRING FUNCTION


def add(num1, num2):
    a = int(num1)
    b = int(num2)
    c = a + b
    print(f'Addition is :{c}')  # INTEGER FUNCTION


def convert(mytuple):
    print(mytuple)
    print(type(mytuple))
    mylist = list(mytuple)  # THIS FUNCTION CONVERTS TUPLE
    print(type(mylist))        # TO LIST AND RETURNS IT
    return mylist


sayName("Misbah")
add(5, 10)
print(convert((1, 2, 3,)))


def concatenate(str1, str2):
    print("This function returns concatenation of strings passed as argument")
    print("Arguments are : ", str1, str2)
    print("Concatenation is : ", str1 + str2)

concatenate('Misbah', 'Bagwan')'''


def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)
n=int(input("Enter a number : "))
print(f'Factorial of {n}:',factorial(n))



-----------------------------------------------------------------------------------------------
class cal():
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def add(self):
        return self.a + self.b

    def sub(self):
        return self.a - self.b

    def multiply(self):
        return self.a * self.b

    def divide(self):
        return self.a / self.b


a = int(input('Enter First number : '))
b = int(input('Enter Second number : '))
obj = cal(a, b)
while True:
    def menu():
        x = '1. Add \n2. Sub \n3. Multiply \n4. Divide'
        print(x)


    menu()
    choice = int(input('Please select one of the following : '))
    if choice == 1:
        print("Result: ", obj.add())
    elif choice == 2:
        print("Result: ", obj.sub())
    elif choice == 3:
        print("Result: ", obj.multiply())
    elif choice == 4:
        print("Result: ", obj.divide())
    elif choice == 0:
        print('Again try one of the following')
        break
    else:
        print('Invalid option')
        break
print()

-----------------------------------------------------------------------------------------------
first = input("Enter Your First Number : ")
second = input("Enter Your Second Number : ")
sum = int(first) + int(second)
print("The  sum is :" + str(sum))

-----------------------------------------------------------------------------------------------
'''l1 = [10, 20, 30, 40, 50]
n = len(l1)
max1 = l1[n - 1]
max2 = l1[n - 2]
l2 = [max1 + max2]
print(l2)'''


def add(l2, size):
    size = len(l2)
    max1 = l2[size - 1]
    max2 = l2[size - 2]
    l2 = [max1 + max2]
    for i in l2: 
        print(i)
l1 = []
num = int(input("Enter no of elements : "))
for i in range(0, num):
    n = int(input("enter elements : "))
    l1.append(n)
l1.sort()
add(l1, n)
