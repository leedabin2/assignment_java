package edu.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ProductClient extends Product{

	public static void main(String[] args) {
		System.out.println("[상품 목록]");
		System.out.println("----------------------------------------------");
		System.out.println("no      name                  price      stock");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println("메뉴: 1.Create | 2.Update | 3.Delete | 4.Exit");
				
        try {
          
            Socket clientSocket = null;
            PrintWriter pw = null;
            BufferedReader br = null;
            try{
                clientSocket = new Socket("127.0.0.1", 20000); //(ip주소,포트넘버)
                pw = new PrintWriter(clientSocket.getOutputStream(), true);
                br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                
                Scanner sc = new Scanner(System.in);
                int select;
                while (true) {
                	System.out.print("선택:");
                    select = sc.nextInt();
                    sc.nextLine();
                    if (select == 4) {
                        break;  //종료 
                    }
                    else if (select == 1) {
                    	System.out.println("[상품 생성]");
                		System.out.print("상품 이름: ");
                		setName(sc.nextLine());
                		System.out.print("상품 가격: ");
                		setPrice(sc.nextInt());
                		sc.nextLine();
                		System.out.print("상품 재고: ");
                		setStock(sc.nextInt());
                		sc.nextLine();
                		
                		pw.println(select);
 
                    }
                    
                    else if (select == 2) {
                    	System.out.print("[상품 수정]");
                		System.out.print("상품 번호: ");
                		setNo(sc.nextInt());
                		sc.nextLine();
                		System.out.print("이름 변경: ");
                		setName(sc.nextLine());
                		System.out.print("가격 변경: ");
                		setPrice(sc.nextInt());
                		sc.nextLine();
                		System.out.print("재고 변경: ");
                		setStock(sc.nextInt());
                		sc.nextLine();
                		
                		pw.println(select);
                    }
                    else if (select == 3) {
                    	System.out.print("[상품 삭제]");
                		System.out.print("상품 번호: ");
                		setNo(sc.nextInt());
             	
                		pw.println(select);
                    }
                    else {
                    	System.out.println("다시 입력하세요.");
                    }
                    
                 
                    pw.println(select);  //서버로 전송
                    
                    
                }
            } catch (IOException ex) {
                System.out.println("입출력 예외 발생");
            } finally {  // 자원 해제
                clientSocket.close();
                pw.close();
                br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
	}

}
