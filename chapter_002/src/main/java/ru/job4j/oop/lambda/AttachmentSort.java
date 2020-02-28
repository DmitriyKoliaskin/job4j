package ru.job4j.oop.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class AttachmentSort {

        Comparator<Attachment> comparatorBySize = Comparator.comparingInt(Attachment::getSize);
    public List<Attachment> sortBySize(List<Attachment> attachments) {
        attachments.sort(comparatorBySize);
        return attachments;
    }

    public List<Attachment> sortByName(List<Attachment> attachments) {
        Comparator<Attachment> comparatorByName = Comparator.comparing(Attachment::getName);
        attachments.sort(comparatorByName);
        return attachments;
    }
}
