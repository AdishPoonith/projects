package p1;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class s extends k0 {

    /* renamed from: n  reason: collision with root package name */
    private final String f15207n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f15206o = new b(null);
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public s createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new s(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public s[] newArray(int i10) {
            return new s[i10];
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
    public s(Parcel source) {
        super(source);
        kotlin.jvm.internal.l.e(source, "source");
        this.f15207n = "katana_proxy_auth";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
        this.f15207n = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p1.f0
    public String f() {
        return this.f15207n;
    }

    @Override // p1.f0
    public boolean x() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    @Override // p1.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int z(p1.u.e r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "request"
            r2 = r24
            kotlin.jvm.internal.l.e(r2, r1)
            p1.t r1 = r24.m()
            boolean r3 = p0.f0.f14869r
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L23
            f1.f r3 = f1.f.f8428a
            java.lang.String r3 = f1.f.a()
            if (r3 == 0) goto L23
            boolean r1 = r1.g()
            if (r1 == 0) goto L23
            r15 = 1
            goto L24
        L23:
            r15 = 0
        L24:
            p1.u$c r1 = p1.u.f15222v
            java.lang.String r1 = r1.a()
            f1.e0 r3 = f1.e0.f8417a
            p1.u r3 = r23.d()
            androidx.fragment.app.e r6 = r3.l()
            java.lang.String r7 = r24.a()
            java.util.Set r8 = r24.x()
            boolean r10 = r24.E()
            boolean r11 = r24.B()
            p1.e r3 = r24.j()
            if (r3 != 0) goto L4c
            p1.e r3 = p1.e.NONE
        L4c:
            r12 = r3
            java.lang.String r3 = r24.b()
            java.lang.String r13 = r0.c(r3)
            java.lang.String r14 = r24.c()
            java.lang.String r16 = r24.q()
            boolean r17 = r24.z()
            boolean r18 = r24.C()
            boolean r19 = r24.L()
            java.lang.String r20 = r24.s()
            java.lang.String r21 = r24.d()
            p1.a r2 = r24.e()
            if (r2 != 0) goto L79
            r2 = 0
            goto L7d
        L79:
            java.lang.String r2 = r2.name()
        L7d:
            r22 = r2
            r9 = r1
            java.util.List r2 = f1.e0.n(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r3 = "e2e"
            r0.a(r3, r1)
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
        L8e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La8
            int r2 = r2 + r4
            java.lang.Object r3 = r1.next()
            android.content.Intent r3 = (android.content.Intent) r3
            p1.u$c r6 = p1.u.f15222v
            int r6 = r6.b()
            boolean r3 = r0.M(r3, r6)
            if (r3 == 0) goto L8e
            return r2
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.s.z(p1.u$e):int");
    }
}
