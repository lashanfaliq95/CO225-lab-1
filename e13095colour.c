#include<stdio.h>
#include<stdlib.h>
int main() {
int r,g,b,r1,g1,b1;
printf("Enter the colour : ");
scanf("%d %d %d",&r,&g,&b);
if((abs(r-(255-r))>32)||(abs(g-(255-g))>32)||(abs(b-(255-b))>32)){/*if the absolute value of the difference between each component of a color and its corresponding 
	component of the colour's complement is more than 32 that means the complement can be written by just substracting the value from 255.
*/
    r1=255-r,g1=255-g,b1=255-b;
}
else{
	
    if((r<128)&&(g<128)&&(b<128)){//if less than 128 you have to add 128

        r1=r+128;g1=g+128;b1=b+128;
    }
    else if((r>128)&&(g>128)&&(b>128)){//if more than 128 you have to substract 128
        r1=r-128;g1=g-128;b1=b-128;
    }
    else if((r>128)&&(g>128)&&(b<128)){
        r1=r-128,g1=g-128,b1=b+128;
    }
    else if((r>128)&&(g<128)&&(b>128)){
        r1=r-128;g1=g+128;b1=b-128;
    }
    else if((r<128)&&(g>128)&&(b>128)){
        r1=r+128;g1=g-128;b1=b-128;
    }
   else if((r>128)&&(g<128)&&(b<128)){
        r1=r-128;g1=g+128;b1=b+128;
    }
    else if ((r<128)&&(g<128)&&(b>128)){
      r1=r+128;g1=g+128;b1=b-128;
    }
    else if((r<128)&&(g>128)&&(b<128)){
        r1=r+128;g1=g-128;b1=b+128;

    }
}
printf("The complement: %d %d %d ",r1,g1,b1);
return 0;


}
