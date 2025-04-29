package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.b0;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final b0 f12992a = new b0("LOCK_FAIL");

    /* renamed from: b  reason: collision with root package name */
    private static final b0 f12993b = new b0("UNLOCK_FAIL");

    /* renamed from: c  reason: collision with root package name */
    private static final b0 f12994c;

    /* renamed from: d  reason: collision with root package name */
    private static final b0 f12995d;

    /* renamed from: e  reason: collision with root package name */
    private static final a f12996e;

    /* renamed from: f  reason: collision with root package name */
    private static final a f12997f;

    static {
        b0 b0Var = new b0("LOCKED");
        f12994c = b0Var;
        b0 b0Var2 = new b0("UNLOCKED");
        f12995d = b0Var2;
        f12996e = new a(b0Var);
        f12997f = new a(b0Var2);
    }

    public static final b a(boolean z10) {
        return new c(z10);
    }

    public static /* synthetic */ b b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
