public class Parallelepiped {
    private double height;//бийиктиги
    private  double length;//узундугу
    private double width;//туурасы


    public Parallelepiped(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double areaParallelepiped(){
        return 2*((height * length) + (length * width) + (height * width));
    }
    public double colomParallelepiped(){
        return (length*width*height);
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "Height: " + height +
                "Length: " + length +
                "Width: " + width +
                '}';
    }
    //        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//        - Фигуранын коломун эсептеген формула: (length*width*height);
//        -Формулалар Parallelepiped классында жазылуусу керек

}
