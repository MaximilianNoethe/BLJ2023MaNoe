#ifndef LINKEDLIST_H
#define LINKEDLIST_H

typedef struct Node
{
    int data;
    struct Node *nextNode;

} TNode;

TNode *initNode(int data);
TNode *outputNode();
void printList(TNode *head);

#endif