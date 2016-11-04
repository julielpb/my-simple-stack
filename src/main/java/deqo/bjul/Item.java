package deqo.bjul;

import java.util.Objects;

/* Un commentaire répondant à l'exigence #1*/
public class Item {
    private Object value;

    public Item(Object value){
        setValue(value);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
