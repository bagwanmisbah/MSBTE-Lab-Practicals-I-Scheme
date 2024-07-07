#3.WRITE A PYTHON PROGRAM TO GET THE LARGEST NUMBER FROM A LIST.

size=int(input("Enter size of list:")) 
l1=[]
for i in range(size):
  el=int(input("Enter element: "))
  l1.append(el)

large=l1[0]

for curr_element in l1:
  if large<curr_element:
      large=curr_element #make current largest element as large

print(large)

#built in 
print(max(l1))

#while loop
#while

large1=l1[0]
i=0
while i<size:
    if large1<l1[i]:
        large1=l1[i]
    i=i+1
        
print(large1)




  
