package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class z0 extends d4.a {
    public static final Parcelable.Creator<z0> CREATOR = new w1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6634j;

    /* renamed from: k  reason: collision with root package name */
    private final String f6635k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f6636l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f6637m;

    /* renamed from: n  reason: collision with root package name */
    private final Uri f6638n;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f6639a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f6640b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f6641c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6642d;

        public z0 a() {
            String str = this.f6639a;
            Uri uri = this.f6640b;
            return new z0(str, uri == null ? null : uri.toString(), this.f6641c, this.f6642d);
        }

        public a b(String str) {
            if (str == null) {
                this.f6641c = true;
            } else {
                this.f6639a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f6642d = true;
            } else {
                this.f6640b = uri;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(String str, String str2, boolean z10, boolean z11) {
        this.f6634j = str;
        this.f6635k = str2;
        this.f6636l = z10;
        this.f6637m = z11;
        this.f6638n = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public Uri B() {
        return this.f6638n;
    }

    public final boolean C() {
        return this.f6636l;
    }

    public final boolean D() {
        return this.f6637m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 2, x(), false);
        d4.c.s(parcel, 3, this.f6635k, false);
        d4.c.c(parcel, 4, this.f6636l);
        d4.c.c(parcel, 5, this.f6637m);
        d4.c.b(parcel, a10);
    }

    public String x() {
        return this.f6634j;
    }

    public final String zza() {
        return this.f6635k;
    }
}
