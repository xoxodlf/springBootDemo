package com.example.demoPj;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demoPj.domain.Posts;
import com.example.demoPj.domain.PostsRepository;
import com.example.demoPj.domain.UsersRepository;
import com.example.demoPj.domain.Users;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
    PostsRepository postsRepository;
	
	@Autowired
	UsersRepository usersRepository;

    @After
    public void cleanup() {
        /** 
        이후 테스트 코드에 영향을 끼치지 않기 위해 
        테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
        **/
        postsRepository.deleteAll();
        usersRepository.deleteAll();
    }

//    @Test
//    public void 게시글저장_불러오기() {
//        //given
//        postsRepository.save(Posts.builder()
//                .title("테스트 게시글")
//                .content("테스트 본문")
//                .author("jojoldu@gmail.com")
//                .build());
//
//        //when
//        List<Posts> postsList = postsRepository.findAll();
//
//        //then
//        Posts posts = postsList.get(0);
//        assertThat(posts.getTitle(), is("테스트 게시글"));
//        assertThat(posts.getContent(), is("테스트 본문"));
//    }
    
    @Test
    public void 유저생성() {
    	usersRepository.save(Users.builder()
    			.uAddr("123")
    			.uDob("123")
    			.uEmail("xoxodlf@naver.com")
    			.uuid("xoxodlf")
    			.uName("Yang")
    			.uPW("123123")
    			.build());
    	
    	List<Users> li = usersRepository.findAll();
    	
    	System.out.println(li.get(0).getUaddr());
    }
	

}
