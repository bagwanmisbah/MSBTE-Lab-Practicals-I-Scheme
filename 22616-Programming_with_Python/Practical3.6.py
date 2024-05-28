#WRITE A PROGRAM TO CALCULATE SURFACE VOLUME AND AREA OF A CYLINDER
height=float(input("Enter Height of Cylinder:"))
radian=float(input("Enter Radius of Cylinder:"))
pi=3.14
volume=pi*radian*radian*height
su=((2*pi*radian)*height)+((pi*radian**2)*2)
print(f'Volume of Cylinder : {volume}')
print(f'Surface Area of Cylinder : {su}')


