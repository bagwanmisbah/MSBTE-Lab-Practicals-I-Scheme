#WRITE A PYTHON PROGRAM TO CALCULATE FACTORIAL OF A NUMBER
#factorial of 5=120

num=int(input("Enter number to calculate Factorial: "))
i=1
for i in range(1,num):
    num=num*i

print(f'Factorial is : {num}')
