package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
class l implements androidx.core.app.j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1579a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f1580b;

    /* renamed from: c  reason: collision with root package name */
    private final k.d f1581c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f1582d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f1583e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f1584f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f1585g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f1586h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f1587i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setPriority(i10);
        }

        static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* loaded from: classes.dex */
    static class e {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* loaded from: classes.dex */
    static class h {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(k.d dVar) {
        int i10;
        Object obj;
        this.f1581c = dVar;
        Context context = dVar.f1549a;
        this.f1579a = context;
        this.f1580b = Build.VERSION.SDK_INT >= 26 ? h.a(context, dVar.K) : new Notification.Builder(dVar.f1549a);
        Notification notification = dVar.R;
        this.f1580b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f1557i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1553e).setContentText(dVar.f1554f).setContentInfo(dVar.f1559k).setContentIntent(dVar.f1555g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f1556h, (notification.flags & 128) != 0).setLargeIcon(dVar.f1558j).setNumber(dVar.f1560l).setProgress(dVar.f1568t, dVar.f1569u, dVar.f1570v);
        a.b(a.d(a.c(this.f1580b, dVar.f1565q), dVar.f1563o), dVar.f1561m);
        Iterator<k.a> it = dVar.f1550b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = dVar.D;
        if (bundle != null) {
            this.f1585g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f1582d = dVar.H;
        this.f1583e = dVar.I;
        b.a(this.f1580b, dVar.f1562n);
        d.i(this.f1580b, dVar.f1574z);
        d.g(this.f1580b, dVar.f1571w);
        d.j(this.f1580b, dVar.f1573y);
        d.h(this.f1580b, dVar.f1572x);
        this.f1586h = dVar.O;
        e.b(this.f1580b, dVar.C);
        e.c(this.f1580b, dVar.E);
        e.f(this.f1580b, dVar.F);
        e.d(this.f1580b, dVar.G);
        e.e(this.f1580b, notification.sound, notification.audioAttributes);
        List<String> e10 = i11 < 28 ? e(f(dVar.f1551c), dVar.U) : dVar.U;
        if (e10 != null && !e10.isEmpty()) {
            for (String str : e10) {
                e.a(this.f1580b, str);
            }
        }
        this.f1587i = dVar.J;
        if (dVar.f1552d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < dVar.f1552d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), m.a(dVar.f1552d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f1585g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 23 && (obj = dVar.T) != null) {
            f.b(this.f1580b, obj);
        }
        if (i13 >= 24) {
            c.a(this.f1580b, dVar.D);
            g.e(this.f1580b, dVar.f1567s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                g.c(this.f1580b, remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                g.b(this.f1580b, remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                g.d(this.f1580b, remoteViews3);
            }
        }
        if (i13 >= 26) {
            h.b(this.f1580b, dVar.L);
            h.e(this.f1580b, dVar.f1566r);
            h.f(this.f1580b, dVar.M);
            h.g(this.f1580b, dVar.N);
            h.d(this.f1580b, dVar.O);
            if (dVar.B) {
                h.c(this.f1580b, dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.f1580b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<o> it2 = dVar.f1551c.iterator();
            while (it2.hasNext()) {
                i.a(this.f1580b, it2.next().h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            j.a(this.f1580b, dVar.Q);
            j.b(this.f1580b, k.c.a(null));
        }
        if (i14 >= 31 && (i10 = dVar.P) != 0) {
            k.b(this.f1580b, i10);
        }
        if (dVar.S) {
            if (this.f1581c.f1572x) {
                this.f1586h = 2;
            } else {
                this.f1586h = 1;
            }
            this.f1580b.setVibrate(null);
            this.f1580b.setSound(null);
            int i15 = notification.defaults & (-2) & (-3);
            notification.defaults = i15;
            this.f1580b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f1581c.f1571w)) {
                    d.g(this.f1580b, "silent");
                }
                h.d(this.f1580b, this.f1586h);
            }
        }
    }

    private void b(k.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        IconCompat d10 = aVar.d();
        Notification.Action.Builder a10 = i10 >= 23 ? f.a(d10 != null ? d10.o() : null, aVar.h(), aVar.a()) : d.e(d10 != null ? d10.h() : 0, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : q.b(aVar.e())) {
                d.c(a10, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            g.a(a10, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i11 >= 28) {
            i.b(a10, aVar.f());
        }
        if (i11 >= 29) {
            j.c(a10, aVar.j());
        }
        if (i11 >= 31) {
            k.a(a10, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(a10, bundle);
        d.a(this.f1580b, d.d(a10));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        s.b bVar = new s.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<o> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (o oVar : list) {
            arrayList.add(oVar.g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.j
    public Notification.Builder a() {
        return this.f1580b;
    }

    public Notification c() {
        Bundle a10;
        RemoteViews f10;
        RemoteViews d10;
        k.e eVar = this.f1581c.f1564p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews e10 = eVar != null ? eVar.e(this) : null;
        Notification d11 = d();
        if (e10 != null || (e10 = this.f1581c.H) != null) {
            d11.contentView = e10;
        }
        if (eVar != null && (d10 = eVar.d(this)) != null) {
            d11.bigContentView = d10;
        }
        if (eVar != null && (f10 = this.f1581c.f1564p.f(this)) != null) {
            d11.headsUpContentView = f10;
        }
        if (eVar != null && (a10 = androidx.core.app.k.a(d11)) != null) {
            eVar.a(a10);
        }
        return d11;
    }

    protected Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return a.a(this.f1580b);
        }
        if (i10 >= 24) {
            Notification a10 = a.a(this.f1580b);
            if (this.f1586h != 0) {
                if (d.f(a10) != null && (a10.flags & 512) != 0 && this.f1586h == 2) {
                    g(a10);
                }
                if (d.f(a10) != null && (a10.flags & 512) == 0 && this.f1586h == 1) {
                    g(a10);
                }
            }
            return a10;
        }
        c.a(this.f1580b, this.f1585g);
        Notification a11 = a.a(this.f1580b);
        RemoteViews remoteViews = this.f1582d;
        if (remoteViews != null) {
            a11.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f1583e;
        if (remoteViews2 != null) {
            a11.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f1587i;
        if (remoteViews3 != null) {
            a11.headsUpContentView = remoteViews3;
        }
        if (this.f1586h != 0) {
            if (d.f(a11) != null && (a11.flags & 512) != 0 && this.f1586h == 2) {
                g(a11);
            }
            if (d.f(a11) != null && (a11.flags & 512) == 0 && this.f1586h == 1) {
                g(a11);
            }
        }
        return a11;
    }
}
