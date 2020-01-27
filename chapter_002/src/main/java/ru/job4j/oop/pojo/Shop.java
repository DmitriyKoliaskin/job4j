package ru.job4j.oop.pojo;

public class Shop {
    public Product[] delete(Product[] products, int index) {
    products[index] = null;
    for (; index < products.length - 1; index++) {
     products[index] = products[index + 1];
    }
    return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //Проверяем, что объект не равен null. т.к. у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение ячейки с индексом 1");
        //Удаляем значение ячейки с индексом 1
        products[1] = null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //Проверяем, что объект не равен null. т.к. у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем в ячейку c индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индекосм 2");
        //Записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //Удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //Проверяем, что объект не равен null. т.к. у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        Shop shop = new Shop();
        shop.delete(products, 0);

        System.out.println();
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //Проверяем, что объект не равен null. т.к. у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
