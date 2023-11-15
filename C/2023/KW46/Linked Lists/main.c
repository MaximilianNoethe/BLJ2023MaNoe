#include <stdio.h>
#include "linkedlist.h"

int main(void)
{
    TNode *myNode = initNode(10);
    return 0;
}

void initNode(int data)
{
    TNode *newNode = (TNode *)malloc(sizeof(TNode));

    newNode->data = data;     // Datenfeld setzen
    newNode->nextNode = NULL; // nextNode Pointer auf NULL setzen
}