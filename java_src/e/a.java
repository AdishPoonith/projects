package e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0128a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f7957a;

        public C0128a(T t10) {
            this.f7957a = t10;
        }

        public final T a() {
            return this.f7957a;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0128a<O> b(Context context, I i10) {
        l.e(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
