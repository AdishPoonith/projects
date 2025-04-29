package c9;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0080a extends RuntimeException {

        /* renamed from: j  reason: collision with root package name */
        public final String f3456j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f3457k;
    }

    /* loaded from: classes.dex */
    public interface b {
        Map<String, Object> a(String str);

        Boolean b(String str);

        Boolean c(String str, Long l10);

        Boolean e(String str, String str2);

        Boolean f(String str, List<String> list);

        Boolean g(String str, Boolean bool);

        Boolean h(String str, Double d10);

        Boolean remove(String str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C0080a) {
            C0080a c0080a = (C0080a) th;
            arrayList.add(c0080a.f3456j);
            arrayList.add(c0080a.getMessage());
            obj = c0080a.f3457k;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
