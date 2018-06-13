public class Main {
  static   int [] position = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
  static int [] polynom = {1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,1};
    public static void main(String[] args){
        LSFRUtil test = new LSFRUtil(position,polynom);
        System.out.println(test.run(64));
    }
}
