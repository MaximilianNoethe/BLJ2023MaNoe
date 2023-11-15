

void initNode(int data)
{

    TNode *newNode = (TNode *)malloc(sizeof(TNode));

    newNode->data = data;     // Datenfeld setzen
    newNode->nextNode = NULL; // nextNode Pointer auf NULL setzen
}