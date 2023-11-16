#include <stdio.h>
#include <stdlib.h>
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

    printList(head);

    printf("\n\nCalled addNode()\n\n");
    addNode(head, 24);

    printList(head);

    printf("\n\nList after deleating:\n\n");

    deleteNode(head, 3);

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
        printf("Next node: %p\n", current_node->nextNode);
        current_node = current_node->nextNode;
    }
}

void addNode(TNode *head, int value)
{
    TNode *lastNode = head;

    while (lastNode->nextNode != NULL)
    {
        lastNode = lastNode->nextNode;
    }

    lastNode->nextNode;

    lastNode->nextNode = initNode(value);
}

void deleteNode(TNode *head, int index)
{

    if (index == 0)
    {
        TNode *temp = head;
        head = head->nextNode;
        free(temp);
        return;
    }

    TNode *prevNode = head;
    for (int i = 0; i < index - 1 && prevNode != NULL; i++)
    {
        prevNode = prevNode->nextNode;
    }

    if (prevNode == NULL || prevNode->nextNode == NULL)
    {
        printf("Invalid Index for deleting.\n");
        return;
    }

    TNode *deleteNode = prevNode->nextNode;
    prevNode->nextNode = deleteNode->nextNode;

    free(deleteNode);
}
