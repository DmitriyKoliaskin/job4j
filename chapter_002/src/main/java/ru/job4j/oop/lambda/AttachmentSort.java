package ru.job4j.oop.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("1", 100),
                new Attachment("2", 34),
                new Attachment("3", 13)
        );

        Comparator<Attachment> comparatorBySize = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                Attachment left = o1;
                Attachment right = o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparatorBySize);
        System.out.println("comparatorBySize: " + attachments);

        Comparator<Attachment> comparatorByName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        attachments.sort(comparatorByName);
        System.out.println("comparatorByName: " + attachments);
    }
}