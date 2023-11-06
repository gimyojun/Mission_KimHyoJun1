package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    ArrayList<Quote> quotesList = new ArrayList<>();
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("== 명언 앱 ==");
            System.out.println("명령)");
            String order = sc.next();

            if(order.equals("종료")){
                break;
            }else if(order.equals("등록")){
                String quote;
                String writer;
                System.out.println("명언 : ");
                quote = sc.next();
                System.out.println("작가 : ");
                writer = sc.next();
                Quote quoteTmp = new Quote(quote,writer);
                quotesList.add(quoteTmp);
            }else if(order.equals("목록")){
                System.out.println("번호 / 작가 /명언");
                for(int i=0;i<quotesList.size();i++){
                    System.out.println(i + 1+ " / " + quotesList.get(i).writer + " / " + quotesList.get(i).quote);
                }
            }


        }




    }
}
