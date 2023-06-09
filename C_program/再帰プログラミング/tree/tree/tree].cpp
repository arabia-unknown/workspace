#include<stdio.h>
#include<math.h>
#include <windows.h>
#define ANGLE 3.1416/6
#define B 0.8
double pi = atan(1.0) * 4.0;

void plot_line(HDC,double,double);

void tree(int order,double length,double angle,HDC hdc){
	if(order==0)return;
	else{
		plot_line(hdc,length,angle);
		tree(order-1,length*B,angle+ANGLE/2,hdc);
		tree(order-1,length*B,angle-ANGLE/2,hdc);
		plot_line(hdc,length,angle+pi);
	}
}

void plot_line(HDC hdc, double length, double angle)
{
	struct	tagPOINT pos;
	int		gx, gy;

	GetCurrentPositionEx(hdc, &pos);
	gx = pos.x + (int)(length * cos(angle));
	gy = pos.y - (int)(length * sin(angle));
	LineTo(hdc, gx, gy);
}
LRESULT CALLBACK WndProc(HWND hWnd, UINT iMessage,
						 WPARAM wParam, LPARAM IParam)
{
	HDC		hdc;		// デバイスコンテキストのハンドラ
	PAINTSTRUCT ps;		// BeginPaint 関数の引数で使用する
	HPEN	hpen_old;	// ペン・ハンドルの保存用
	HPEN	pen1;		// 論理ペン・ハンドル

	pen1 = CreatePen(PS_SOLID, 1, RGB(0, 0, 0));
					    // 論理ペンの作成(形状・太さ・色)
	switch (iMessage) {
	  case WM_PAINT:
		hdc = BeginPaint(hWnd, &ps);	// BeginPaint の開始
		hpen_old = (struct HPEN__ *)SelectObject(hdc, pen1);
					    // HPEN の後は_が２つ; pen1 の選択
		MoveToEx(hdc,275, 350, NULL);

		tree(8,80,pi/2,hdc);


		SelectObject(hdc, hpen_old);	// ペンの解放
		EndPaint(hWnd, &ps);			// BeginPaint の終了
		DeleteObject(pen1);				// 論理ペンの削除
		break;

	  case WM_DESTROY:
		PostQuitMessage(0);
		break;

	  default:
		return DefWindowProc(hWnd, iMessage, wParam, IParam);
	}
	return 0;
}

LRESULT CALLBACK WndProc( HWND, UINT, WPARAM, LPARAM );

int WINAPI WinMain( HINSTANCE hInstance,HINSTANCE hPrevInstance,
                    LPSTR lpszCmdLine,int nCmdShow)   
{
  MSG        msg;
  HWND       hWnd;
  WNDCLASSEX wc;  // 新しく作るウィンドウ・クラス
  
  wc.style        =0; 
  wc.lpfnWndProc  =WndProc; // ウィンドウ・プロシージャ
  wc.cbClsExtra   =0; 
  wc.cbWndExtra   =0; 
  wc.cbSize       =sizeof(WNDCLASSEX);
  wc.hInstance    =hInstance; 
  wc.hIcon        =LoadIcon(NULL, IDI_APPLICATION );
  wc.hIconSm      =LoadIcon(NULL, IDI_WINLOGO );
  wc.hCursor      =LoadCursor(NULL,IDC_ARROW); 
  wc.hbrBackground=(struct HBRUSH__ *)GetStockObject(WHITE_BRUSH);
           // HBRUSHの後は_が２つ；　クラス・ウィンドウ背景ブラシ 
  wc.lpszMenuName =NULL;    // クラス・メニュー・リソース名
  wc.lpszClassName="ice";   // ウィンドウ・クラス名
  
  if(!RegisterClassEx(&wc))return 0; 
                            // ウィンドウ・クラス登録失敗/
  hWnd=CreateWindow(        // ウィンドウ生成 
    wc.lpszClassName,       // ウィンドウ・クラス名
    "Windows example",      // ウィンドウ名 
    WS_OVERLAPPEDWINDOW,    // ウィンドウ・スタイル 
    CW_USEDEFAULT,          // ウィンドウ表示X位置（既定:0）
    CW_USEDEFAULT,          // ウィンドウ表示Y位置（既定:0）
    640,                    // ウィンドウXサイズ[dot]
    400,                    // ウィンドウYサイズ[dot]
    NULL,                   // 親ウィンドウ・ハンドル
    NULL,                   // メニューハンドル  
    wc.hInstance,  
    NULL);          

  ShowWindow(hWnd,SW_SHOWDEFAULT); // ウィンドウ表示状態設定
  UpdateWindow(hWnd); 

  while(GetMessage(&msg,NULL,0,0)) // メッセージ取得（すべて）
  {
    TranslateMessage( &msg ); 
    DispatchMessage(&msg); 
	             // ウィンドウ・プロシージャにメッセージを送出 
  }
  return 0;
}

