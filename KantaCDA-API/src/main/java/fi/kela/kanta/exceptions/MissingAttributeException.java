
package fi.kela.kanta.exceptions;

import java.text.MessageFormat;

public class MissingAttributeException extends Exception {

    

    private String buildMessage(String pattern, String attributeName) {
        MessageFormat mf = new MessageFormat(pattern);
        Object[] obj = { attributeName };
        return mf.format(obj);
    }
}
