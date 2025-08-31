package Mini_Project;

import java.util.ArrayList;
import java.util.List;

public class UserRepostiory {
    private static List<User> users = new ArrayList<>();

    static { //저장소
        users.add(new User("홍길동",20,"041030"));
        users.add(new User("김땡땡",22,"040815"));
    }

    //회원 정보 추가
    public static void useradd(User user){
        users.add(user);
    }

    //회원 정보 삭제
    public static void userdel(User user){
        users.remove(user);
    }




}
