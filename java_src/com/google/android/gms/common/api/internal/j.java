package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class j<L> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3849a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f3850b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f3851c;

    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f3852a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3853b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(L l10, String str) {
            this.f3852a = l10;
            this.f3853b = str;
        }

        public String a() {
            String str = this.f3853b;
            int identityHashCode = System.identityHashCode(this.f3852a);
            return str + "@" + identityHashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f3852a == aVar.f3852a && this.f3853b.equals(aVar.f3853b);
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f3852a) * 31) + this.f3853b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public interface b<L> {
        void a(L l10);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Looper looper, L l10, String str) {
        this.f3849a = new i4.a(looper);
        this.f3850b = c4.s.k(l10, "Listener must not be null");
        this.f3851c = new a(l10, c4.s.f(str));
    }

    public void a() {
        this.f3850b = null;
        this.f3851c = null;
    }

    public a<L> b() {
        return this.f3851c;
    }

    public void c(final b<? super L> bVar) {
        c4.s.k(bVar, "Notifier must not be null");
        this.f3849a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.s0
            @Override // java.lang.Runnable
            public final void run() {
                j.this.d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(b bVar) {
        Object obj = this.f3850b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }
}
