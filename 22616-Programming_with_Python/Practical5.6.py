#WRITE A PYTHON PROGRAM TO REVERSE A GIVEN NUMBER
num=int(input("Enter a number  to reverse it: "))
fin=0
while num!=0:
  rem=num%10
  num=num//10
  fin=fin*10+rem
#print(rem)
print(fin)
  
