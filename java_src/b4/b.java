package b4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
/* loaded from: classes.dex */
public final class b extends d4.a {

    /* renamed from: j  reason: collision with root package name */
    final int f2894j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2895k;

    /* renamed from: l  reason: collision with root package name */
    private final PendingIntent f2896l;

    /* renamed from: m  reason: collision with root package name */
    private final String f2897m;

    /* renamed from: n  reason: collision with root package name */
    public static final b f2893n = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new p();

    public b(int i10) {
        this(i10, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f2894j = i10;
        this.f2895k = i11;
        this.f2896l = pendingIntent;
        this.f2897m = str;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String G(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case IntegrityErrorCode.API_NOT_AVAILABLE /* -1 */:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case f.j.f8330t3 /* 23 */:
                                return "API_DISABLED";
                            case f.j.f8335u3 /* 24 */:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public int B() {
        return this.f2895k;
    }

    public String C() {
        return this.f2897m;
    }

    public PendingIntent D() {
        return this.f2896l;
    }

    public boolean E() {
        return (this.f2895k == 0 || this.f2896l == null) ? false : true;
    }

    public boolean F() {
        return this.f2895k == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f2895k == bVar.f2895k && c4.q.b(this.f2896l, bVar.f2896l) && c4.q.b(this.f2897m, bVar.f2897m);
        }
        return false;
    }

    public int hashCode() {
        return c4.q.c(Integer.valueOf(this.f2895k), this.f2896l, this.f2897m);
    }

    public String toString() {
        q.a d10 = c4.q.d(this);
        d10.a("statusCode", G(this.f2895k));
        d10.a("resolution", this.f2896l);
        d10.a("message", this.f2897m);
        return d10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f2894j);
        d4.c.l(parcel, 2, B());
        d4.c.r(parcel, 3, D(), i10, false);
        d4.c.s(parcel, 4, C(), false);
        d4.c.b(parcel, a10);
    }
}
