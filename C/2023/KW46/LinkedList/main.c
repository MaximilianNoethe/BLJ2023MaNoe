#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"
#include "functions.c"

int main(void)
{

    printf("\n***Linked List***\n\n");

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

    // Task 5
    printList(head);

    printf("\n\n-----------------------------------------------------------------\n\n");

    // Task 8
    printf("\nCalled addNode()\n\n");
    addNode(head, 24);

    printList(head);

    printf("\n\n-----------------------------------------------------------------\n\n");
    
    // Task 9
    printf("\nList after deleting:\n\n");

    deleteNode(head, 5);

    printList(head);

    printf("\n\n-----------------------------------------------------------------\n\n");
    
    // Task 10
    printf("\nList after adding:\n\n");
    implementNode(head, 3, 99);

    printList(head);

    printf("\n\n-----------------------------------------------------------------\n\n");
    
    // Task 11
    printf("\nContent of one Node:\n");
    contentNode(head, 3);

    printf("\n\n-----------------------------------------------------------------\n\n");

    // task 12
    int indexToSet = 2;
    int newData = 42;
    setNodeDataAtIndex(head, indexToSet, newData);

    printf("\n\nLinked List after setting data at index %d:\n\n", indexToSet);
    printList(head);

    printf("\n\n-----------------------------------------------------------------\n\n");

    // Task 13
    int newDataForAllNodes = 25;
    setAllNodeData(head, newDataForAllNodes);

    printf("\n\nLinked List after setting data for all nodes:\n\n");
    printList(head);

    printf("\n\n-----------------------------------------------------------------\n\n");

    // Task 14
    int length = getLinkedListLength(head);
    printf("\nLength of the linked list: %d\n", length);

    printf("\n\n-----------------------------------------------------------------\n\n");

    // Task 15
    deleteLinkedList(&head);

    printf("\nLinked List after deletion:\n\n");
    printList(head);

    return 0;
}
