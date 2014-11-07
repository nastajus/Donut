//http://stackoverflow.com/questions/15734225/what-are-the-differences-between-a-java-enum-and-a-class-with-private-constructo
public enum Direction {
    ENUM_UP(0, -1),
    ENUM_DOWN(0, 1),
    ENUM_RIGHT(1, 0),
    ENUM_LEFT(-1, 0);


    private int x;
    private int y;

    private Direction(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getEnumX(){
        return x;
    }
    public int getEnumY(){
        return y;
    }
}
