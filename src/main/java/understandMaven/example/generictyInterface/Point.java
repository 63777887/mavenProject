package understandMaven.example.generictyInterface;

import java.util.ArrayList;

public interface Point<T> {
    public T select(T param, ArrayList list);

}
