package module_2.lesson_5;

public class Task_2_5_7 {
}

class Solution_2_5_7 {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }

    public abstract class KeywordAnalyzer implements TextAnalyzer{
        protected abstract String[] getKeywords();
        protected abstract Label getLabel();

        public Label processText(String text) {
            for (int i = 0; i < getKeywords().length; i++) {
                if (text.contains(getKeywords()[i])) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }

    public class NegativeTextAnalyzer extends KeywordAnalyzer {

        public NegativeTextAnalyzer() {
        }

        @Override
        public String[] getKeywords() {
            return new String[]{":(", "=(", ":|"};
        }

        @Override
        public Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    public class SpamAnalyzer extends KeywordAnalyzer {
        private String [] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    public class TooLongTextAnalyzer implements TextAnalyzer {

        private int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        public Label processText(String text) {
            if (text.length() > maxLength){
                return Label.TOO_LONG;
            }
            return Label.OK;
        }
    }

    interface TextAnalyzer {
        Label processText(String text);
    }

    enum Label {
        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
    }
}
