package p0;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenManager;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class i implements Parcelable {

    /* renamed from: j  reason: collision with root package name */
    private final String f14910j;

    /* renamed from: k  reason: collision with root package name */
    private final String f14911k;

    /* renamed from: l  reason: collision with root package name */
    private final m f14912l;

    /* renamed from: m  reason: collision with root package name */
    private final l f14913m;

    /* renamed from: n  reason: collision with root package name */
    private final String f14914n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f14909o = new b(null);
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public i createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new i(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(i iVar) {
            AuthenticationTokenManager.f3476d.a().e(iVar);
        }
    }

    public i(Parcel parcel) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        String readString = parcel.readString();
        f1.m0 m0Var = f1.m0.f8479a;
        this.f14910j = f1.m0.k(readString, "token");
        this.f14911k = f1.m0.k(parcel.readString(), "expectedNonce");
        Parcelable readParcelable = parcel.readParcelable(m.class.getClassLoader());
        if (readParcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f14912l = (m) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(l.class.getClassLoader());
        if (readParcelable2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f14913m = (l) readParcelable2;
        this.f14914n = f1.m0.k(parcel.readString(), "signature");
    }

    public i(String token, String expectedNonce) {
        List b02;
        kotlin.jvm.internal.l.e(token, "token");
        kotlin.jvm.internal.l.e(expectedNonce, "expectedNonce");
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.g(token, "token");
        f1.m0.g(expectedNonce, "expectedNonce");
        b02 = ka.q.b0(token, new String[]{"."}, false, 0, 6, null);
        if (!(b02.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str = (String) b02.get(0);
        String str2 = (String) b02.get(1);
        String str3 = (String) b02.get(2);
        this.f14910j = token;
        this.f14911k = expectedNonce;
        m mVar = new m(str);
        this.f14912l = mVar;
        this.f14913m = new l(str2, expectedNonce);
        if (!a(str, str2, str3, mVar.a())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.f14914n = str3;
    }

    private final boolean a(String str, String str2, String str3, String str4) {
        try {
            o1.c cVar = o1.c.f14390a;
            String c10 = o1.c.c(str4);
            if (c10 == null) {
                return false;
            }
            PublicKey b10 = o1.c.b(c10);
            return o1.c.e(b10, str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f14910j);
        jSONObject.put("expected_nonce", this.f14911k);
        jSONObject.put("header", this.f14912l.c());
        jSONObject.put("claims", this.f14913m.b());
        jSONObject.put("signature", this.f14914n);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return kotlin.jvm.internal.l.a(this.f14910j, iVar.f14910j) && kotlin.jvm.internal.l.a(this.f14911k, iVar.f14911k) && kotlin.jvm.internal.l.a(this.f14912l, iVar.f14912l) && kotlin.jvm.internal.l.a(this.f14913m, iVar.f14913m) && kotlin.jvm.internal.l.a(this.f14914n, iVar.f14914n);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f14910j.hashCode()) * 31) + this.f14911k.hashCode()) * 31) + this.f14912l.hashCode()) * 31) + this.f14913m.hashCode()) * 31) + this.f14914n.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeString(this.f14910j);
        dest.writeString(this.f14911k);
        dest.writeParcelable(this.f14912l, i10);
        dest.writeParcelable(this.f14913m, i10);
        dest.writeString(this.f14914n);
    }
}
