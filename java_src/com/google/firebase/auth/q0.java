package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class q0 {

    /* loaded from: classes.dex */
    public static class a extends d4.a {
        public static final Parcelable.Creator<a> CREATOR = new z1();

        public static a B() {
            return new a();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            d4.c.b(parcel, d4.c.a(parcel));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private static final f4.a f6602a = new f4.a("PhoneAuthProvider", new String[0]);

        public void a(String str) {
            f6602a.e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void b(String str, a aVar) {
        }

        public abstract void c(o0 o0Var);

        public abstract void d(w5.l lVar);
    }

    public static o0 a(String str, String str2) {
        return o0.G(str, str2);
    }

    public static void b(p0 p0Var) {
        c4.s.j(p0Var);
        p0Var.b().a0(p0Var);
    }
}
