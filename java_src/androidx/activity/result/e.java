package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class e implements Parcelable {

    /* renamed from: j  reason: collision with root package name */
    private final IntentSender f554j;

    /* renamed from: k  reason: collision with root package name */
    private final Intent f555k;

    /* renamed from: l  reason: collision with root package name */
    private final int f556l;

    /* renamed from: m  reason: collision with root package name */
    private final int f557m;

    /* renamed from: n  reason: collision with root package name */
    public static final c f553n = new c(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f558a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f559b;

        /* renamed from: c  reason: collision with root package name */
        private int f560c;

        /* renamed from: d  reason: collision with root package name */
        private int f561d;

        public a(IntentSender intentSender) {
            l.e(intentSender, "intentSender");
            this.f558a = intentSender;
        }

        public final e a() {
            return new e(this.f558a, this.f559b, this.f560c, this.f561d);
        }

        public final a b(Intent intent) {
            this.f559b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f561d = i10;
            this.f560c = i11;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<e> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel inParcel) {
            l.e(inParcel, "inParcel");
            return new e(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }
    }

    public e(IntentSender intentSender, Intent intent, int i10, int i11) {
        l.e(intentSender, "intentSender");
        this.f554j = intentSender;
        this.f555k = intent;
        this.f556l = i10;
        this.f557m = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.l.e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.l.b(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.e.<init>(android.os.Parcel):void");
    }

    public final Intent a() {
        return this.f555k;
    }

    public final int b() {
        return this.f556l;
    }

    public final int c() {
        return this.f557m;
    }

    public final IntentSender d() {
        return this.f554j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        l.e(dest, "dest");
        dest.writeParcelable(this.f554j, i10);
        dest.writeParcelable(this.f555k, i10);
        dest.writeInt(this.f556l);
        dest.writeInt(this.f557m);
    }
}
