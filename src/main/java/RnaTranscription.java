import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    // Create and populate constant transcriptions
    public static final Map<Character, Character> transcriptions = new HashMap<>();
    static {
        transcriptions.put('G', 'C');
        transcriptions.put('C', 'G');
        transcriptions.put('T', 'A');
        transcriptions.put('A', 'U');
    }

    String transcribe(String dnaStrand) {
        StringBuilder builder = new StringBuilder();
        for (Character nucleotide: dnaStrand.toCharArray()) {
            builder.append(transcriptions.get(nucleotide));
        }
        return builder.toString();
    }

}
