#XI. EXERCISE
#1.	WRITE A PYTHON PROGRAM TO SUM ALL THE ITEMS IN A LIST.

size=int(input("Enter number of elements: "))
l1=[]
for i in range(size):
  el=int(input("Enter Element: "))
  l1.append(el)
  
#for loop
Sum=0
for i in range(size):
    Sum =Sum+l1[i]
    
print(Sum)
#while loop
Sum=0
i=0
while i<len(l1):
    Sum=Sum+l1[i]
    i=i+1

print(Sum)
#using built-in function
print(sum(l1))



  
