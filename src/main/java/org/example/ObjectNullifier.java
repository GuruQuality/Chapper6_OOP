package org.example;

import java.lang.reflect.Field;

public class ObjectNullifier {
    public static void nullifyObject(Object obj) {
        if (obj == null) {
            return;
        }

        Class<?> clazz = obj.getClass();

        try {
            // Получаем все поля класса, включая приватные
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                // Разрешаем доступ к приватным полям
                field.setAccessible(true);

                // Получаем тип поля
                Class<?> fieldType = field.getType();

                // Проверяем, является ли тип примитивом
                // Если не примитив - устанавливаем null
                if (!fieldType.isPrimitive()) {
                    field.set(obj, null);
                    System.out.println("Обнулено поле: " + field.getName() +
                            " типа " + fieldType.getSimpleName());
                } else {
                    System.out.println("Пропущено примитивное поле: " + field.getName() +
                            " типа " + fieldType.getSimpleName());
                }
            }

        } catch (IllegalAccessException e) {
            System.err.println("Ошибка доступа к полям: " + e.getMessage());
        }
    }

}
