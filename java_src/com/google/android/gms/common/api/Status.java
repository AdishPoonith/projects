package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes.dex */
public final class Status extends d4.a implements m, ReflectedParcelable {

    /* renamed from: j  reason: collision with root package name */
    final int f3741j;

    /* renamed from: k  reason: collision with root package name */
    private final int f3742k;

    /* renamed from: l  reason: collision with root package name */
    private final String f3743l;

    /* renamed from: m  reason: collision with root package name */
    private final PendingIntent f3744m;

    /* renamed from: n  reason: collision with root package name */
    private final b4.b f3745n;

    /* renamed from: o  reason: collision with root package name */
    public static final Status f3733o = new Status(-1);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f3734p = new Status(0);

    /* renamed from: q  reason: collision with root package name */
    public static final Status f3735q = new Status(14);

    /* renamed from: r  reason: collision with root package name */
    public static final Status f3736r = new Status(8);

    /* renamed from: s  reason: collision with root package name */
    public static final Status f3737s = new Status(15);

    /* renamed from: t  reason: collision with root package name */
    public static final Status f3738t = new Status(16);

    /* renamed from: v  reason: collision with root package name */
    public static final Status f3740v = new Status(17);

    /* renamed from: u  reason: collision with root package name */
    public static final Status f3739u = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new u();

    public Status(int i10) {
        this(i10, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i10, int i11, String str, PendingIntent pendingIntent, b4.b bVar) {
        this.f3741j = i10;
        this.f3742k = i11;
        this.f3743l = str;
        this.f3744m = pendingIntent;
        this.f3745n = bVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent, null);
    }

    public Status(b4.b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(b4.b bVar, String str, int i10) {
        this(1, i10, str, bVar.D(), bVar);
    }

    public b4.b B() {
        return this.f3745n;
    }

    @ResultIgnorabilityUnspecified
    public int C() {
        return this.f3742k;
    }

    public String D() {
        return this.f3743l;
    }

    public boolean E() {
        return this.f3744m != null;
    }

    public boolean F() {
        return this.f3742k == 16;
    }

    public boolean G() {
        return this.f3742k <= 0;
    }

    public void H(Activity activity, int i10) {
        if (E()) {
            PendingIntent pendingIntent = this.f3744m;
            c4.s.j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f3741j == status.f3741j && this.f3742k == status.f3742k && c4.q.b(this.f3743l, status.f3743l) && c4.q.b(this.f3744m, status.f3744m) && c4.q.b(this.f3745n, status.f3745n);
        }
        return false;
    }

    public int hashCode() {
        return c4.q.c(Integer.valueOf(this.f3741j), Integer.valueOf(this.f3742k), this.f3743l, this.f3744m, this.f3745n);
    }

    @Override // com.google.android.gms.common.api.m
    public Status p() {
        return this;
    }

    public String toString() {
        q.a d10 = c4.q.d(this);
        d10.a("statusCode", zza());
        d10.a("resolution", this.f3744m);
        return d10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, C());
        d4.c.s(parcel, 2, D(), false);
        d4.c.r(parcel, 3, this.f3744m, i10, false);
        d4.c.r(parcel, 4, B(), i10, false);
        d4.c.l(parcel, 1000, this.f3741j);
        d4.c.b(parcel, a10);
    }

    public final String zza() {
        String str = this.f3743l;
        return str != null ? str : d.a(this.f3742k);
    }
}
