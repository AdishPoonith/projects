package u0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import f1.l0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f18452a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final String f18453b = f.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<View> f18454c = new WeakReference<>(null);

    /* renamed from: d  reason: collision with root package name */
    private static Method f18455d;

    private f() {
    }

    public static final View a(View view) {
        if (k1.a.d(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f18452a.q(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                k1.a.b(th, f.class);
            }
        }
        return null;
    }

    public static final List<View> b(View view) {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                int i10 = 0;
                if (childCount > 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        arrayList.add(((ViewGroup) view).getChildAt(i10));
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    public static final int c(View view) {
        if (k1.a.d(f.class)) {
            return 0;
        }
        try {
            l.e(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            f fVar = f18452a;
            if (o(view)) {
                i10 |= 512;
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? i10 | 65536 : view instanceof RadioGroup ? i10 | 16384 : ((view instanceof ViewGroup) && fVar.p(view, f18454c.get())) ? i10 | 64 : i10;
                }
                return i10 | 4096;
            }
            int i11 = i10 | 1024 | 1;
            if (view instanceof Button) {
                i11 |= 4;
                if (view instanceof Switch) {
                    i11 |= 8192;
                } else if (view instanceof CheckBox) {
                    i11 |= 32768;
                }
            }
            return view instanceof EditText ? i11 | 2048 : i11;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            l.e(view, "view");
            if (l.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f18454c = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> b10 = b(view);
                int i10 = 0;
                int size = b10.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(d(b10.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e10) {
                Log.e(f18453b, "Failed to create JSONObject for view.", e10);
            }
            return jSONObject;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    private final JSONObject e(View view) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e10) {
                Log.e(f18453b, "Failed to create JSONObject for dimension.", e10);
            }
            return jSONObject;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final Class<?> f(String str) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        Field declaredField;
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        String str;
        Field declaredField;
        try {
            if (k1.a.d(f.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        return (View.OnTouchListener) obj2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                } catch (IllegalAccessException e10) {
                    e = e10;
                    l0 l0Var = l0.f8470a;
                    str = f18453b;
                    l0.d0(str, e);
                    return null;
                }
            } catch (ClassNotFoundException e11) {
                e = e11;
                l0 l0Var2 = l0.f8470a;
                str = f18453b;
                l0.d0(str, e);
                return null;
            } catch (NoSuchFieldException e12) {
                e = e12;
                l0 l0Var3 = l0.f8470a;
                str = f18453b;
                l0.d0(str, e);
                return null;
            }
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    public static final String i(View view) {
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String obj = hint.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        if (k1.a.d(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    public static final String k(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (k1.a.d(f.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i10 = 0;
                if (view instanceof DatePicker) {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    v vVar = v.f12860a;
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    l.d(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    l.d(currentMinute, "view.currentMinute");
                    int intValue2 = currentMinute.intValue();
                    v vVar2 = v.f12860a;
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i10);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            } else if (i11 >= childCount) {
                                break;
                            } else {
                                i10 = i11;
                            }
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
                l.d(valueOf, "java.lang.String.format(format, *args)");
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return null;
        }
    }

    private final View l(float[] fArr, View view) {
        String str;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = f18455d;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    Object invoke = method.invoke(null, fArr, view);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    View view2 = (View) invoke;
                    if (view2.getId() > 0) {
                        ViewParent parent = view2.getParent();
                        if (parent != null) {
                            return (View) parent;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } catch (IllegalAccessException e10) {
                    e = e10;
                    l0 l0Var = l0.f8470a;
                    str = f18453b;
                    l0.d0(str, e);
                    return null;
                } catch (InvocationTargetException e11) {
                    e = e11;
                    l0 l0Var2 = l0.f8470a;
                    str = f18453b;
                    l0.d0(str, e);
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final float[] m(View view) {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final void n() {
        String str;
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (f18455d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f18455d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e10) {
                e = e10;
                l0 l0Var = l0.f8470a;
                str = f18453b;
                l0.d0(str, e);
            } catch (NoSuchMethodException e11) {
                e = e11;
                l0 l0Var2 = l0.f8470a;
                str = f18453b;
                l0.d0(str, e);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private static final boolean o(View view) {
        if (k1.a.d(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            f fVar = f18452a;
            Class<?> f10 = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (f10 == null || !f10.isInstance(parent)) {
                Class<?> f11 = fVar.f("androidx.core.view.NestedScrollingChild");
                if (f11 != null) {
                    return f11.isInstance(parent);
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            k1.a.b(th, f.class);
            return false;
        }
    }

    private final boolean q(View view) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            return l.a(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            l.e(view, "view");
            Object obj = null;
            try {
                try {
                    field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        field2 = null;
                        if (field != null) {
                        }
                        view.setOnClickListener(onClickListener);
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                field = null;
            }
            if (field != null || field2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            field.setAccessible(true);
            field2.setAccessible(true);
            try {
                field.setAccessible(true);
                obj = field.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                field2.set(obj, onClickListener);
            }
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    public static final void s(View view, JSONObject json) {
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            l.e(view, "view");
            l.e(json, "json");
            try {
                f fVar = f18452a;
                String k10 = k(view);
                String i10 = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", c(view));
                json.put("id", view.getId());
                d dVar = d.f18448a;
                if (d.g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    l0 l0Var = l0.f8470a;
                    json.put("text", l0.k(l0.A0(k10), ""));
                }
                l0 l0Var2 = l0.f8470a;
                json.put("hint", l0.k(l0.A0(i10), ""));
                if (tag != null) {
                    json.put("tag", l0.k(l0.A0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", l0.k(l0.A0(contentDescription.toString()), ""));
                }
                json.put("dimension", fVar.e(view));
            } catch (JSONException e10) {
                l0 l0Var3 = l0.f8470a;
                l0.d0(f18453b, e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    public final boolean p(View view, View view2) {
        View l10;
        if (k1.a.d(this)) {
            return false;
        }
        try {
            l.e(view, "view");
            if (!l.a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (l10 = l(m(view), view2)) == null) {
                return false;
            }
            return l10.getId() == view.getId();
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }
}
