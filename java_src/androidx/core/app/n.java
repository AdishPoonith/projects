package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d  reason: collision with root package name */
    private static String f1591d;

    /* renamed from: g  reason: collision with root package name */
    private static e f1594g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1595a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f1596b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1590c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f1592e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1593f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final String f1597a;

        /* renamed from: b  reason: collision with root package name */
        final int f1598b;

        /* renamed from: c  reason: collision with root package name */
        final String f1599c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f1600d;

        c(String str, int i10, String str2, Notification notification) {
            this.f1597a = str;
            this.f1598b = i10;
            this.f1599c = str2;
            this.f1600d = notification;
        }

        @Override // androidx.core.app.n.f
        public void a(b.a aVar) {
            aVar.h2(this.f1597a, this.f1598b, this.f1599c, this.f1600d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f1597a + ", id:" + this.f1598b + ", tag:" + this.f1599c + "]";
        }
    }

    /* loaded from: classes.dex */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f1601a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f1602b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f1601a = componentName;
            this.f1602b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: j  reason: collision with root package name */
        private final Context f1603j;

        /* renamed from: k  reason: collision with root package name */
        private final HandlerThread f1604k;

        /* renamed from: l  reason: collision with root package name */
        private final Handler f1605l;

        /* renamed from: m  reason: collision with root package name */
        private final Map<ComponentName, a> f1606m = new HashMap();

        /* renamed from: n  reason: collision with root package name */
        private Set<String> f1607n = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f1608a;

            /* renamed from: c  reason: collision with root package name */
            b.a f1610c;

            /* renamed from: b  reason: collision with root package name */
            boolean f1609b = false;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<f> f1611d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f1612e = 0;

            a(ComponentName componentName) {
                this.f1608a = componentName;
            }
        }

        e(Context context) {
            this.f1603j = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f1604k = handlerThread;
            handlerThread.start();
            this.f1605l = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f1609b) {
                return true;
            }
            boolean bindService = this.f1603j.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1608a), this, 33);
            aVar.f1609b = bindService;
            if (bindService) {
                aVar.f1612e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1608a);
                this.f1603j.unbindService(this);
            }
            return aVar.f1609b;
        }

        private void b(a aVar) {
            if (aVar.f1609b) {
                this.f1603j.unbindService(this);
                aVar.f1609b = false;
            }
            aVar.f1610c = null;
        }

        private void c(f fVar) {
            j();
            for (a aVar : this.f1606m.values()) {
                aVar.f1611d.add(fVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f1606m.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f1606m.get(componentName);
            if (aVar != null) {
                aVar.f1610c = a.AbstractBinderC0055a.p(iBinder);
                aVar.f1612e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f1606m.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1608a + ", " + aVar.f1611d.size() + " queued tasks");
            }
            if (aVar.f1611d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f1610c == null) {
                i(aVar);
                return;
            }
            while (true) {
                f peek = aVar.f1611d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.a(aVar.f1610c);
                    aVar.f1611d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f1608a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1608a, e10);
                }
            }
            if (aVar.f1611d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f1605l.hasMessages(3, aVar.f1608a)) {
                return;
            }
            int i10 = aVar.f1612e + 1;
            aVar.f1612e = i10;
            if (i10 <= 6) {
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f1605l.sendMessageDelayed(this.f1605l.obtainMessage(3, aVar.f1608a), i11);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1611d.size() + " tasks to " + aVar.f1608a + " after " + aVar.f1612e + " retries");
            aVar.f1611d.clear();
        }

        private void j() {
            Set<String> d10 = n.d(this.f1603j);
            if (d10.equals(this.f1607n)) {
                return;
            }
            this.f1607n = d10;
            List<ResolveInfo> queryIntentServices = this.f1603j.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (d10.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f1606m.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f1606m.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f1606m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(f fVar) {
            this.f1605l.obtainMessage(0, fVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((f) message.obj);
                return true;
            } else if (i10 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f1601a, dVar.f1602b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1605l.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1605l.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        void a(b.a aVar);
    }

    private n(Context context) {
        this.f1595a = context;
        this.f1596b = (NotificationManager) context.getSystemService("notification");
    }

    public static n c(Context context) {
        return new n(context);
    }

    public static Set<String> d(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1590c) {
            if (string != null) {
                if (!string.equals(f1591d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f1592e = hashSet;
                    f1591d = string;
                }
            }
            set = f1592e;
        }
        return set;
    }

    private void g(f fVar) {
        synchronized (f1593f) {
            if (f1594g == null) {
                f1594g = new e(this.f1595a.getApplicationContext());
            }
            f1594g.h(fVar);
        }
    }

    private static boolean h(Notification notification) {
        Bundle a10 = k.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f1596b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1595a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1595a.getApplicationInfo();
        String packageName = this.f1595a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f1596b, notificationChannel);
        }
    }

    public void e(int i10, Notification notification) {
        f(null, i10, notification);
    }

    public void f(String str, int i10, Notification notification) {
        if (!h(notification)) {
            this.f1596b.notify(str, i10, notification);
            return;
        }
        g(new c(this.f1595a.getPackageName(), i10, str, notification));
        this.f1596b.cancel(str, i10);
    }
}
