package com.oop15;

public class Todo {
    private String content;

    // 참고 - boolean 필드명에 관례상 is안붙임.
    private boolean completed;

    public Todo(String content) {
        this.content = content;
    }

    // getter  getter만들때 boolean 메서드명은 관례상 is붙임.
    public String getContent() {return content;}
    public boolean isCompleted() {return completed;}

     // setter - 단순히 상태값만 변경하는 메서드를 set으로 만듦.
    // setter에서는 is안씀.
    public void setCompleted(boolean completed) {this.completed = completed;}

    public void showInfo() {
        String status;
        if(completed) {
            status = "[완료]";
        } else {
            status = "[미완료]";
        }
        System.out.println("할 일 내용 : " + content + " , " + status);
    }
}
