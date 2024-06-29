#7. WRITE A PYTHON PROGRAM TAKES IN A NUMBER AND FINDS THE SUM OF DIGITS IN A NUMBER.
num=int(input("Enter number to find its sum: "))
sum=0
num1=num
while num!=0:
  rem=num%10
  sum=sum+rem
  num=num//10

print(f'Sum of {num1} : {sum}')

#Alternate way(string)
num=input("Enter number:")
sum=0
for digit in str(num):
  sum=sum+int(digit)

print(sum)
  
