package ru.job4j.oop.lambda;

import java.util.Comparator;
import java.util.List;



public class AttachmentSort {

    public List<Attachment> sortBySize(List<Attachment> attachments) {
        attachments.sort(Comparator.comparingInt(Attachment::getSize));
        return attachments;
    }

    public List<Attachment> sortByName(List<Attachment> attachments) {
        attachments.sort(Comparator.comparing(Attachment::getName));
        return attachments;
    }
}
