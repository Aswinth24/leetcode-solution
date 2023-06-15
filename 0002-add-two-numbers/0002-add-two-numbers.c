/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode*newnode(int x)
{
  struct ListNode*add=malloc(sizeof(struct ListNode));
  add->val=x;
  add->next=NULL;
  return add;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2)
  {
    int st=0;
    struct ListNode*s=newnode(0);
    struct ListNode*head=s;
    while(l1 && l2)
    {
      int v=l1->val+l2->val+st;
      st=v/10;
      s->next=newnode(v%10);
      s=s->next;
      l1=l1->next;
      l2=l2->next;
    }
  while(l1)
   {
     int val=0;
     int v=l1->val+val+st;
     st=v/10;
     s->next=newnode(v%10);
     s=s->next;
     l1=l1->next;
    
      
   }
   while(l2)
   {
      int val=0;
      int v=l2->val+val+st;
      st=v/10;
      s->next=newnode(v%10);
      s=s->next;
      l2=l2->next;
     }
   if(st>0&&l1==NULL&&l2==NULL)
     {
     s->next=newnode(st);
     }
   
  
 return head->next;
}