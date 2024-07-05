#2.WRITE A PYTHON PROGRAM TO MULTIPLY ALL THE ITEMS IN A LIST.
size=int(input("Enter number of items you want:"))
res=1
l1=[]
for i in range(0,size):
  el=int(input("Enter Elements: "))
  l1.append(el)

for i in l1:
  res=res*i

print(res)
#USING WHILE LOOP
 
i=0
while i<size:
    res=res*l1[i]
    i=i+1
    
print(res)
