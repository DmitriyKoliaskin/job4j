package ru.job4j.opp.pseudo;

import ru.job4j.oop.stragery.Paint;
import ru.job4j.oop.stragery.Square;
import ru.job4j.oop.stragery.Triangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println(this.stdout);
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("Execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(new StringBuilder()
                    .append("+ + + +")
                    .append("+     +")
                    .append("+     +")
                    .append("+ + + +")
                    .append(System.lineSeparator())
                    .toString()
                )
        );
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                            .append("  *  ")
                            .append(" * * ")
                            .append("*****")
                            .append(System.lineSeparator())
                            .toString()
                )
        );
        System.setOut(stdout);
    }
}
