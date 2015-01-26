package oracle.certified.professional.topic12.section23;

import java.util.ListResourceBundle;

public class MyResource_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] { { "hello", "Hello" }, { "good-bye", "Good bye" } };
    }

}
