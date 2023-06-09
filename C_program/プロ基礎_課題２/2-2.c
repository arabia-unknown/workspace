#include<stdio.h>

void tolower(char n[]){
    int a;
    for(a=0;n[a]!='\0';a++){
        n[a]='a'+n[a]-'A';
    }
}

int main(void){
    char name[128],filename[128];
    FILE *fp;
    printf("Please choose a file;");
    scanf("%s",filename);
    if((fp=fopen(filename,"r"))==NULL){
        printf("Reading error.\n");
        return 0;
    }
    printf("Large word is");
    fscanf(fp,"%s",name);
    printf("%s\n",name);
    tolower(name);
    printf("Small word is %s",name);
    fclose(fp);
    return 0;
}
