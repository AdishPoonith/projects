package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public class m extends o {
    public final boolean A() {
        return p() == this;
    }

    public final Void B() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    @Override // kotlinx.coroutines.internal.o
    public boolean u() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.o
    public /* bridge */ /* synthetic */ boolean v() {
        return ((Boolean) B()).booleanValue();
    }
}
