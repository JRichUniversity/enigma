public class main {
    final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static rotor[] rotors = {
            new rotor("E K M F L G D Q V Z N T O W Y H X U S P A I B R C J", 0, 0),
            new rotor("A J D K S I R U X B L H W T M C Q G Z N P Y F V O E", 0, 0),
            new rotor("B D F H J L C P R T X V Z N Y E I W G A K M U S Q O", 0, 0)
    };

    public static void main(String[] args){
        crypt('A');
        triggerTurn();
        crypt('A');
        triggerTurn();
        crypt('A');
        triggerTurn();
    }

    public static char crypt(char c){
        int index = ALPHABET.indexOf(c);
        int input = ALPHABET.indexOf(c);
        for(rotor r : rotors){
            index = r.findIndex(index);
            System.out.print(r.indexToLetter(input) + "-" + r.indexToLetter(index) + " ");
            input = index;
        }
        System.out.println();
        return ALPHABET.charAt(index);
    }

    public static void triggerTurn(){
        int index = 0;
        if(index == 0 && rotors[0].trigger() && rotors.length > 1){
            triggerTurn(1);
        }
        rotors[0].turnForward();
        System.out.println("Rotor " + (index+1) + " wurde gedreht.\n");
    }

    public static void triggerTurn(int index){
        if(index < rotors.length-1 && rotors[index].trigger()){
                triggerTurn(index + 1);
        }
        rotors[index].turnForward();
        System.out.println("Rotor " + (index+1) + " wurde gedreht.");
    }
}
