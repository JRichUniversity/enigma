public class rotor {
    final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static int amountRotor = 0;
    int rotor;
    String key;
    int[] indexArr;

    int triggerPin;



    rotor(String key, int tP, int startPos){
        this.key = util.format(key);
        System.out.println(this.key);
        formatKey();
        amountRotor++;
        rotor = amountRotor;
        System.out.println("Rotor " + rotor + " wurde initialisiert.\n");
        if(tP >= 0) triggerPin = indexArr[tP];
        else tP = -1;
        for(int i = 0; i < startPos; i++){
            turnForward();
        }
    }

    void formatKey(){
        indexArr = new int[key.length()];
        for(int i = 0; i < indexArr.length; i++){
            indexArr[i] = ALPHABET.indexOf(key.charAt(i));
        }
    }

    int findIndex(int index){
        return indexArr[index];
    }

    void turnForward(){
        int first = indexArr[0];
        for(int i = 0; i < indexArr.length-1; i++){
            indexArr[i] = indexArr[i+1];
        }
        indexArr[indexArr.length-1] = first;
    }

    char indexToLetter(int i){
        return ALPHABET.toCharArray()[i];
    }

    boolean trigger(){
            return indexArr[0] == triggerPin;
    }
}
