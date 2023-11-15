#include <stdio.h>
#include "linkedlist.h"

int main(void)
{
    TNode *head = initNode(10);
    TNode *myNode1 = initNode(12);
    TNode *myNode2 = initNode(8);
    TNode *myNode3 = initNode(18);
    TNode *myNode4 = initNode(1);
    TNode *myNode5 = initNode(30);

    head->nextNode = myNode1;
    myNode1->nextNode = myNode2;
    myNode2->nextNode = myNode3;
    myNode3->nextNode = myNode4;
    myNode4->nextNode = myNode5;
    myNode5->nextNode = NULL;

    printf("Data from fifth node: %d", myNode5->data);

    return 0;
}

TNode *initNode(int value)
{

    TNode *newNode = malloc(sizeof(TNode));

    newNode->data = value;    // Datenfeld setzen
    newNode->nextNode = NULL; // nextNode Pointer auf NULL setzen

    return newNode;
}