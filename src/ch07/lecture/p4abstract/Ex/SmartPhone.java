package ch07.lecture.p4abstract.Ex;

import ch07.Ex.SmartPhoneEx;

public class SmartPhone extends Phone{
     SmartPhone(String owner){
         super(owner);
     }

     void internetSearch() {
         System.out.println("인터넷 검색을 합니다.");
     }
}
