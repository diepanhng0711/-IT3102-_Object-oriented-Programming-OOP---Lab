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
    char s1[] = "aabcc";
    char s2[] = "adcaa";
    printf("Chuoi s1 la: %s\n", s1);
    printf("Chuoi s2 la: %s\n", s2);
    printf("commonCharacterCount(s1, s2) = %d\n", commonCharacterCount(s1, s2));
}