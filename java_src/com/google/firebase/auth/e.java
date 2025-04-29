package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class e extends d4.a {
    public static final Parcelable.Creator<e> CREATOR = new y1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6493j;

    /* renamed from: k  reason: collision with root package name */
    private final String f6494k;

    /* renamed from: l  reason: collision with root package name */
    private final String f6495l;

    /* renamed from: m  reason: collision with root package name */
    private final String f6496m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f6497n;

    /* renamed from: o  reason: collision with root package name */
    private final String f6498o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f6499p;

    /* renamed from: q  reason: collision with root package name */
    private String f6500q;

    /* renamed from: r  reason: collision with root package name */
    private int f6501r;

    /* renamed from: s  reason: collision with root package name */
    private String f6502s;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f6503a;

        /* renamed from: b  reason: collision with root package name */
        private String f6504b;

        /* renamed from: c  reason: collision with root package name */
        private String f6505c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6506d;

        /* renamed from: e  reason: collision with root package name */
        private String f6507e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6508f = false;

        /* renamed from: g  reason: collision with root package name */
        private String f6509g;

        /* synthetic */ a(a1 a1Var) {
        }

        public e a() {
            if (this.f6503a != null) {
                return new e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z10, String str2) {
            this.f6505c = str;
            this.f6506d = z10;
            this.f6507e = str2;
            return this;
        }

        public a c(String str) {
            this.f6509g = str;
            return this;
        }

        public a d(boolean z10) {
            this.f6508f = z10;
            return this;
        }

        public a e(String str) {
            this.f6504b = str;
            return this;
        }

        public a f(String str) {
            this.f6503a = str;
            return this;
        }
    }

    private e(a aVar) {
        this.f6493j = aVar.f6503a;
        this.f6494k = aVar.f6504b;
        this.f6495l = null;
        this.f6496m = aVar.f6505c;
        this.f6497n = aVar.f6506d;
        this.f6498o = aVar.f6507e;
        this.f6499p = aVar.f6508f;
        this.f6502s = aVar.f6509g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.f6493j = str;
        this.f6494k = str2;
        this.f6495l = str3;
        this.f6496m = str4;
        this.f6497n = z10;
        this.f6498o = str5;
        this.f6499p = z11;
        this.f6500q = str6;
        this.f6501r = i10;
        this.f6502s = str7;
    }

    public static a H() {
        return new a(null);
    }

    public static e J() {
        return new e(new a(null));
    }

    public boolean B() {
        return this.f6499p;
    }

    public boolean C() {
        return this.f6497n;
    }

    public String D() {
        return this.f6498o;
    }

    public String E() {
        return this.f6496m;
    }

    public String F() {
        return this.f6494k;
    }

    public String G() {
        return this.f6493j;
    }

    public final int I() {
        return this.f6501r;
    }

    public final String K() {
        return this.f6502s;
    }

    public final String L() {
        return this.f6495l;
    }

    public final String M() {
        return this.f6500q;
    }

    public final void N(String str) {
        this.f6500q = str;
    }

    public final void O(int i10) {
        this.f6501r = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, G(), false);
        d4.c.s(parcel, 2, F(), false);
        d4.c.s(parcel, 3, this.f6495l, false);
        d4.c.s(parcel, 4, E(), false);
        d4.c.c(parcel, 5, C());
        d4.c.s(parcel, 6, D(), false);
        d4.c.c(parcel, 7, B());
        d4.c.s(parcel, 8, this.f6500q, false);
        d4.c.l(parcel, 9, this.f6501r);
        d4.c.s(parcel, 10, this.f6502s, false);
        d4.c.b(parcel, a10);
    }
}
