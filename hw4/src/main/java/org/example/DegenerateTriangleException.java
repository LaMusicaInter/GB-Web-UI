package ru.iq_soft;
/**
 * Класс DegenerateTriangleException
 *      Исключение на случай вырожденного треугольника в отрезок или точку
 * @author : Хильченко А.Н
 * @project : HW_4
 * @date : 11.02.2022
 */

public class DegenerateTriangleException extends Exception{
    public DegenerateTriangleException() {
        super("Вырожденный в отрезок или точку треугольник не имеет площади");
    }
}
