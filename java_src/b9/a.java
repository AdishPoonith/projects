package b9;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0069a extends RuntimeException {

        /* renamed from: j  reason: collision with root package name */
        public final String f3095j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f3096k;
    }

    /* loaded from: classes.dex */
    public interface b {
        List<String> a(c cVar);

        String b();

        String c();

        List<String> e();

        String f();

        String g();
    }

    /* loaded from: classes.dex */
    public enum c {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);
        

        /* renamed from: j  reason: collision with root package name */
        final int f3109j;

        c(int i10) {
            this.f3109j = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0069a) {
            C0069a c0069a = (C0069a) th;
            arrayList.add(c0069a.f3095j);
            arrayList.add(c0069a.getMessage());
            obj = c0069a.f3096k;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
