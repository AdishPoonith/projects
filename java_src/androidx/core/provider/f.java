package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    static final s.e<String, Typeface> f1789a = new s.e<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f1790b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f1791c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final s.g<String, ArrayList<androidx.core.util.a<e>>> f1792d = new s.g<>();

    /* loaded from: classes.dex */
    class a implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1794b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f1795c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1796d;

        a(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f1793a = str;
            this.f1794b = context;
            this.f1795c = eVar;
            this.f1796d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return f.c(this.f1793a, this.f1794b, this.f1795c, this.f1796d);
        }
    }

    /* loaded from: classes.dex */
    class b implements androidx.core.util.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f1797a;

        b(androidx.core.provider.a aVar) {
            this.f1797a = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f1797a.b(eVar);
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f1800c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f1801d;

        c(String str, Context context, androidx.core.provider.e eVar, int i10) {
            this.f1798a = str;
            this.f1799b = context;
            this.f1800c = eVar;
            this.f1801d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return f.c(this.f1798a, this.f1799b, this.f1800c, this.f1801d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements androidx.core.util.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1802a;

        d(String str) {
            this.f1802a = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: a */
        public void accept(e eVar) {
            synchronized (f.f1791c) {
                s.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f.f1792d;
                ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(this.f1802a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f1802a);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(eVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f1803a;

        /* renamed from: b  reason: collision with root package name */
        final int f1804b;

        e(int i10) {
            this.f1803a = null;
            this.f1804b = i10;
        }

        e(Typeface typeface) {
            this.f1803a = typeface;
            this.f1804b = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a() {
            return this.f1804b == 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b10 = aVar.b();
        if (b10 != null && b10.length != 0) {
            i10 = 0;
            for (g.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    }
                    return b11;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i10) {
        s.e<String, Typeface> eVar2 = f1789a;
        Typeface c10 = eVar2.c(str);
        if (c10 != null) {
            return new e(c10);
        }
        try {
            g.a e10 = androidx.core.provider.d.e(context, eVar, null);
            int b10 = b(e10);
            if (b10 != 0) {
                return new e(b10);
            }
            Typeface b11 = androidx.core.graphics.d.b(context, null, e10.b(), i10);
            if (b11 != null) {
                eVar2.d(str, b11);
                return new e(b11);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(Context context, androidx.core.provider.e eVar, int i10, Executor executor, androidx.core.provider.a aVar) {
        String a10 = a(eVar, i10);
        Typeface c10 = f1789a.c(a10);
        if (c10 != null) {
            aVar.b(new e(c10));
            return c10;
        }
        b bVar = new b(aVar);
        synchronized (f1791c) {
            s.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f1792d;
            ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a10, arrayList2);
            c cVar = new c(a10, context, eVar, i10);
            if (executor == null) {
                executor = f1790b;
            }
            h.b(executor, cVar, new d(a10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i10, int i11) {
        String a10 = a(eVar, i10);
        Typeface c10 = f1789a.c(a10);
        if (c10 != null) {
            aVar.b(new e(c10));
            return c10;
        } else if (i11 == -1) {
            e c11 = c(a10, context, eVar, i10);
            aVar.b(c11);
            return c11.f1803a;
        } else {
            try {
                e eVar2 = (e) h.c(f1790b, new a(a10, context, eVar, i10), i11);
                aVar.b(eVar2);
                return eVar2.f1803a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }
}
