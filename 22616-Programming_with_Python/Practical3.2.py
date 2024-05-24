#WRITE A PROGRAM TO CONVERT BITS TO MEGABYTES, GIGABYTES AND TERABYTES 
bits=float(input("Enter bits:"))
byte=0.125 * bits
mb=0.000001*byte
gb=0.001*mb
tb=0.001*gb
print(f'\n{bits} are {mb} Megabytes,\n{gb} Gigabytes\n and {tb} Terabytes')
