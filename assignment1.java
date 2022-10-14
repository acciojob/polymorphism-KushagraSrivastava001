class Product {
    public static void main(String args[])
    {
        Product p = new Product();
        System.out.println(p.product(10,20));
        System.out.println(p.product(10,20,30));
        System.out.println(p.product(2.0,3.0,4.0));
    }
    public int product(int x,int y) {
        return (x+y);
    }
    public int product(int x,int y,int z) {
        return (x+y+z);
    }
    public double product(double x,double y,double z) {
        return (x+y+z);
    }
}
