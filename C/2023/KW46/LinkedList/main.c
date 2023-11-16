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

    // Task 7
    head->nextNode = myNode1;
    myNode1->nextNode = myNode2;
    myNode2->nextNode = myNode3;
    myNode3->nextNode = myNode4;
    myNode4->nextNode = myNode5;
    myNode5->nextNode = NULL;

    printList(head); // Task 5
    /*
        printf("\n\nCalled addNode()\n\n");
        addNode(head, 24); // Task 8

        printList(head);

        printf("\n\nList after deleting:\n\n");

        deleteNode(head, 5); /Task 9

        printList(head);*/

    printf("\n\nList after adding:\n\n");
    implementNode(head, 6, 99); // Task 10

    printList(head);

    printf("\n\nContent of one Node:\n\n");
    contentNode(head, 3); // Task 11

    // task 12
    int indexToSet = 2;
    int newData = 42;
    setNodeDataAtIndex(head, indexToSet, newData);

    printf("\nLinked List after setting data at index %d:\n", indexToSet);
    printList(head);

    // Task 13
    int newDataForAllNodes = 25;
    setAllNodeData(head, newDataForAllNodes);

    printf("\nLinked List after setting data for all nodes:\n");
    printList(head);

    return 0;
}

// Task 6
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
    for (int i = 0; i < index - 1 && prevNode->nextNode != NULL; i++)
    {
        prevNode = prevNode->nextNode;
    }

    TNode *deleteNode = prevNode->nextNode;
    prevNode->nextNode = deleteNode->nextNode;

    free(deleteNode);
}

void implementNode(TNode *head, int index, int value)
{

    if (index == 0)
    {
        TNode *newNode = initNode(value);
        newNode->nextNode = head->nextNode;
        head->nextNode = newNode;
        return;
    }

    TNode *prevNode = head;
    for (int i = 0; i < index - 1 && prevNode->nextNode != NULL; i++)
    {
        prevNode = prevNode->nextNode;
    }

    if (prevNode == NULL || prevNode->nextNode == NULL)
    {
        printf("Invalid Index for implementing.\n");
        return;
    }

    TNode *newNode = initNode(value);
    newNode->nextNode = prevNode->nextNode;
    prevNode->nextNode = newNode;
}

void contentNode(TNode *head, int index)
{

    TNode *currentNode = head;

    for (int i = 0; i < index - 1 && currentNode != NULL; i++)
    {
        currentNode = currentNode->nextNode;
    }

    if (currentNode == NULL)
    {
        printf("Invalid Index to show content.\n");
    }

    else
    {
        printf("The content of Index %d is: %d\n\n", index, currentNode->data);
    }
}

void setNodeDataAtIndex(TNode *head, int index, int newData)
{
    TNode *current = head;

    for (int i = 0; i < index - 1 && current != NULL; ++i)
    {
        current = current->nextNode;
    }

    if (current == NULL)
    {
        printf("Error: Index out of bounds\n");
        return;
    }

    current->data = newData;
    printf("Data at index %d set to %d\n", index, newData);
}

void setAllNodeData(TNode *head, int newData)
{
    TNode *current = head;

    while (current != NULL)
    {
        current->data = newData;
        current = current->nextNode;
    }

    printf("Data set to %d for all nodes\n", newData);
}