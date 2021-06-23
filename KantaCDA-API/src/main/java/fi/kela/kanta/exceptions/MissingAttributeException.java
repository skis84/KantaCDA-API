package fi.kela.kanta.exceptions;

public class MissingAttributeException extends Exception {

    private static final long serialVersionUID = 1L;
    private static final String backupPattern = "Sisäinen attribuutti ''{0}'' puuttuu.";
    private final String basicMsg;

    public MissingAttributeException(String attributeName) {
        basicMsg = buildMessage(MissingAttributeException.backupPattern, attributeName);
    }

    @Override
    public String getMessage() {

        return basicMsg;
    }

    @Override
    public String getLocalizedMessage() {

        return basicMsg;
    }

    private String buildMessage(String pattern, String attributeName) {
        Object[] obj = { attributeName };
        return mf.format(obj);
    }
}
