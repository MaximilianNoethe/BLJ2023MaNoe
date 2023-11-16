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
void addNode(TNode *head, int value);
void deleteNode(TNode *head, int index);
void implementNode(TNode *head, int index, int value);
void contentNode(TNode *head, int index);
#endif