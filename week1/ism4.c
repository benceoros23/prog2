#include <stdio.h>

int find(int hossz,int *tomb,int szam)
{
    for(int i=0; i<hossz;i++)
    {
        if(tomb[i]==szam)
        {
            return i;
        }
        else
        {
            return -1;
        }
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
   int result=find(hossz,tomb,8);
   printf("a szám ezen a helyen található: %d\n",result);

    return 0;
}