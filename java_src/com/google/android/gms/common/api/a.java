package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import c4.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import java.util.Set;
/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0085a f3746a;

    /* renamed from: b  reason: collision with root package name */
    private final g f3747b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3748c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0085a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, c4.e eVar, O o10, f.a aVar, f.b bVar) {
            return b(context, looper, eVar, o10, aVar, bVar);
        }

        public T b(Context context, Looper looper, c4.e eVar, O o10, com.google.android.gms.common.api.internal.e eVar2, com.google.android.gms.common.api.internal.m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: c  reason: collision with root package name */
        public static final c f3749c = new c(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0086a extends d {
            Account d();
        }

        /* loaded from: classes.dex */
        public interface b extends d {
            GoogleSignInAccount z();
        }

        /* loaded from: classes.dex */
        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(p pVar) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        boolean a();

        void b(c.InterfaceC0076c interfaceC0076c);

        void c(c4.k kVar, Set<Scope> set);

        void d(c.e eVar);

        Set<Scope> e();

        void f(String str);

        boolean g();

        int h();

        boolean i();

        b4.d[] j();

        String k();

        String m();

        void n();

        boolean o();
    }

    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC0085a<C, O> abstractC0085a, g<C> gVar) {
        c4.s.k(abstractC0085a, "Cannot construct an Api with a null ClientBuilder");
        c4.s.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f3748c = str;
        this.f3746a = abstractC0085a;
        this.f3747b = gVar;
    }

    public final AbstractC0085a a() {
        return this.f3746a;
    }

    public final c b() {
        return this.f3747b;
    }

    public final String c() {
        return this.f3748c;
    }
}
