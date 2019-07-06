package Exercise2;

public class Square extends Rectangle {
   Square(){

   }
   Square(double side){
       super(side, side);
   }
   Square(double side, String color, boolean filled){
       super(color,filled,side,side);
   }

   public void setSide(double side){
       this.setLength(side);
       this.setWidth(side);
   }

   public void setWidth(double side){
       super.setWidth(side);
   }

   public void setLength(double side){
       super.setLength(side);
   }

   public double getSide(){
      return  this.getSide();
   }

    @Override
    public String toString() {
        return getSide()+", "+ getColor();
    }
}
