package components;

/**
 * Created by teemu on 15.4.2016.
 */
public abstract class BaseComponent {
    public final Integer id;

    public BaseComponent() {
        id = 0;
    }

    protected abstract void buildPanel();
}
