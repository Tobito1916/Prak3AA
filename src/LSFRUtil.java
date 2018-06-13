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
        for (int i = 0; i < times; i++){
            step();
        }
        for (int o = 0; o <pos.length; o++){
            out += pos[o];
        }
        return out;
    }

    @Override
    public int addthem(int[] poly) {
        int ergebnis = 0;
        for (int i = 0; i<pos.length; i++){
            if(poly[i] == 0){
                ergebnis += pos[i];
            }

        }
        if (ergebnis%2 == 0){
            ergebnis = 0;
        }else{
            ergebnis = 1;
        }


        return ergebnis;
    }

    @Override
    public void step() {
        int[] zwischen = pos;
        for (int i = 1; i < pos.length; i++){
            pos[i] = pos[i -1];
        }
        pos[0] = addthem(zwischen);
    }
}
