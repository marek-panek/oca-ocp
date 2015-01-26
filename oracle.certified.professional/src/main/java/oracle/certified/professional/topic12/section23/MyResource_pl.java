package oracle.certified.professional.topic12.section23;

import java.util.ListResourceBundle;

public class MyResource_pl extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] { { "hello", "Cześć" }, { "good-bye", "Do widzenia" } };
    }

}
