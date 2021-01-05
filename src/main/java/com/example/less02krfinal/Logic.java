package com.example.less02krfinal;

public class Logic {
    String howManyRootsHaveEquation(Entity entity) {
        entity.setD((entity.getB() * entity.getB() - (4 * entity.getA() * entity.getC())));

        if (entity.getD() < 0) {
            return "уравнение не имеет корней";
        } else try {
            if (entity.getD() == 0) {
                return "Уравнение имеет один корень:\n" + oneX(entity);
            } else {
                return "Уравнение имеет два корня:\n" + twoX(entity);
            }
        } catch (ArithmeticException e) {
            return "Деление на ноль";
        }
    }

    String twoX(Entity entity) {
        int x1 = (int) ((-entity.getB() + Math.sqrt((double) entity.getD())) / (2 * entity.getA()));
        int x2 = (int) ((-entity.getB() - Math.sqrt((double) entity.getD())) / (2 * entity.getA()));
        return "x1=" + x1 + "\n" + "x2=" + x2;
    }

    int oneX(Entity entity) {
        return -entity.getB() / (2 * entity.getA());
    }
}
