#include <stdio.h>
#include <stdlib.h>

int main()
{

    FILE *fptr;

    fptr = fopen("iindex.html", "w");
 
       if (fptr == NULL) {
           printf("The file is not opened. The program will "
                  "now exit.");
         exit(0);
       }
   
    fprintf(fptr, "<!DOCTYPE html>\n");
    fprintf(fptr, "<head>\n");
    fprintf(fptr, "<title>Document</title>\n");

    fprintf(fptr, "<style>\n");
    fprintf(fptr, "table, td, th {\n");
    fprintf(fptr, "border: solid 1px;\n");
    fprintf(fptr, "border-collapse: collapse;\n");
    fprintf(fptr, "font-weight: bold;\n");
    fprintf(fptr, "}\n");
    fprintf(fptr, "</style>\n");

    fprintf(fptr, "</head>\n");

    fprintf(fptr, "<body>\n");
    fprintf(fptr, "<h1>Hello World!</h1>\n");

    fprintf(fptr, "<table>\n");

    fprintf(fptr, "<tr>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<tr>\n");

    fprintf(fptr, "<tr>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<tr>\n");

    fprintf(fptr, "<tr>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<tr>\n");

    fprintf(fptr, "<tr>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<td>Sample Text</td>\n");
    fprintf(fptr, "<tr>\n");

    fprintf(fptr, "<table>\n");

    fprintf(fptr, "</body>\n");
    fprintf(fptr, "</html>\n");

    return 0;
}
