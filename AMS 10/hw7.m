b = [1,1,0,0;
   0,1,1,1;
   1,0,1,1;
   0,1,1,0];


B = g2rref(b)

h=[1,0,0,0;
    0,1,0,0;
    0,0,1,0;
    0,0,0,1;
    0,1,1,1;
    1,0,1,1;
    1,1,0,1]
a=[1;0;0;1]
h*a

b=[0;0;1;1]

h*b

c=[0;1;0;1]

h*c


H=[0,0,0,1,1,1,1;
    0,1,1,0,0,1,1;
    1,0,1,0,1,0,1]
A=[0;1;0;1;1;0;1]
H*A

mod(H*A,2)

b=[1;0;0;0;0;1;1]
 
mod(H*b,2)

c=[0;0;1;0;1;1;1]

mod(H*c,2)

d=[0;1;0;1;0;1;0]

mod(H*d,2)

f=[1;0;0;1;1;0;1]
mod(H*f,2)

g=[1;0;1;0;0;1;0]

mod(H*g,2)

h=[1;1;1;0;1;1;1]
mod(H*h,2)

