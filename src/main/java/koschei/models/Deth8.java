package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    @Autowired
    private Needle7 needle7;

    @Override
    public String toString() {
        return needle7.toString();
    }
}
