package org.zerock.demo2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.demo2.entity.Memo;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass(){//인터페이스 타입의 설제 객체가 어떤것인지 확인
        System.out.println(memoRepository.getClass().getName());
    }

    /*@Test
    public void testInsertDummies(){

        IntStream.rangeClosed(1,100).forEach(i -> {//일반 반복문
            Memo memo = Memo.builder().memoText("Sample..."+i).build();//Memo 클래스에 memo 받아 넣는다
            memoRepository.save(memo);//위에서 넣은 값을 어떻게 처리할지 정한다
        });
    }*/

    /*@Test
    public void testSelect(){//find by id
        //데이터 베이스에 존재하는 mno
        Long mno = 2314L;

        Optional<Memo> result = memoRepository.findById(mno);
        System.out.println("=====================================!");
        if (result.isPresent()){
            Memo memo = result.get();
            System.out.println(memo);
        }
    }*/

    @Transactional
    @Test
    public void testSelect2(){//get one
        //데이터베이스에 존재하는 mno
        Long mno = 2314L;

        Memo memo = memoRepository.getOne(mno);
        System.out.println("=============================@");
        System.out.println(memo);
    }

    /*@Test
    public void testUpdate(){
        Memo memo = Memo.builder().mno(100L).memoText("Update Text").build();
        System.out.println("=====================2");
        System.out.println(memoRepository.save(memo));
        System.out.println("=====================2");
    }*/
    /*
    @Test
    public void testDelete(){

        Long mno = 100L;
        System.out.println("=====================1");
        memoRepository.deleteById(mno);
        System.out.println("=====================1");
    }*/

}
