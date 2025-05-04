package es.codeurjc.test.web;

import com.intuit.karate.junit5.Karate;

class MessageRunnerTest {

    @Karate.Test
    Karate testMessage() {
        return Karate.run("classpath:es/codeurjc/test/web/message.feature","classpath:es/codeurjc/test/web/notitle.feature","classpath:es/codeurjc/test/web/wikipedia.feature");
    }

}
