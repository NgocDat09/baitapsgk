#include <iostream>
#include<bits/stdc++.h>
using namespace std;
struct SinhVien
{
    int maSv;
    char hoDem[25];
    char ten[9];
    char gioiTinh[5];
    int namSinh;
    double diemTk;
};
struct Node
{
    SinhVien infor;
    Node *next;
};
typedef Node *TRO;

void NhapDS(TRO &L)
{
    KhoiTao(L);
    SINHVIEN X;
    TRO Q, P;
    int i=1;
    do
    {
        cout<<"Nhap sinh vien thu "<<i<<endl;
        NhapDS(X);
        if(strcmp(X.ten, "***")==0)
        {
            return;
        }
        P = new (Node);
        P->infor = X;
        P->next = NULL;
        if(L == NULL )
        {
            L=P;

        }
        else
        {
            Q-> next = P;
        }
        Q=P;
        i++;
    }
    while(1);


}
void xoaPtDauTien(TRO &L)
{
    if(L == NULL)
    {
        cout<<"Danh sach rong";
        return;
    }
    TRO Q = L;
    L = L ->next;
    delete Q;
}
void chenViTriThu3(TRO &L)
{
    int d = 1;
    TRO M, Q =L;
    while (Q != NULL && d < 3)
    {
        M = Q;
        Q= Q->next;
        d++;

    }
    if(Q==NULL)
    {
        cout<<"vi tri ko thich hop";
        return;
    }
    TRO P = new Node;
    P->infor.maSv = 1006;
    strcpy(P->infor.hoDem, "Le Thi");
    strcpy(P->infor.ten, "Doan");
    strcpy(P->infor.gioiTinh, "Nu");
    P->infor.diemTk=7.6;
    P->next = M -> next;
    M->next = P;

}
void sapXep(TRO &L)
{
    SinhVien tg;
    TRO M, Q, R;
    R = L;
    while (R->next != NULL)
    {
        M = R;
        Q= R->next;
        while (Q != NULL)
        {
            if(strcmp(Q->infor.ten, M->infor.ten)<0)
            {
                M=Q;
            }
            Q=Q->next;

        }
        tg=R->infor;
        R->infor = M ->infor;
        M->infor =tg;
        R = R ->next;
    }
}

int main()
{
     KhoiTao(L);
    SINHVIEN X;
    TRO Q, P;
    NhapDS(L);

    return 0;
}
