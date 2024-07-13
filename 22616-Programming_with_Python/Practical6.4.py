#4.WRITE A PYTHON PROGRAM TO GET THE SMALLEST NUMBER FROM A LIST.
l1=[]
size=int(input("Enter size of List: "))
for i in range(0,size):
  el=int(input("Enter element: "))
  l1.append(el)

print("Smallest number: ")
small=l1[0]

#for loop
for curr_element in l1:
  if small > curr_element:
    small=curr_element

print(small)
#while loop


small1=l1[0]
i=0
while i<size:
  if small1>l1[i]:
    small1=l1[i]
  i=i+1

print(small1)
