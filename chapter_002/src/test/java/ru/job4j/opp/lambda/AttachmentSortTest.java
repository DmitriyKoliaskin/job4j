package ru.job4j.opp.lambda;

import org.junit.Test;

import ru.job4j.oop.lambda.Attachment;
import ru.job4j.oop.lambda.AttachmentSort;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;



public class AttachmentSortTest {

    List<Attachment> attachments = Arrays.asList(
            new Attachment("1", 100),
            new Attachment("2", 34),
            new Attachment("3", 13));

    @Test
        public void attachmentSortByName() {
        List<Attachment> rst = new AttachmentSort().sortByName(attachments);
        List<Attachment> result = Arrays.asList(
                new Attachment("1", 100),
                new Attachment("2", 34),
                new Attachment("3", 13));
        assertEquals(result, rst);
    }

    @Test
    public void attachmentSortBySize() {
        List<Attachment> rst = new AttachmentSort().sortBySize(attachments);
        List<Attachment> result = Arrays.asList(
                new Attachment("3", 13),
                new Attachment("2", 34),
                new Attachment("1", 100));
        assertEquals(result, rst);
    }
}
