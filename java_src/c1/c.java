package c1;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t9.p;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3143a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final List<Class<? extends View>> f3144b;

    static {
        List<Class<? extends View>> g10;
        g10 = p.g(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);
        f3144b = g10;
    }

    private c() {
    }

    public static final List<View> a(View view) {
        if (k1.a.d(c.class)) {
            return null;
        }
        try {
            l.e(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : f3144b) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            u0.f fVar = u0.f.f18452a;
            for (View view2 : u0.f.b(view)) {
                arrayList.addAll(a(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            k1.a.b(th, c.class);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (k1.a.d(c.class)) {
            return null;
        }
        try {
            l.e(view, "view");
            l.e(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            u0.f fVar = u0.f.f18452a;
            for (View view2 : u0.f.b(view)) {
                jSONArray.put(b(view2, clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
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
            u0.f fVar = u0.f.f18452a;
            for (View view2 : u0.f.b(view)) {
                u0.f fVar2 = u0.f.f18452a;
                String k10 = u0.f.k(view2);
                if (k10.length() > 0) {
                    arrayList.add(k10);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (k1.a.d(c.class)) {
            return null;
        }
        try {
            l.e(hostView, "hostView");
            u0.f fVar = u0.f.f18452a;
            String k10 = u0.f.k(hostView);
            if (k10.length() > 0) {
                return k10;
            }
            String join = TextUtils.join(" ", f3143a.c(hostView));
            l.d(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            k1.a.b(th, c.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        if (k1.a.d(c.class)) {
            return;
        }
        try {
            l.e(view, "view");
            l.e(json, "json");
            try {
                u0.f fVar = u0.f.f18452a;
                String k10 = u0.f.k(view);
                String i10 = u0.f.i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", u0.f.c(view));
                boolean z10 = true;
                if (k10.length() > 0) {
                    json.put("text", k10);
                }
                if (i10.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    json.put("hint", i10);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            k1.a.b(th, c.class);
        }
    }
}
