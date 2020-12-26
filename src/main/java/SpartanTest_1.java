import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class SpartanTest_1 {
//@BeforeAll // @BeforeClass annotation jUnit version 5 dan sonra @BeforeAll oldu. Butun methodlardan once calisir.
            // Bir dizi methoddan once kullanilir
//@AfterAll // @AfterClass annotation jUnit version 5 dan sonra @AfterAll oldu. Butun methodlardan sonra calisir.
            // Bir dizi methoddan sonra kullanilir
    @Test
    @Order(3)
    @DisplayName("Bolum_1") // Bu onemli interview icin
    @BeforeEach // @Before annotation jUnit version 5 dan sonra @BeforeEach oldu. Her method dan once calisir.
                // Login icin kullanabilir.
    public void spartan1(){
        System.out.println("Hi Spartan_1");
    assertThat(3,is(not(4))); // hamscrest
    assertThat("Aysel",is("Aysel"));
    assertThat("Aysel",is(equalTo("Aysel")));
    assertThat("Aysel",equalTo("Aysel"));

        List<Integer> list= Arrays.asList(34,23,767,45);
        assertThat(list, hasSize(4));
        assertThat(list, not(hasItems(34,23)));

    }
    @Test
    @Order(2)
    @DisplayName("Bolum_2")
    public void spartan2(){
        System.out.println("Hi Spartan_2");
    }
    @Test
    @Order(1)
    @DisplayName("Bolum_3")
    @AfterEach // @After annotation jUnit version 5 dan sonra @AfterEach oldu. Her method dan sonra calisir.
                // // Logout icin kullanabilir.
    public void spartan3(){
        System.out.println("Hi Spartan_3");
    }
}
