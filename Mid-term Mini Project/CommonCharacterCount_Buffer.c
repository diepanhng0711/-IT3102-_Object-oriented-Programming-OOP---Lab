#include<stdio.h>
#include<string.h>

int commonCharacterCount(char x[], char y[]) {
    int count = 0;
    for (int i = 0; i < strlen(x); i++) {
        for (int j = 0; j < strlen(y); j++) {
            if (x[i] == y[j] && x[i] != ' ' && y[j] != ' ') {
                count++;
                y[j] = ' ';
                break;
            }
        }
    }
    return count;
}

int main() {
    char s1[100];
    char s2[100];
    printf("Nhap chuoi s1: \n");
    fgets(s1, 100,stdin);
    printf("Nhap chuoi s2: \n");
    fgets(s2, 100,stdin);
    printf("Chuoi s1 la: %s\n", s1);
    printf("Chuoi s2 la: %s\n", s2);
    printf("commonCharacterCount(s1, s2) = %d\n", commonCharacterCount(s1, s2));
    printf("%d\t%d\n", strlen(s1), strlen(s2));
}