package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class k {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f1536a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f1537b;

        /* renamed from: c  reason: collision with root package name */
        private final q[] f1538c;

        /* renamed from: d  reason: collision with root package name */
        private final q[] f1539d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1540e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1541f;

        /* renamed from: g  reason: collision with root package name */
        private final int f1542g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f1543h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f1544i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1545j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f1546k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f1547l;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.g(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q[] qVarArr, q[] qVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f1541f = true;
            this.f1537b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.f1544i = iconCompat.h();
            }
            this.f1545j = d.d(charSequence);
            this.f1546k = pendingIntent;
            this.f1536a = bundle == null ? new Bundle() : bundle;
            this.f1538c = qVarArr;
            this.f1539d = qVarArr2;
            this.f1540e = z10;
            this.f1542g = i10;
            this.f1541f = z11;
            this.f1543h = z12;
            this.f1547l = z13;
        }

        public PendingIntent a() {
            return this.f1546k;
        }

        public boolean b() {
            return this.f1540e;
        }

        public Bundle c() {
            return this.f1536a;
        }

        public IconCompat d() {
            int i10;
            if (this.f1537b == null && (i10 = this.f1544i) != 0) {
                this.f1537b = IconCompat.g(null, "", i10);
            }
            return this.f1537b;
        }

        public q[] e() {
            return this.f1538c;
        }

        public int f() {
            return this.f1542g;
        }

        public boolean g() {
            return this.f1541f;
        }

        public CharSequence h() {
            return this.f1545j;
        }

        public boolean i() {
            return this.f1547l;
        }

        public boolean j() {
            return this.f1543h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f1548e;

        /* loaded from: classes.dex */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.k.e
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.k.e
        public void b(j jVar) {
            Notification.BigTextStyle a10 = a.a(a.c(a.b(jVar.a()), this.f1576b), this.f1548e);
            if (this.f1578d) {
                a.d(a10, this.f1577c);
            }
        }

        @Override // androidx.core.app.k.e
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f1548e = d.d(charSequence);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;
        @Deprecated
        public ArrayList<String> U;

        /* renamed from: a  reason: collision with root package name */
        public Context f1549a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1550b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<o> f1551c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f1552d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f1553e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f1554f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f1555g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f1556h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f1557i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f1558j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f1559k;

        /* renamed from: l  reason: collision with root package name */
        int f1560l;

        /* renamed from: m  reason: collision with root package name */
        int f1561m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1562n;

        /* renamed from: o  reason: collision with root package name */
        boolean f1563o;

        /* renamed from: p  reason: collision with root package name */
        e f1564p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f1565q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f1566r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f1567s;

        /* renamed from: t  reason: collision with root package name */
        int f1568t;

        /* renamed from: u  reason: collision with root package name */
        int f1569u;

        /* renamed from: v  reason: collision with root package name */
        boolean f1570v;

        /* renamed from: w  reason: collision with root package name */
        String f1571w;

        /* renamed from: x  reason: collision with root package name */
        boolean f1572x;

        /* renamed from: y  reason: collision with root package name */
        String f1573y;

        /* renamed from: z  reason: collision with root package name */
        boolean f1574z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.f1550b = new ArrayList<>();
            this.f1551c = new ArrayList<>();
            this.f1552d = new ArrayList<>();
            this.f1562n = true;
            this.f1574z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f1549a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f1561m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void l(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.R;
                i11 = i10 | notification.flags;
            } else {
                notification = this.R;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        public d a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1550b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new l(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d e(boolean z10) {
            l(16, z10);
            return this;
        }

        public d f(String str) {
            this.K = str;
            return this;
        }

        public d g(int i10) {
            this.E = i10;
            return this;
        }

        public d h(boolean z10) {
            this.A = z10;
            this.B = true;
            return this;
        }

        public d i(PendingIntent pendingIntent) {
            this.f1555g = pendingIntent;
            return this;
        }

        public d j(CharSequence charSequence) {
            this.f1554f = d(charSequence);
            return this;
        }

        public d k(CharSequence charSequence) {
            this.f1553e = d(charSequence);
            return this;
        }

        public d m(boolean z10) {
            this.f1574z = z10;
            return this;
        }

        public d n(int i10) {
            this.f1561m = i10;
            return this;
        }

        public d o(int i10) {
            this.R.icon = i10;
            return this;
        }

        public d p(e eVar) {
            if (this.f1564p != eVar) {
                this.f1564p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d q(CharSequence charSequence) {
            this.f1565q = d(charSequence);
            return this;
        }

        public d r(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public d s(long j10) {
            this.R.when = j10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        protected d f1575a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f1576b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f1577c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1578d = false;

        public void a(Bundle bundle) {
            if (this.f1578d) {
                bundle.putCharSequence("android.summaryText", this.f1577c);
            }
            CharSequence charSequence = this.f1576b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(j jVar);

        protected abstract String c();

        public RemoteViews d(j jVar) {
            return null;
        }

        public RemoteViews e(j jVar) {
            return null;
        }

        public RemoteViews f(j jVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f1575a != dVar) {
                this.f1575a = dVar;
                if (dVar != null) {
                    dVar.p(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
