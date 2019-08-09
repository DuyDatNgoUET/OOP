import java.util.List;

public class ShapeUtil {
    public String printInfo(List<GeometricObject> shapes){
        String circle = "Circle:\n";
        String triangle = "Triangle:\n";
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i) instanceof Circle){
                circle+= shapes.get(i).getInfo()+"\n";
            }
            if(shapes.get(i) instanceof Triangle){
                triangle+=shapes.get(i).getInfo()+"\n";
            }
        }

        return circle + triangle;
    }
}
