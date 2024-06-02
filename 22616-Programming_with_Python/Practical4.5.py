#WRITE A PROGRAM TO CHECK IF A NUMBER IS POSITIVE, NEGATIVE OR ZERO 
num=int(input("Enter a number:"))
if num>0:
  print(f'{num} is a positive number')
elif num<0:
  print(f'{num} is a negative number')
else:
  print("Zero")
  
