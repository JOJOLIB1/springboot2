package com.jjj.boot;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * @className: com.jjj.boot.JunitTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-08 8:43
 */
@SpringBootTest
public class JunitTest {
    @RepeatedTest(10)
    @DisplayName("循环测试10次")
    public void test01() {
        System.out.println(1);
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("每一次单元测试之前都执行");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("每一次单元测试之后都执行");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("所有的单元测试前执行");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("所有的单元测试后执行");
    }

    @Test
    @Disabled
    @DisplayName("跳过不测试的")
    public void disabled() {

    }

    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    @Test
    @DisplayName("超时测试")
    @Disabled
    public void timeout() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    @DisplayName("assertEqual的演示")
    public void assert1() {
        assertEquals(1, 2, "期待值与预期值不一样");
    }
    @Test
    @DisplayName("assertSame")
    public void assert2() {
        assertSame(new Object(), new Object(), "期待值与预期值不是同一个对象");
    }

    @Test
    @DisplayName("assertTrue")
    public void assert3() {
        assertTrue(1 == 2, "表达式不为true");
    }
    @Test
    @DisplayName("assertArrayEquals")
    public void assert4() {
        assertArrayEquals(new int[] {1, 2}, new int[] {1, 2}, "预期数组与实际数组不一样");
    }

    @Test
    @DisplayName("assertAll")
    public void assert5() {
        assertAll("组合测试", () -> assertEquals(1, 2),
                () -> assertEquals(2 , 2));
    }

    @Test
    @DisplayName("assertThrows")
    public void assert6() {
        assertThrows(ArithmeticException.class, () -> System.out.println(1/0));
    }

    @Test
    @DisplayName("快速失败")
    public void fastFail() {
        fail();
    }

    @Test
    public void assumption1() {
        assumeTrue(1 == 2);
    }

    @Nested
    class InnerClass {
        @BeforeEach
        public void beforeEach() {
            System.out.println("内部的对外部的没用");
        }

        @Test
        public void test01() {
            System.out.println("普通测试");
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    @DisplayName("参数测试-普通")
    public void para(int i) {
        System.out.println(i);
    }

    @MethodSource("method")
    @ParameterizedTest
    public void para02(boolean b) {
        System.out.println(b);
    }

    public static Stream<Boolean> method() {
        return Stream.of(true);
    }



}
