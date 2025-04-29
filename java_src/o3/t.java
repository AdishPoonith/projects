package o3;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o3.l;
import o3.u;
/* loaded from: classes.dex */
public final class t implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14577a;

    /* renamed from: b  reason: collision with root package name */
    private final List<p0> f14578b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final l f14579c;

    /* renamed from: d  reason: collision with root package name */
    private l f14580d;

    /* renamed from: e  reason: collision with root package name */
    private l f14581e;

    /* renamed from: f  reason: collision with root package name */
    private l f14582f;

    /* renamed from: g  reason: collision with root package name */
    private l f14583g;

    /* renamed from: h  reason: collision with root package name */
    private l f14584h;

    /* renamed from: i  reason: collision with root package name */
    private l f14585i;

    /* renamed from: j  reason: collision with root package name */
    private l f14586j;

    /* renamed from: k  reason: collision with root package name */
    private l f14587k;

    /* loaded from: classes.dex */
    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f14588a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f14589b;

        /* renamed from: c  reason: collision with root package name */
        private p0 f14590c;

        public a(Context context) {
            this(context, new u.b());
        }

        public a(Context context, l.a aVar) {
            this.f14588a = context.getApplicationContext();
            this.f14589b = aVar;
        }

        @Override // o3.l.a
        /* renamed from: b */
        public t a() {
            t tVar = new t(this.f14588a, this.f14589b.a());
            p0 p0Var = this.f14590c;
            if (p0Var != null) {
                tVar.h(p0Var);
            }
            return tVar;
        }
    }

    public t(Context context, l lVar) {
        this.f14577a = context.getApplicationContext();
        this.f14579c = (l) p3.a.e(lVar);
    }

    private void q(l lVar) {
        for (int i10 = 0; i10 < this.f14578b.size(); i10++) {
            lVar.h(this.f14578b.get(i10));
        }
    }

    private l r() {
        if (this.f14581e == null) {
            c cVar = new c(this.f14577a);
            this.f14581e = cVar;
            q(cVar);
        }
        return this.f14581e;
    }

    private l s() {
        if (this.f14582f == null) {
            h hVar = new h(this.f14577a);
            this.f14582f = hVar;
            q(hVar);
        }
        return this.f14582f;
    }

    private l t() {
        if (this.f14585i == null) {
            j jVar = new j();
            this.f14585i = jVar;
            q(jVar);
        }
        return this.f14585i;
    }

    private l u() {
        if (this.f14580d == null) {
            y yVar = new y();
            this.f14580d = yVar;
            q(yVar);
        }
        return this.f14580d;
    }

    private l v() {
        if (this.f14586j == null) {
            k0 k0Var = new k0(this.f14577a);
            this.f14586j = k0Var;
            q(k0Var);
        }
        return this.f14586j;
    }

    private l w() {
        if (this.f14583g == null) {
            try {
                l lVar = (l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f14583g = lVar;
                q(lVar);
            } catch (ClassNotFoundException unused) {
                p3.r.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f14583g == null) {
                this.f14583g = this.f14579c;
            }
        }
        return this.f14583g;
    }

    private l x() {
        if (this.f14584h == null) {
            q0 q0Var = new q0();
            this.f14584h = q0Var;
            q(q0Var);
        }
        return this.f14584h;
    }

    private void y(l lVar, p0 p0Var) {
        if (lVar != null) {
            lVar.h(p0Var);
        }
    }

    @Override // o3.l
    public void close() {
        l lVar = this.f14587k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f14587k = null;
            }
        }
    }

    @Override // o3.l
    public Map<String, List<String>> e() {
        l lVar = this.f14587k;
        return lVar == null ? Collections.emptyMap() : lVar.e();
    }

    @Override // o3.l
    public void h(p0 p0Var) {
        p3.a.e(p0Var);
        this.f14579c.h(p0Var);
        this.f14578b.add(p0Var);
        y(this.f14580d, p0Var);
        y(this.f14581e, p0Var);
        y(this.f14582f, p0Var);
        y(this.f14583g, p0Var);
        y(this.f14584h, p0Var);
        y(this.f14585i, p0Var);
        y(this.f14586j, p0Var);
    }

    @Override // o3.l
    public Uri j() {
        l lVar = this.f14587k;
        if (lVar == null) {
            return null;
        }
        return lVar.j();
    }

    @Override // o3.l
    public long m(p pVar) {
        l s10;
        p3.a.f(this.f14587k == null);
        String scheme = pVar.f14512a.getScheme();
        if (p3.n0.v0(pVar.f14512a)) {
            String path = pVar.f14512a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                s10 = u();
            }
            s10 = r();
        } else {
            if (!"asset".equals(scheme)) {
                s10 = "content".equals(scheme) ? s() : "rtmp".equals(scheme) ? w() : "udp".equals(scheme) ? x() : "data".equals(scheme) ? t() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? v() : this.f14579c;
            }
            s10 = r();
        }
        this.f14587k = s10;
        return this.f14587k.m(pVar);
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        return ((l) p3.a.e(this.f14587k)).read(bArr, i10, i11);
    }
}
