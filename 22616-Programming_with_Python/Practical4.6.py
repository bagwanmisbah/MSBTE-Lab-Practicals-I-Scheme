#WRITE A PROGRAM THAT TAKES THE MARKS OF 5 SUBJECTS AND DISPLAYS THE GRADE. 
def accept():
    l1=[]
    for i in range(5):
        num=int(input("Enter marks :"))
        l1.append(num)
    total=sum(l1)
    return total

def calcgrade(result):
  if result>=90:
    return 'A'
  elif result>=80:
    return 'B'
  elif result>=70:
    return 'C'
  elif result>=60:
    return 'D'
  else:
    return 'F'

t=accept()
c=calcgrade(t)
print(f'Average marks: {t}')
print(f'Grade calculated: {c}')
