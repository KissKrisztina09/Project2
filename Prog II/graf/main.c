#include <stdio.h>
#include <stdlib.h>
typedef struct{
    int kezdop, vegpont, suly;
}EL;

EL* beolvas(int*, int*);
int** matrix(EL*, int, int);
int main()
{   EL* el;
    int n=0, m=0;
    el = beolvas(&n, &m);

    int** szM;
    szM = matrix(el, n, m);
    for(int i =1; i<=n; ++i){
        for( int j=1; j<=n; ++j){
            printf("%3i", szM[i][j]);
        }
        printf("\n");
    }
    return 0;
}

EL* beolvas(int *pn, int* pm){
    FILE *fin;
    fin = fopen("be.txt", "rt");
    if(!fin){printf("Megnyitasi hiba!"); return 0;}
    int n, m;
    fscanf(fin, "%i%i", &n, &m);
    EL *a = (EL*)malloc((m+1)*sizeof(EL));
    for( int i=1; i<=m; ++i){
        fscanf(fin, "%i%i%i", &a[i].kezdop, &a[i].vegpont, &a[i].suly);
        printf("%i %i %i \n", a[i].kezdop, a[i].vegpont, a[i].suly );
    }
    printf("\n");
    *pn = n;
    *pm = m;
    return a;
}

int** matrix (EL *el, int n, int m){
    int **a;
    a = (int**)malloc((n+1)*sizeof(int*));
    for(int i=1; i<=n; ++i){
        a[i]= (int*)calloc((n+1),sizeof(int));
    }
   for(int i=1; i<=m; ++i){
        a[el[i].kezdop][el[i].vegpont]= el[i].suly;
    }
    return a;
}
