package la;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class v2 extends CancellationException {

    /* renamed from: j  reason: collision with root package name */
    public final transient v1 f13676j;

    public v2(String str) {
        this(str, null);
    }

    public v2(String str, v1 v1Var) {
        super(str);
        this.f13676j = v1Var;
    }
}
