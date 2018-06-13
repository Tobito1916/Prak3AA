public class LSFRUtil implements LSFRInterface{
    int[] pos;
    int[] poly;
    public LSFRUtil(int[] pos, int[] poly){
        this.pos = pos;
        this.poly = poly;
    }
    @Override
    public String run(int times) {
        String out = "";
        int laenge = pos.length;
        String debug ="";
        int[] position = pos;


        for (int i = 0; i < times; i++){

           /* for (int p = 0; p <pos.length; p++){
                debug = debug + pos[p]+ " ";

            }
            System.out.println(debug);
            debug = "";
            */


            out = out + position[laenge - 1 ] + " ";
            position = step(position);
        }

        return out;
    }

    @Override
    public int addthem(int[] poly, int[] posit) {
        int ergebnis = 0;
        String debug ="";
        for (int p = 0; p <pos.length; p++){
            debug = debug + posit[p]+ " ";

        }
        System.out.println(debug);

        for (int i = 0; i<posit.length; i++){
            if(poly[i] == 1){
                if (ergebnis == 0 && posit[i] == 1){
                    ergebnis = 1;
                }
                if (ergebnis == 1 && posit[i] == 1){
                    ergebnis = 0;
                }
                if (ergebnis == 0 && posit[i] == 0){
                    ergebnis = 0;
                }
                if (ergebnis == 1 && posit[i] == 0){
                    ergebnis = 1;
                }
            }

        }



        return ergebnis;
    }

    @Override
    public int[] step(int[] posi) {
        int[] zwischen = posi;

       // String deebug = "";


        for (int i = 1; i < posi.length; i++){

            posi[i] = zwischen[i - 1];
           /* deebug = deebug + i +": " + pos[i] + "->" + zwischen[i]+ " ";*/
        }
       // System.out.println(deebug);
        posi[0] = addthem(poly, zwischen);
        return posi;
    }

}
