#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"

int main(void)
{
    // TNode *header = outputNode();
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
    1
    printList(head);

    return 0;
}

TNode *initNode(int value)
{

    TNode *newNode = malloc(sizeof(TNode));

    newNode->data = value;    // Datenfeld setzen
    newNode->nextNode = NULL; // nextNode Pointer auf NULL setzen

    return newNode;
}

TNode *outputNode()
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

    printf("Data from the head node: %d\n\n", head->data);
    printf("Data from the first node: %d\n\n", myNode1->data);
    printf("Data from the second node: %d\n\n", myNode2->data);
    printf("Data from the third node: %d\n\n", myNode3->data);
    printf("Data from the fourth node: %d\n\n", myNode4->data);
    printf("Data from the fifth node: %d\n\n", myNode5->data);

    return head;
}

void printList(TNode *head)
{
    TNode *current_node = head;

    while (current_node != NULL)
    {
        printf("Data: %d\n", current_node->data);
        printf("Next node: %d\n", current_node->nextNode);
        current_node = current_node->nextNode;
    }
}