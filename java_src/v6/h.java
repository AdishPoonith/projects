package v6;

import android.content.Context;
import b6.r;
/* loaded from: classes.dex */
public class h {

    /* loaded from: classes.dex */
    public interface a<T> {
        String a(T t10);
    }

    public static b6.c<?> b(String str, String str2) {
        return b6.c.l(f.a(str, str2), f.class);
    }

    public static b6.c<?> c(final String str, final a<Context> aVar) {
        return b6.c.m(f.class).b(r.k(Context.class)).d(new b6.h() { // from class: v6.g
            @Override // b6.h
            public final Object a(b6.e eVar) {
                f d10;
                d10 = h.d(str, aVar, eVar);
                return d10;
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, b6.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
