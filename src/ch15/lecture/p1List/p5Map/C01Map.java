package ch15.lecture.p1List.p5Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Map {
    public static void main(String[] args) {
        // map : entry (key,value) 를 저장
        // 같은 key를 가진 두 개의 entry를 저장할 수 없음

        Map<String, String> map = new HashMap<>();

        // entry 추가
        map.put("java", "programming language");
        map.put("css", "style sheet");
        map.put("html", "hypertext markup language");
        map.put("spring", "java framework");
        map.put("react", "frontend library");
        map.put("css", "style sheet");

        // map 크기
        System.out.println(map.size()); // 5

        // entry 검색
        boolean b1 = map.containsKey("java"); // true
        boolean b2 = map.containsKey("css");// true
        boolean b3 = map.containsKey("jsp");//false
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // entry 의 value 얻기
        String value1 = map.get("java");
        String value2 = map.get("react");
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);

        String value3 = map.get("jsp");
        System.out.println("value3 = " + value3);

        // entry 수정
        map.put("java", "프로그래밍 언어");
        String value4 = map.get("java");
        System.out.println("value4 = " + value4);

        if (map.containsKey("css")) {
            map.put("css", "스타일 시트");
        }

        if (map.containsKey("jsp")) {
            map.put("jsp", "java server page");
        }

        System.out.println("map.get(\"css\") = " + map.get("css"));
        System.out.println("map.get(\"jsp\") = " + map.get("jsp"));

        // entry 지우기
        System.out.println("map.size() = " + map.size());
        String value6 = map.remove("css");
        System.out.println("map.size() = " + map.size());
        String value7 = map.remove("jsp");
        System.out.println("map.size() = " + map.size());
        System.out.println("value6 = " + value6);
        System.out.println("value7 = " + value7);


        // 전체탐색
        //1.keySet
        Set<String> keys = map.keySet();
        //forEach
        //iterator
        //enhanced for

        //2.entrySet
        System.out.println("### entrySet && 향상된 for 활용");
        Set<Map.Entry<String, String>> entries = map.entrySet();



    }
}