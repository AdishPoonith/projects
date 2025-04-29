package a6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
/* loaded from: classes.dex */
public final class o1 implements com.google.firebase.auth.g {
    public static final Parcelable.Creator<o1> CREATOR = new p1();

    /* renamed from: j  reason: collision with root package name */
    private final String f266j;

    /* renamed from: k  reason: collision with root package name */
    private final String f267k;

    /* renamed from: l  reason: collision with root package name */
    private final Map f268l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f269m;

    public o1(String str, String str2, boolean z10) {
        c4.s.f(str);
        c4.s.f(str2);
        this.f266j = str;
        this.f267k = str2;
        this.f268l = f0.c(str2);
        this.f269m = z10;
    }

    public o1(boolean z10) {
        this.f269m = z10;
        this.f267k = null;
        this.f266j = null;
        this.f268l = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.g
    public final String g() {
        return this.f266j;
    }

    @Override // com.google.firebase.auth.g
    public final Map<String, Object> i() {
        return this.f268l;
    }

    @Override // com.google.firebase.auth.g
    public final String t() {
        Map map;
        String str;
        if ("github.com".equals(this.f266j)) {
            map = this.f268l;
            str = "login";
        } else if (!"twitter.com".equals(this.f266j)) {
            return null;
        } else {
            map = this.f268l;
            str = "screen_name";
        }
        return (String) map.get(str);
    }

    @Override // com.google.firebase.auth.g
    public final boolean v() {
        return this.f269m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f266j, false);
        d4.c.s(parcel, 2, this.f267k, false);
        d4.c.c(parcel, 3, this.f269m);
        d4.c.b(parcel, a10);
    }
}
