#include <iostream>
#include <cstring>
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

typedef Node* TRO;

void KhoiTao(TRO &L)
{
    L = NULL;
}

void Nhap1SV(SinhVien &X)
{
    cout << "Nhap ma SV: "; cin >> X.maSv;
    cin.ignore();
    cout << "Nhap ho dem: "; cin.getline(X.hoDem, 25);
    cout << "Nhap ten: "; cin.getline(X.ten, 9);
    cout << "Nhap gioi tinh: "; cin.getline(X.gioiTinh, 5);
    cout << "Nhap nam sinh: "; cin >> X.namSinh;
    cout << "Nhap diem TK: "; cin >> X.diemTk;
    cin.ignore(); // để chuẩn bị cho getline lần sau
}

void NhapDS(TRO &L)
{
    KhoiTao(L);
    SinhVien X;
    TRO Q = NULL, P;
    int i = 1;

    while (true)
    {
        cout << "\nNhap sinh vien thu " << i << " (Nhap ten *** de ket thuc):" << endl;
        Nhap1SV(X);
        if (strcmp(X.ten, "***") == 0)
            break;

        P = new Node;
        P->infor = X;
        P->next = NULL;

        if (L == NULL)
        {
            L = P;
        }
        else
        {
            Q->next = P;
        }
        Q = P;
        i++;
    }
}

void HienThiDS(TRO L)
{
    int i = 1;
    cout << "\nDANH SACH SINH VIEN:\n";
    while (L != NULL)
    {
        cout << "\nSinh vien thu " << i++ << ":\n";
        cout << "Ma SV: " << L->infor.maSv << endl;
        cout << "Ho dem: " << L->infor.hoDem << endl;
        cout << "Ten: " << L->infor.ten << endl;
        cout << "Gioi tinh: " << L->infor.gioiTinh << endl;
        cout << "Nam sinh: " << L->infor.namSinh << endl;
        cout << "Diem TK: " << L->infor.diemTk << endl;
        L = L->next;
    }
}

void xoaPtDauTien(TRO &L)
{
    if (L == NULL)
    {
        cout << "Danh sach rong!" << endl;
        return;
    }
    TRO Q = L;
    L = L->next;
    delete Q;
    cout << "Da xoa sinh vien dau tien." << endl;
}

void chenViTriThu3(TRO &L)
{
    int d = 1;
    TRO M = NULL, Q = L;

    while (Q != NULL && d < 3)
    {
        M = Q;
        Q = Q->next;
        d++;
    }

    if (M == NULL || M->next == NULL)
    {
        cout << "Vi tri khong thich hop!" << endl;
        return;
    }

    TRO P = new Node;
    P->infor.maSv = 1006;
    strcpy(P->infor.hoDem, "Le Thi");
    strcpy(P->infor.ten, "Doan");
    strcpy(P->infor.gioiTinh, "Nu");
    P->infor.namSinh = 2002;
    P->infor.diemTk = 7.6;

    P->next = M->next;
    M->next = P;

    cout << "Da chen sinh vien tai vi tri thu 3." << endl;
}

void sapXep(TRO &L)
{
    SinhVien tg;
    TRO M, Q, R = L;

    while (R != NULL && R->next != NULL)
    {
        M = R;
        Q = R->next;

        while (Q != NULL)
        {
            if (strcmp(Q->infor.ten, M->infor.ten) < 0)
            {
                M = Q;
            }
            Q = Q->next;
        }

        if (M != R)
        {
            tg = R->infor;
            R->infor = M->infor;
            M->infor = tg;
        }

        R = R->next;
    }

    cout << "Da sap xep danh sach theo ten." << endl;
}

int main()
{
    TRO L;
    NhapDS(L);
    HienThiDS(L);

    cout << "\n--- XOA SINH VIEN DAU TIEN ---" << endl;
    xoaPtDauTien(L);
    HienThiDS(L);

    cout << "\n--- CHEN SINH VIEN O VI TRI THU 3 ---" << endl;
    chenViTriThu3(L);
    HienThiDS(L);

    cout << "\n--- SAP XEP THEO TEN ---" << endl;
    sapXep(L);
    HienThiDS(L);

    return 0;
}
