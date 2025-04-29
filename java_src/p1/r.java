package p1;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import p1.u;
/* loaded from: classes.dex */
public final class r extends k0 {

    /* renamed from: n  reason: collision with root package name */
    private final String f15204n;

    /* renamed from: o  reason: collision with root package name */
    private final p0.h f15205o;

    /* renamed from: p  reason: collision with root package name */
    public static final b f15203p = new b(null);
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<r> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public r createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new r(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public r[] newArray(int i10) {
            return new r[i10];
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Parcel source) {
        super(source);
        kotlin.jvm.internal.l.e(source, "source");
        this.f15204n = "instagram_login";
        this.f15205o = p0.h.INSTAGRAM_APPLICATION_WEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
        this.f15204n = "instagram_login";
        this.f15205o = p0.h.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // p1.k0
    public p0.h F() {
        return this.f15205o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p1.f0
    public String f() {
        return this.f15204n;
    }

    @Override // p1.f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        super.writeToParcel(dest, i10);
    }

    @Override // p1.f0
    public int z(u.e request) {
        kotlin.jvm.internal.l.e(request, "request");
        u.c cVar = u.f15222v;
        String a10 = cVar.a();
        f1.e0 e0Var = f1.e0.f8417a;
        Context l10 = d().l();
        if (l10 == null) {
            p0.f0 f0Var = p0.f0.f14852a;
            l10 = p0.f0.l();
        }
        String a11 = request.a();
        Set<String> x10 = request.x();
        boolean E = request.E();
        boolean B = request.B();
        e j10 = request.j();
        if (j10 == null) {
            j10 = e.NONE;
        }
        Intent j11 = f1.e0.j(l10, a11, x10, a10, E, B, j10, c(request.b()), request.c(), request.q(), request.z(), request.C(), request.L());
        a("e2e", a10);
        return M(j11, cVar.b()) ? 1 : 0;
    }
}
