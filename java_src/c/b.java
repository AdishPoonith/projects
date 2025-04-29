package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    final boolean f3120j = false;

    /* renamed from: k  reason: collision with root package name */
    final Handler f3121k = null;

    /* renamed from: l  reason: collision with root package name */
    c.a f3122l;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0072b extends a.AbstractBinderC0070a {
        BinderC0072b() {
        }

        @Override // c.a
        public void D2(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f3121k;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final int f3124j;

        /* renamed from: k  reason: collision with root package name */
        final Bundle f3125k;

        c(int i10, Bundle bundle) {
            this.f3124j = i10;
            this.f3125k = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f3124j, this.f3125k);
        }
    }

    b(Parcel parcel) {
        this.f3122l = a.AbstractBinderC0070a.p(parcel.readStrongBinder());
    }

    protected void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f3122l == null) {
                this.f3122l = new BinderC0072b();
            }
            parcel.writeStrongBinder(this.f3122l.asBinder());
        }
    }
}
