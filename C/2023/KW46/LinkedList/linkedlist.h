#ifndef LINKEDLIST_H
#define LINKEDLIST_H

// Task 1
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
void setNodeDataAtIndex(TNode *head, int index, int newData);
void setAllNodeData(TNode *head, int newData);
int getLinkedListLength(TNode *head);
void deleteLinkedList(TNode **head);
#endif