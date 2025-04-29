package r6;

import android.content.Context;
import android.util.Base64OutputStream;
import b6.f0;
import b6.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import r6.j;
/* loaded from: classes.dex */
public class f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final s6.b<k> f16710a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16711b;

    /* renamed from: c  reason: collision with root package name */
    private final s6.b<v6.i> f16712c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<g> f16713d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f16714e;

    private f(final Context context, final String str, Set<g> set, s6.b<v6.i> bVar, Executor executor) {
        this(new s6.b() { // from class: r6.e
            @Override // s6.b
            public final Object get() {
                k j10;
                j10 = f.j(context, str);
                return j10;
            }
        }, set, executor, bVar, context);
    }

    f(s6.b<k> bVar, Set<g> set, Executor executor, s6.b<v6.i> bVar2, Context context) {
        this.f16710a = bVar;
        this.f16713d = set;
        this.f16714e = executor;
        this.f16712c = bVar2;
        this.f16711b = context;
    }

    public static b6.c<f> g() {
        final f0 a10 = f0.a(x5.a.class, Executor.class);
        return b6.c.f(f.class, i.class, j.class).b(r.k(Context.class)).b(r.k(w5.f.class)).b(r.m(g.class)).b(r.l(v6.i.class)).b(r.j(a10)).d(new b6.h() { // from class: r6.b
            @Override // b6.h
            public final Object a(b6.e eVar) {
                f h10;
                h10 = f.h(f0.this, eVar);
                return h10;
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(f0 f0Var, b6.e eVar) {
        return new f((Context) eVar.a(Context.class), ((w5.f) eVar.a(w5.f.class)).s(), eVar.c(g.class), eVar.g(v6.i.class), (Executor) eVar.d(f0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            k kVar = this.f16710a.get();
            List<l> c10 = kVar.c();
            kVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                l lVar = c10.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.c());
                jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            this.f16710a.get().k(System.currentTimeMillis(), this.f16712c.get().a());
        }
        return null;
    }

    @Override // r6.i
    public Task<String> a() {
        return androidx.core.os.l.a(this.f16711b) ^ true ? Tasks.forResult("") : Tasks.call(this.f16714e, new Callable() { // from class: r6.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i10;
                i10 = f.this.i();
                return i10;
            }
        });
    }

    @Override // r6.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = this.f16710a.get();
        if (!kVar.i(currentTimeMillis)) {
            return j.a.NONE;
        }
        kVar.g();
        return j.a.GLOBAL;
    }

    public Task<Void> l() {
        if (this.f16713d.size() > 0 && !(!androidx.core.os.l.a(this.f16711b))) {
            return Tasks.call(this.f16714e, new Callable() { // from class: r6.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void k10;
                    k10 = f.this.k();
                    return k10;
                }
            });
        }
        return Tasks.forResult(null);
    }
}
