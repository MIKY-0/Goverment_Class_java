package http.ch02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonMaker {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 21;
        List<String > subject = new ArrayList<>();
        subject.add("수학");
        subject.add("물리");
        subject.add("컴퓨터과학");

        // 위 데이터를 메서드를 호출해서 json형식의 문자열로 변환하는 기능을 호출할 예정.
        System.out.println(toJson(name , age , subject));

    }

    // 학생 정보를 json 문자열로 조립하는 기능.(메서드)
    public static String toJson(String name , int age , List<String> subject) {
        StringBuilder sb = new StringBuilder();
        Iterator <String> it =  subject.iterator();

        sb.append("{\n");
        sb.append("\"name\" : \"").append(name).append("\",\n");
        sb.append("\"age\" : ").append(age).append(",");
        sb.append("\"subjects\" : [\n");

        // Iterator객체로 연결.
        for(int i = 0; i < 3; i++) {
            if(i == 2) {
                sb.append("\"" + it.next() + "\"\n]");
                break;
            }
            sb.append("\"" + it.next() +"\",\n");
        }
//        sb.append("\"" + subject.get(0) + "\",\n");
//        sb.append("\"" + subject.get(1) + "\",\n");
//        sb.append("\"" + subject.get(2) + "\"\n]\n");
        sb.append("}\n");

        return sb.toString();
    }


}
