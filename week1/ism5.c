#include <stdio.h>

void kiir(int length,int tomb[])
{
    for(int i=0;i<length;i++)
   {
    printf("%d\n",tomb[i]);
   }
}

int main()
{
   int hossz=10;
   int tomb[hossz];
   for(int i=0;i<hossz;i++)
   {
    tomb[i]=i;
   }
   kiir(hossz,tomb);
}