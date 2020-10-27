package homeworkweekseven;

//write a class with the name Wall.
public class Wall {
    //The class needs two fields (instance variables) with name width and height of type double.
    double width, height;

    //The first constructor does not have any parameters (no-arg  constructor)
    public Wall() {

    }

    /*The second constructor has parameters width and height of type double and it needs to  initialize the fields. In case the width is less
  than 0 it needs to set the width field value to 0, in case the  height parameter is less than 0 it needs to set the height
  field value to 0. */
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
    }

    // Method named getWidth without any parameters, it needs to return the value of width field.
    public double getWidth() {
        return width;
    }

    //Method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight() {
        return height;
    }

    /* Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is
    less than 0 it needs to set the width field value to 0.*/
    public void setWidth(double width) {
        if (width <= 0) {
            this.width = 0;
        }
    }

    /*Method named setHeight with one parameter of type double, it needs to set the value of the  height field. If the parameter
     is less than 0 it needs to set the height field value to 0. */
    public void setHeight(double height) {
        if (height <= 0) {
            this.height = 0;
        }
    }

    //Method named getArea without any parameters, it needs to return the area of the wall
    public double getArea() {
        return (height * width);
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
/* → OUTPUT:
area= 20.0
width= 5.0
height= 0.0
area= 0.0 */


}

