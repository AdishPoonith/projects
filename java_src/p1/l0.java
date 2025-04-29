package p1;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f15162a = new l0();

    private l0() {
    }

    public static final boolean a(String str) {
        int E;
        if (str == null || str.length() == 0) {
            return false;
        }
        E = ka.q.E(str, ' ', 0, false, 6, null);
        return !(E >= 0);
    }
}
