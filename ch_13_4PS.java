class square{
    int side,area,perimtr;
    public int getArea(){
        return  area = side * side;
    }
    public void setArea(){
        System.out.println("Area : "+area);
    }
    public int getPerimtr(){
        return  perimtr = 4 * side;
    }
    public void setPerimtr(){
        System.out.println("Perimeter : "+perimtr);
    }
}

public class ch_13_4PS {
    public static void main(String[] args) {
       square obj = new square(); 
       obj.side = 5;
       obj.getArea();
       obj.getPerimtr();
       obj.setArea();
       obj.setPerimtr();
    }
}
