 PROBLEM - CREATE A CLASS OF RECTANGLE AND  FIND ITS AREA AND PERIMETER 
 SOLUTION 
 
 CODE 
 class rectangle {
    double lenght;
    double breadth;
    void area(){
        double area;
        area = (this.lenght * this.breadth);
        System.out.println("area of rectangle is :" +area);
    }
    void perimeter(){
        double perimeter;
        perimeter = 2*(this.lenght + this.breadth);
        System.out.println("perimeter of rectangle is :" +perimeter);
    }
    public class demo{
        public static void main(String args[]){
            rectangle rect = new rectangle();
            rect.lenght = 20;
            rect.breadth =10;
            rect.area();
            rect.perimeter();
        }
        
        
 OUTPUT
area of rectangle is :200.0
perimeter of rectangle is :60.0
