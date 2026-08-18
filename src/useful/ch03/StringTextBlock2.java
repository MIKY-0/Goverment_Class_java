package useful.ch03;

public class StringTextBlock2 {
    public static void changeText(String str) {
        String result1 = str.replace("게시판" , "바나나");
        System.out.println(result1);
    }


    public static void main(String[] args) {
     String textBlock = """
              <div className="boardWrap">
                   <header className="boardHeader">
                     <div className="headerTop">
                       <h1 className="boardTitle">게시판</h1>
                       <div className="authButtons">
                         {isLogin ? (
                           <>
                           <span className="welcomeText">{loginNickname}님 환영합니다!</span>
                           <button className="logoutBtn" type="button" onClick={handleLogout}>로그아웃</button>
                           </>
                         )
                       :
             """;
    // "게시판" 글자 다른단어로 변경.
    changeText(textBlock);
    }
}
