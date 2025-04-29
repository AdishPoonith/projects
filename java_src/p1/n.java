package p1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p1.u;
/* loaded from: classes.dex */
public class n extends f0 {

    /* renamed from: o  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f15176o;

    /* renamed from: m  reason: collision with root package name */
    private final String f15177m;

    /* renamed from: n  reason: collision with root package name */
    public static final b f15175n = new b(null);
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new n(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (n.f15176o == null) {
                n.f15176o = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = n.f15176o;
            if (scheduledThreadPoolExecutor == null) {
                kotlin.jvm.internal.l.p("backgroundExecutor");
                throw null;
            }
            return scheduledThreadPoolExecutor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected n(Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.l.e(parcel, "parcel");
        this.f15177m = "device_auth";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
        this.f15177m = "device_auth";
    }

    private final void H(u.e eVar) {
        androidx.fragment.app.e l10 = d().l();
        if (l10 == null || l10.isFinishing()) {
            return;
        }
        m D = D();
        D.U1(l10.F(), "login_with_facebook");
        D.w2(eVar);
    }

    protected m D() {
        return new m();
    }

    public void E() {
        d().j(u.f.f15252r.a(d().z(), "User canceled log in."));
    }

    public void F(Exception ex) {
        kotlin.jvm.internal.l.e(ex, "ex");
        d().j(u.f.c.d(u.f.f15252r, d().z(), null, ex.getMessage(), null, 8, null));
    }

    public void G(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, p0.h hVar, Date date, Date date2, Date date3) {
        kotlin.jvm.internal.l.e(accessToken, "accessToken");
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        kotlin.jvm.internal.l.e(userId, "userId");
        d().j(u.f.f15252r.e(d().z(), new p0.a(accessToken, applicationId, userId, collection, collection2, collection3, hVar, date, date2, date3, null, 1024, null)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p1.f0
    public String f() {
        return this.f15177m;
    }

    @Override // p1.f0
    public int z(u.e request) {
        kotlin.jvm.internal.l.e(request, "request");
        H(request);
        return 1;
    }
}
