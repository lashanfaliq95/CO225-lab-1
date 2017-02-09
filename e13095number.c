
#include <stdio.h>
int main()
{

int num; 
printf("Enter a number : "); 
scanf("%d",&num); 
if ((num%15!=0)&&(!((num%5==0)&&(num%6==0)&&(num%18!=0))&& (num<999))) {  //not speacial ,not big and weird
    printf("%d is not special or not scary.	\n",num); 
}
else if  ((num%15!=0) && (num>999) && (!((num%5==0)&&(num%6==0)&&(num%18!=0))&& (num<999))) { //big ,not special and not weird
    printf("%d is big but not special or weird.\n",num);
}
else if ((num%15==0) &&(num<999) &&(!((num%5==0)&&(num%6==0)&&(num%18!=0)))) { // speacial,not scary
    printf("%d is special but not scary.\n",num);}


else if ((num%15!=0) &&(!((num%5==0)&&(num%6==0)&&(num%18!=0))) && (num<999)) { //weird,but not special and big
    printf("%d is weird but not special or big.\n",num);
}
else if ((num%15!=0)&&(num>999)&&(!((num%5==0)&&(num%6==0)&&(num%18!=0)))) {  //big and weird but not special
    printf("%d is not special, big and scary but not weird \n",num);
}
else if ((num%15==0)&&(num>999)&& (!((num%5==0)&&(num%6==0)&&(num%18!=0)))) {  //special and big not werid
    printf("%d is special, big and scary but not weird.\n",num);
}
else if ((num%15==0) && (num>999) && (num%5==0)&&(num%6==0)&&(num%18!=0)) { //special ,weird and big
    printf("%d is special, big, weird and scary.\n",num);
}

else if ((num%15==0) &&(num%5==0)&&(num%6==0)&&(num%18!=0)&& (num<999)) { //special ,weird and scary but not big
    printf("%d is special, weird and scary but not big.\n",num);}

return 0;
}






