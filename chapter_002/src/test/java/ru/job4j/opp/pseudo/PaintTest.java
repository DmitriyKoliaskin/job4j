package ru.job4j.opp.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.oop.stragery.Paint;
import ru.job4j.oop.stragery.Square;
import ru.job4j.oop.stragery.Triangle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
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
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
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
