package edu.streamtask;

import java.util.List;
import java.util.stream.Stream;

public class Stream_Task0215 {

	public static void main(String[] args) {
		List<String> names = List.of("홍길동","배장화","임꺽정","연흥부","김선달","황진이");
		
		Stream<String> st = names.stream();
		//st.filter(name -> name.startsWith("이")).forEach( s -> System.out.println(s + " ") ); //1-2
		
		st.sorted().forEach(n -> System.out.println(n)); //1-3
		
	}

}
