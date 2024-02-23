package ch02;

public class C14TextBlock {
    public static void main(String[] args) {
        /*
        <html>
            <head>



            </head>
        </html>
         */
        //textblock
        //"""로 묶음
        //newline, 따옴표등을 탈출문자 없이 사용가능
        //가장 왼쪽에 있는 문자 기준으로 들여쓰기 결정
        String html = """ 
                <html>
                           <head>
                              \s
                          \s
                          \s
                           </head>
                       </html>
                   """;
        System.out.println(html);
    }
}
