package p1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f1.f0;
import f1.l0;
import org.json.JSONException;
import org.json.JSONObject;
import p1.f0;
import p1.u;
/* loaded from: classes.dex */
public final class q extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private o f15198m;

    /* renamed from: n  reason: collision with root package name */
    private final String f15199n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f15197o = new b(null);
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<q> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements l0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f15200a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f15201b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u.e f15202c;

        c(Bundle bundle, q qVar, u.e eVar) {
            this.f15200a = bundle;
            this.f15201b = qVar;
            this.f15202c = eVar;
        }

        @Override // f1.l0.a
        public void a(JSONObject jSONObject) {
            try {
                this.f15200a.putString("com.facebook.platform.extra.USER_ID", jSONObject == null ? null : jSONObject.getString("id"));
                this.f15201b.E(this.f15202c, this.f15200a);
            } catch (JSONException e10) {
                this.f15201b.d().f(u.f.c.d(u.f.f15252r, this.f15201b.d().z(), "Caught exception", e10.getMessage(), null, 8, null));
            }
        }

        @Override // f1.l0.a
        public void b(p0.s sVar) {
            this.f15201b.d().f(u.f.c.d(u.f.f15252r, this.f15201b.d().z(), "Caught exception", sVar == null ? null : sVar.getMessage(), null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Parcel source) {
        super(source);
        kotlin.jvm.internal.l.e(source, "source");
        this.f15199n = "get_token";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
        this.f15199n = "get_token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(q this$0, u.e request, Bundle bundle) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(request, "$request");
        this$0.D(request, bundle);
    }

    public final void C(u.e request, Bundle result) {
        kotlin.jvm.internal.l.e(request, "request");
        kotlin.jvm.internal.l.e(result, "result");
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (!(string == null || string.length() == 0)) {
            E(request, result);
            return;
        }
        d().D();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        f1.l0 l0Var = f1.l0.f8470a;
        f1.l0.D(string2, new c(result, this, request));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if ((r2 == null || r2.length() == 0) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(p1.u.e r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.l.e(r6, r0)
            p1.o r0 = r5.f15198m
            r1 = 0
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.g(r1)
        Le:
            r5.f15198m = r1
            p1.u r0 = r5.d()
            r0.E()
            if (r7 == 0) goto L4c
            java.lang.String r0 = "com.facebook.platform.extra.PERMISSIONS"
            java.util.ArrayList r0 = r7.getStringArrayList(r0)
            if (r0 != 0) goto L25
            java.util.List r0 = t9.n.e()
        L25:
            java.util.Set r1 = r6.x()
            if (r1 != 0) goto L2f
            java.util.Set r1 = t9.k0.b()
        L2f:
            java.lang.String r2 = "com.facebook.platform.extra.ID_TOKEN"
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r3 = "openid"
            boolean r3 = r1.contains(r3)
            r4 = 1
            if (r3 == 0) goto L54
            if (r2 == 0) goto L49
            int r2 = r2.length()
            if (r2 != 0) goto L47
            goto L49
        L47:
            r2 = 0
            goto L4a
        L49:
            r2 = 1
        L4a:
            if (r2 == 0) goto L54
        L4c:
            p1.u r6 = r5.d()
            r6.M()
            return
        L54:
            boolean r2 = r0.containsAll(r1)
            if (r2 == 0) goto L5e
            r5.C(r6, r7)
            return
        L5e:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L67
            r7.add(r2)
            goto L67
        L7d:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L8f
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r7)
            java.lang.String r1 = "new_permissions"
            r5.a(r1, r0)
        L8f:
            r6.H(r7)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.q.D(p1.u$e, android.os.Bundle):void");
    }

    public final void E(u.e request, Bundle result) {
        u.f d10;
        kotlin.jvm.internal.l.e(request, "request");
        kotlin.jvm.internal.l.e(result, "result");
        try {
            f0.a aVar = f0.f15128l;
            d10 = u.f.f15252r.b(request, aVar.a(result, p0.h.FACEBOOK_APPLICATION_SERVICE, request.a()), aVar.c(result, request.s()));
        } catch (p0.s e10) {
            d10 = u.f.c.d(u.f.f15252r, d().z(), null, e10.getMessage(), null, 8, null);
        }
        d().j(d10);
    }

    @Override // p1.f0
    public void b() {
        o oVar = this.f15198m;
        if (oVar == null) {
            return;
        }
        oVar.b();
        oVar.g(null);
        this.f15198m = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p1.f0
    public String f() {
        return this.f15199n;
    }

    @Override // p1.f0
    public int z(final u.e request) {
        kotlin.jvm.internal.l.e(request, "request");
        Context l10 = d().l();
        if (l10 == null) {
            p0.f0 f0Var = p0.f0.f14852a;
            l10 = p0.f0.l();
        }
        o oVar = new o(l10, request);
        this.f15198m = oVar;
        if (kotlin.jvm.internal.l.a(Boolean.valueOf(oVar.h()), Boolean.FALSE)) {
            return 0;
        }
        d().D();
        f0.b bVar = new f0.b() { // from class: p1.p
            @Override // f1.f0.b
            public final void a(Bundle bundle) {
                q.F(q.this, request, bundle);
            }
        };
        o oVar2 = this.f15198m;
        if (oVar2 == null) {
            return 1;
        }
        oVar2.g(bVar);
        return 1;
    }
}
