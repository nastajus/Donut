/**
 * Created by IAN on 09/11/14.
 */
public interface Sameable<S extends Sameable> {
    boolean isSameAs(S s);
}
