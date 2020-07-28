class Area {
    int height;
    int width;
}

public class SingleInheritance extends Area {
    int area;

    public void TotalArea() {
        area = width*height;
    }

    public static void main(String[] args) {
        SingleInheritance gr = new SingleInheritance();
        gr.height = 10;
        gr.width = 5;
        gr.TotalArea();
        System.out.println("Area of rectangle : "+gr.area);
    }
}