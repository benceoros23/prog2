#include <stdio.h>

void line1(int szam)
{
    for(int i=1; i<=szam;i++)
    {
        printf("-");
    }
    puts("");
}

void line2(int szam2,char jel)
{
    for(int i=1; i<=szam2;i++)
    {
        printf("%c",jel);
    }
    puts("");
}

int main()
{
   line1(10);
   line2(30, '*');
   return 0;
}