package org.example;


public class DegenerateTriangleException extends Exception{
    public DegenerateTriangleException() {
        super("Выроженный треугольник в отрезок или точку не имеет площади");
    }
}
