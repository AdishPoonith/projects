package v9;

import da.p;
import kotlin.jvm.internal.l;
import s9.n;
import s9.u;
/* loaded from: classes.dex */
public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> completion) {
        d a10;
        d b10;
        l.e(pVar, "<this>");
        l.e(completion, "completion");
        a10 = w9.c.a(pVar, r10, completion);
        b10 = w9.c.b(a10);
        n.a aVar = n.f17870k;
        b10.resumeWith(n.b(u.f17878a));
    }
}
