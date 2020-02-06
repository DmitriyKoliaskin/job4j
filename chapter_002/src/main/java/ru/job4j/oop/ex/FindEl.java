package ru.job4j.oop.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw  new ElementNotFoundException("Element is not found.");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String el : abuses) {
            if (el.equals(value)) {
                throw new ElementAbuseException(value + " is in the list abuses");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] value = {"Dima", "Ivan", "Kapacb"};
        try {
            indexOf(value ,"Pasha");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}