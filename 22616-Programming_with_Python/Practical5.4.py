#WRITE A PYTHON PROGRAM TO PRINT FIBONACCI SERIES.
# 0  1  1  2  3  5  8  13 

fn=0
sn=1
num=int(input("Enter the position upto which Fibonacci Series is to be printed: "))
i=0
while(i<num):
  print(f'{fn}')
  tn=fn+sn
  fn=sn
  sn=tn
  i=i+1
  
  
