#include <iostream>
#include <bits/stdc++.h>
#include <istream>
#define MAX 100
using namespace std;
struct HangHoa
{
    char maHang[10];
    char tenHang[15];
    char dvTinh[10];
    int donGia;
    int soLuong;
    int thanhTien;

};
struct List
{
    int count;
    HangHoa a[MAX];
};
void create(List &L)
{
    L.count = -1;
}
int Full(List L)
{
    return L.count == MAX-1;
}
int Empty(List L)
{
    return L.count == -1;
}
int add(List &L, HangHoa x)
{
    if(Full(L)) return 0;
    else
    {
        L.count++;
        L.a[L.count]= x;
        return 1;
    }
}
void nhap(HangHoa &x)
{
    cout<<"nhap ma hang: "<<endl;
    cin.getline(x.maHang, 10);
    cout<<"nhap ten hang: "<<endl;
    cin.getline(x.tenHang,15);
    cout<<"nhap dv tinh: "<<endl;
    cin.getline(x.dvTinh, 10);
    cout<<"nhap don gia: "<<endl;
    cin>>x.donGia;
    cout<<"nhap so luong: "<<endl;
    cin>>x.soLuong;
    cin.ignore();
    x.thanhTien = x.donGia * x.soLuong;
}
void nhapds(List &L)
{
    create(L);
    HangHoa x;

    int i=0;

    do
    {
        cout<<"nhap hang hoa thu "<<i+1<<endl;
        cout<<"nhap ma hang: "<<endl;
        cin.getline(L.a[i].maHang, 10);
        if(strcmp(L.a[i].maHang,"e")==0)
            break;

        cout<<"nhap ten hang: "<<endl;
        cin.getline(L.a[i].tenHang,15);
        cout<<"nhap dv tinh: "<<endl;
        cin.getline(L.a[i].dvTinh, 10);
        cout<<"nhap don gia: "<<endl;
        cin>>L.a[i].donGia;
        cout<<"nhap so luong: "<<endl;
        cin>>L.a[i].soLuong;
        cin.ignore();
        L.a[i].thanhTien = L.a[i].donGia * L.a[i].soLuong;
        i++;
    }
    while(1);
}
void xuat(List &L)
{

    cout<<setw(10)<<left<<"STT";
    cout<<setw(15)<<left<<"Ma Hang";
    cout<<setw(10)<<left<<"Ten Hang";
    cout<<setw(10)<<left<<"Don Gia";
    cout<<setw(10)<<left<<"So Luong";
    cout<<setw(10)<<left<<"Thanh Tien"<<endl;
    for (int i=0; i<=L.count; i++)
    {
        cout<<"dachay"<<endl;
        cout<<setw(10)<<left<<i+1;
        cout<<setw(15)<<left<<L.a[i].maHang;
        cout<<setw(10)<<left<<L.a[i].tenHang;
        cout<<setw(10)<<left<<L.a[i].donGia;
        cout<<setw(10)<<left<<L.a[i].soLuong;
        cout<<setw(10)<<left<<L.a[i].thanhTien<<endl;
    }
}
int timMax(List L)
{
    int slmax=0;
    for (int i=1; i<=L.count; i++)
    {
        if(L.a[slmax].soLuong < L.a[i].soLuong)
        {
            slmax=i;
        }
    }
    return slmax;

}
void thayThe(List &L)
{
    string name;
    bool check = false;
    cout<<"nhap ten tim kiem: "<<endl;
    getline(cin,name);
    for(int i=0; i<=L.count; i++)
    {
        if(L.a[i].tenHang == name)
        {
            check= true;
            nhap(L.a[i]);
            break;
        }

    }
    if(!check)
        cout<<"ko co ten can tim"<<endl;

}
int dem(List L)
{
    int dgmax=0;
    int dem =1;
    for(int i=1; i<=L.count; i++)
    {
        if(L.a[dgmax].donGia < L.a[i].donGia )
        {
            dgmax=i;
            dem=1;
        }
        else if(L.a[dgmax].donGia == L.a[i].donGia)
        {
            dem++;
        }

    }
    return dem;
}
void chen(List &L)
{
    int k;
    cout<<"nhap vi tri muon chen: "<<endl;
    cin>>k;
    HangHoa x;
    nhap(x);
    if(Full(L))
    {
        cout<<"mang day roi ko them dc"<<endl;
        return;
    }
    else
    {
        for(int i=L.count; i>=k-1; i--)
        {
            L.a[i+1]= L.a[i];
        }
        L.count++;
        L.a[k-1]=x;
    }


}
void xoa(List &L)
{
    cout<<"nhap vi tri muon xoa: "<<endl;
    int k;
    cin>>k;
    if(Empty(L))
    {
        cout<<"mang rong ko the xoa"<<endl;

        return ;
    }
    else
    {
        for(int i=k; i<=L.count; i++)
        {
            L.a[i-1]=L.a[i];
        }
        L.count--;
    }

}
int main()
{
    List L;
    nhapds(L);
    xuat(L);
    cout<<"hang hoa co so luong lon nhat la: "<<L.a[timMax(L)].tenHang;
    thayThe(L);
    xuat(L);
    cout<<"so hang hoa co cung don gia lon nhat la: "<<dem(L)<<endl;
    chen(L);
    xuat(L);
    xoa(L);
    xuat(L);
    return 0;
}
