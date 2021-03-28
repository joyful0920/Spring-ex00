package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

// 일반적으로 스프링에서 의존성 주입은 Chef 클래스가 아닌 인터페이스로 설계하는 것이 좋지만,
// 지금은 최소한의 코드만을 이용해서 의존성 주입을 테스트해보기 위해 클래스로 설계

@Component // 스프링이 가지고 있으면서 관리하는 객체로 지정하는 어노테이션. 오랫동안 사용할 객체에 등록해주자.
@Data // Lombok의 setter를 생성하는 기능과 생성자, toString() 등을 자동으로 생성하도록 @Data 어노테이션 이용
public class Chef {

}