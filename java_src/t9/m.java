package t9;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class m implements Iterator<Character>, ea.a {
    public abstract char a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
