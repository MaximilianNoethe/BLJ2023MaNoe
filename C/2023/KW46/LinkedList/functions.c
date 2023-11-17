#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"

// Task 6
TNode *initNode(int value)
{

    TNode *newNode = malloc(sizeof(TNode)); // heap speicher

    newNode->data = value;    // Datenfeld setzen
    newNode->nextNode = NULL; // nextNode Pointer auf NULL setzen

    return newNode;
}

// Task 5 / 7
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

// Task 8
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

// Task 9
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

// Task 10
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

// Task 11
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
        printf("\nThe content of Index %d is: %d\n", index, currentNode->data);
    }
}

// Task 12
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
    printf("\nData at index %d set to %d\n", index, newData);
}

// Task 13
void setAllNodeData(TNode *head, int newData)
{
    TNode *current = head;

    while (current != NULL)
    {
        current->data = newData;
        current = current->nextNode;
    }

    printf("\nData set to %d for all nodes\n", newData);
}

// Task 14
int getLinkedListLength(TNode *head)
{
    int length = 0;
    TNode *current = head;

    while (current != NULL)
    {
        length++;
        current = current->nextNode;
    }

    return length;
}

// Task 15 
void deleteLinkedList(TNode **head) 
{
    TNode *current = *head;
    TNode *nextNode;

    while (current != NULL)
    {
        nextNode = current->nextNode;
        free(current);
        current = nextNode;
    }

    *head = NULL; 
}