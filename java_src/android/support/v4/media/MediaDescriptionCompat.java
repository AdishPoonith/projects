package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    private final String f389j;

    /* renamed from: k  reason: collision with root package name */
    private final CharSequence f390k;

    /* renamed from: l  reason: collision with root package name */
    private final CharSequence f391l;

    /* renamed from: m  reason: collision with root package name */
    private final CharSequence f392m;

    /* renamed from: n  reason: collision with root package name */
    private final Bitmap f393n;

    /* renamed from: o  reason: collision with root package name */
    private final Uri f394o;

    /* renamed from: p  reason: collision with root package name */
    private final Bundle f395p;

    /* renamed from: q  reason: collision with root package name */
    private final Uri f396q;

    /* renamed from: r  reason: collision with root package name */
    private Object f397r;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f398a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f399b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f400c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f401d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f402e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f403f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f404g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f405h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f398a, this.f399b, this.f400c, this.f401d, this.f402e, this.f403f, this.f404g, this.f405h);
        }

        public b b(CharSequence charSequence) {
            this.f401d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f404g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f402e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f403f = uri;
            return this;
        }

        public b f(String str) {
            this.f398a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f405h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f400c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f399b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f389j = str;
        this.f390k = charSequence;
        this.f391l = charSequence2;
        this.f392m = charSequence3;
        this.f393n = bitmap;
        this.f394o = uri;
        this.f395p = bundle;
        this.f396q = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7a
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.a.f(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.h(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.g(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.b(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.a.d(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.a.e(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.a.c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L46
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L47
        L46:
            r5 = r0
        L47:
            if (r5 == 0) goto L5f
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L59
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L59
            goto L60
        L59:
            r3.remove(r4)
            r3.remove(r6)
        L5f:
            r0 = r3
        L60:
            r2.c(r0)
            if (r5 == 0) goto L69
            r2.g(r5)
            goto L74
        L69:
            r0 = 23
            if (r1 < r0) goto L74
            android.net.Uri r0 = android.support.v4.media.b.a(r9)
            r2.g(r0)
        L74:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f397r = r9
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        Object obj = this.f397r;
        if (obj == null) {
            int i10 = Build.VERSION.SDK_INT;
            Object b10 = a.C0006a.b();
            a.C0006a.g(b10, this.f389j);
            a.C0006a.i(b10, this.f390k);
            a.C0006a.h(b10, this.f391l);
            a.C0006a.c(b10, this.f392m);
            a.C0006a.e(b10, this.f393n);
            a.C0006a.f(b10, this.f394o);
            Bundle bundle = this.f395p;
            if (i10 < 23 && this.f396q != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f396q);
            }
            a.C0006a.d(b10, bundle);
            if (i10 >= 23) {
                b.a.a(b10, this.f396q);
            }
            Object a10 = a.C0006a.a(b10);
            this.f397r = a10;
            return a10;
        }
        return obj;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f390k) + ", " + ((Object) this.f391l) + ", " + ((Object) this.f392m);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(b(), parcel, i10);
    }
}
