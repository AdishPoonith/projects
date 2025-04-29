package n5;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.c0;
import g5.k;
import g5.m;
import g5.n;
import g5.o;
import g5.p;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import n5.c;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f14283d = "a";

    /* renamed from: a  reason: collision with root package name */
    private final p f14284a;

    /* renamed from: b  reason: collision with root package name */
    private final g5.a f14285b;

    /* renamed from: c  reason: collision with root package name */
    private n f14286c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private o f14287a = null;

        /* renamed from: b  reason: collision with root package name */
        private p f14288b = null;

        /* renamed from: c  reason: collision with root package name */
        private String f14289c = null;

        /* renamed from: d  reason: collision with root package name */
        private g5.a f14290d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14291e = true;

        /* renamed from: f  reason: collision with root package name */
        private k f14292f = null;

        /* renamed from: g  reason: collision with root package name */
        private KeyStore f14293g = null;

        /* renamed from: h  reason: collision with root package name */
        private n f14294h;

        private n e() {
            g5.a aVar = this.f14290d;
            if (aVar != null) {
                try {
                    return n.j(m.j(this.f14287a, aVar));
                } catch (c0 | GeneralSecurityException e10) {
                    Log.w(a.f14283d, "cannot decrypt keyset: ", e10);
                }
            }
            return n.j(g5.b.a(this.f14287a));
        }

        private n f() {
            try {
                return e();
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable(a.f14283d, 4)) {
                    Log.i(a.f14283d, String.format("keyset not found, will generate a new one. %s", e10.getMessage()));
                }
                if (this.f14292f != null) {
                    n a10 = n.i().a(this.f14292f);
                    n h10 = a10.h(a10.d().g().S(0).S());
                    if (this.f14290d != null) {
                        h10.d().l(this.f14288b, this.f14290d);
                    } else {
                        g5.b.b(h10.d(), this.f14288b);
                    }
                    return h10;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private g5.a g() {
            if (!a.a()) {
                Log.w(a.f14283d, "Android Keystore requires at least Android M");
                return null;
            }
            c a10 = this.f14293g != null ? new c.b().b(this.f14293g).a() : new c();
            boolean e10 = a10.e(this.f14289c);
            if (!e10) {
                try {
                    c.d(this.f14289c);
                } catch (GeneralSecurityException | ProviderException e11) {
                    Log.w(a.f14283d, "cannot use Android Keystore, it'll be disabled", e11);
                    return null;
                }
            }
            try {
                return a10.a(this.f14289c);
            } catch (GeneralSecurityException | ProviderException e12) {
                if (e10) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f14289c), e12);
                }
                Log.w(a.f14283d, "cannot use Android Keystore, it'll be disabled", e12);
                return null;
            }
        }

        public synchronized a d() {
            if (this.f14289c != null) {
                this.f14290d = g();
            }
            this.f14294h = f();
            return new a(this);
        }

        public b h(k kVar) {
            this.f14292f = kVar;
            return this;
        }

        public b i(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.f14291e) {
                    this.f14289c = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public b j(Context context, String str, String str2) {
            if (context != null) {
                if (str != null) {
                    this.f14287a = new d(context, str, str2);
                    this.f14288b = new e(context, str, str2);
                    return this;
                }
                throw new IllegalArgumentException("need a keyset name");
            }
            throw new IllegalArgumentException("need an Android context");
        }
    }

    private a(b bVar) {
        this.f14284a = bVar.f14288b;
        this.f14285b = bVar.f14290d;
        this.f14286c = bVar.f14294h;
    }

    static /* synthetic */ boolean a() {
        return d();
    }

    private static boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public synchronized m c() {
        return this.f14286c.d();
    }
}
