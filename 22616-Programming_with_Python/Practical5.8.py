#WRITE A PYTHON PROGRAM THAT TAKES A NUMBER AND CHECKS WHETHER IT IS A PALINDROME OR NOT.
num=int(input("Enter a anumber to check if it is Palindrome or not: "))
temp=num
r=0
while num!=0:
  rem=num%10
  r=r*10+rem
  num=num//10
print(r)
if r==temp:
  print("Number is Palindrome")
else:
  print("Number is not Palindrome")
  

  
