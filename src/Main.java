import com.personetics.test.ChainValidator;
import com.personetics.test.PopulateNodesWithNumbersAndWords;

public class Main {
    public static void main(String[] args) {

        PopulateNodesWithNumbersAndWords populateWithNumbersAndWord = new PopulateNodesWithNumbersAndWords();

        System.out.println(ChainValidator.validate(populateWithNumbersAndWord.getNumbers()));
        System.out.println(ChainValidator.validate(populateWithNumbersAndWord.getWords()));
        System.out.println(ChainValidator.validate(populateWithNumbersAndWord.getNotValidNode()));
    }
}

