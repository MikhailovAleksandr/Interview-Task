package by.bsuir.java.main;

public class WorkWithInputLine {

    public char findSingleSymbol(char[] currentSequence){

        char target;
        boolean isSingle;

        for(int i = 0; i < currentSequence.length - 1; i++){
            target = currentSequence[i];
            isSingle = true;
            for(int j = i + 1; j < currentSequence.length; j++){
                if(target == currentSequence[j] || target == ' '){
                    currentSequence = removeAll(currentSequence,target);
                    i--;
                    isSingle = false;
                    break;
                }
            }
            if(isSingle){
                return target;
            }
        }
        return ' ';
    }

    private char[] removeAll(char[] currentSequence, char target){
        for(int i = 0; i < currentSequence.length; i++){
            if (currentSequence[i] == target){
                currentSequence = remove(currentSequence, i);
                i--;
            }
        }
        return currentSequence;
    }

    private char[] remove(char[] currentSequence, int index){

        char[] resultSequence = new char[currentSequence.length - 1];
        for(int i = index; i < currentSequence.length - 1; i++){
            currentSequence[i] = currentSequence[i + 1];
        }
        System.arraycopy(currentSequence,0,resultSequence ,0, currentSequence.length - 1);

        return resultSequence;
    }
}
