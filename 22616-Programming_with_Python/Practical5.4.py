#WRITE A PYTHON PROGRAM TO PRINT FIBONACCI SERIES.
# 0  1  1  2  3  5  8  13 

fn=0,sn=1,tn
num=int(input("Enter the position upto which Fibonacci Series is to be printed: "))
i=num
while(i<num):
  print(f'{fn} {sn}')
  fn=sn
  sn=fn+sn
  
  
