#WRITE A PROGRAM TO CHECK THE LARGEST NUMBER AMONG THE THREE NUMBERS 
a=int(input("Enter first number: "))
b=int(input("Enter second number: "))
c=int(input("Enter third number: "))
if a>b and a>c:
  print(f'{a} is the greatest number')
elif b>a and b>c:
  print(f'{b} is the greatest number')
elif c>a and c>b:
  print(f'{c} is the greatest number')
else:
  print("All are equal")
