package r0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import ka.q;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f16621a = new c();

    private c() {
    }

    public static final List<String> a(View view) {
        if (k1.a.d(c.class)) {
            return null;
        }
        try {
            l.e(view, "view");
            ArrayList arrayList = new ArrayList();
            u0.f fVar = u0.f.f18452a;
            ViewGroup j10 = u0.f.j(view);
            if (j10 != null) {
                for (View view2 : u0.f.b(j10)) {
                    if (view != view2) {
                        arrayList.addAll(f16621a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            k1.a.b(th, c.class);
            return null;
        }
    }

    public static final List<String> b(View view) {
        if (k1.a.d(c.class)) {
            return null;
        }
        try {
            l.e(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            u0.f fVar = u0.f.f18452a;
            arrayList.add(u0.f.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    l.d(resourceName, "resourceName");
                    Object[] array = new ka.f("/").c(resourceName, 0).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if ((str.length() > 0) && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    l.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            k1.a.b(th, c.class);
            return null;
        }
    }

    private final List<String> c(View view) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                u0.f fVar = u0.f.f18452a;
                for (View view2 : u0.f.b(view)) {
                    arrayList.addAll(c(view2));
                }
                return arrayList;
            }
            String obj = ((TextView) view).getText().toString();
            if ((obj.length() > 0) && obj.length() < 100) {
                String lowerCase = obj.toLowerCase();
                l.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final boolean d(String str, List<String> list) {
        boolean w10;
        if (k1.a.d(this)) {
            return false;
        }
        try {
            for (String str2 : list) {
                w10 = q.w(str, str2, false, 2, null);
                if (w10) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    public static final boolean e(List<String> indicators, List<String> keys) {
        if (k1.a.d(c.class)) {
            return false;
        }
        try {
            l.e(indicators, "indicators");
            l.e(keys, "keys");
            for (String str : indicators) {
                if (f16621a.d(str, keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            k1.a.b(th, c.class);
            return false;
        }
    }

    public static final boolean f(String text, String rule) {
        if (k1.a.d(c.class)) {
            return false;
        }
        try {
            l.e(text, "text");
            l.e(rule, "rule");
            return new ka.f(rule).a(text);
        } catch (Throwable th) {
            k1.a.b(th, c.class);
            return false;
        }
    }
}
