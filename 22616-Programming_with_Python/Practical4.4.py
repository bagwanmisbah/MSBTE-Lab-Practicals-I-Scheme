#WRITE A PROGRAM TO CHECK IF THE INPUT YEAR IS A LEAP YEAR OF NOT 
year=int(input("Enter any year to check if it is a leap year or not: "))

if year%4==0:
  print(f'{year} is a leap year')
else:
   print(f'{year} is not a leap year')
  
  
