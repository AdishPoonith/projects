package a6;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class y1 implements com.google.firebase.auth.b0 {
    public static final Parcelable.Creator<y1> CREATOR = new d();

    /* renamed from: j  reason: collision with root package name */
    private final long f339j;

    /* renamed from: k  reason: collision with root package name */
    private final long f340k;

    public y1(long j10, long j11) {
        this.f339j = j10;
        this.f340k = j11;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f339j);
            jSONObject.put("creationTimestamp", this.f340k);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.b0
    public final long o() {
        return this.f340k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.p(parcel, 1, this.f339j);
        d4.c.p(parcel, 2, this.f340k);
        d4.c.b(parcel, a10);
    }

    @Override // com.google.firebase.auth.b0
    public final long y() {
        return this.f339j;
    }
}
