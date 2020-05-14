package src.kethua.baitap;

public class point3D extends Point2D {
    private float z;

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    
    public void setXY(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }

    
    public float[] getXYZ() {
        float [] array=new float[3];
        array[0]=getX();
        array[1]=getY();
        array[2]=getZ();
        return array;
    }

    @Override
    public String toString() {
        return "array[0]=" + getXYZ()[0] +"\n"+
                "array[1]=" + getXYZ()[1] +"\n"+
                "array[2]=" + getXYZ()[2] ;
    }

    public static void main(String[] args) {
        point3D po=new point3D(3.1f,3.2f,3.3f);
        System.out.print(po);

    }
}

