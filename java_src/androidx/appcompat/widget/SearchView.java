package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchView extends h0 implements k.c {

    /* renamed from: z0  reason: collision with root package name */
    static final k f1022z0 = new k();
    private final View A;
    private final View B;
    final ImageView C;
    final ImageView D;
    final ImageView E;
    final ImageView F;
    private final View G;
    private p H;
    private Rect I;
    private Rect J;
    private int[] K;
    private int[] L;
    private final ImageView M;
    private final Drawable N;
    private final int O;
    private final int P;
    private final Intent Q;
    private final Intent R;
    private final CharSequence S;
    private m T;
    private l U;
    View.OnFocusChangeListener V;
    private n W;

    /* renamed from: a0  reason: collision with root package name */
    private View.OnClickListener f1023a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f1024b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f1025c0;

    /* renamed from: d0  reason: collision with root package name */
    y.a f1026d0;

    /* renamed from: e0  reason: collision with root package name */
    private boolean f1027e0;

    /* renamed from: f0  reason: collision with root package name */
    private CharSequence f1028f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f1029g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f1030h0;

    /* renamed from: i0  reason: collision with root package name */
    private int f1031i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f1032j0;

    /* renamed from: k0  reason: collision with root package name */
    private CharSequence f1033k0;

    /* renamed from: l0  reason: collision with root package name */
    private CharSequence f1034l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f1035m0;

    /* renamed from: n0  reason: collision with root package name */
    private int f1036n0;

    /* renamed from: o0  reason: collision with root package name */
    SearchableInfo f1037o0;

    /* renamed from: p0  reason: collision with root package name */
    private Bundle f1038p0;

    /* renamed from: q0  reason: collision with root package name */
    private final Runnable f1039q0;

    /* renamed from: r0  reason: collision with root package name */
    private Runnable f1040r0;

    /* renamed from: s0  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1041s0;

    /* renamed from: t0  reason: collision with root package name */
    private final View.OnClickListener f1042t0;

    /* renamed from: u0  reason: collision with root package name */
    View.OnKeyListener f1043u0;

    /* renamed from: v0  reason: collision with root package name */
    private final TextView.OnEditorActionListener f1044v0;

    /* renamed from: w0  reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1045w0;

    /* renamed from: x0  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1046x0;

    /* renamed from: y  reason: collision with root package name */
    final SearchAutoComplete f1047y;

    /* renamed from: y0  reason: collision with root package name */
    private TextWatcher f1048y0;

    /* renamed from: z  reason: collision with root package name */
    private final View f1049z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: m  reason: collision with root package name */
        private int f1050m;

        /* renamed from: n  reason: collision with root package name */
        private SearchView f1051n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f1052o;

        /* renamed from: p  reason: collision with root package name */
        final Runnable f1053p;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, f.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1053p = new a();
            this.f1050m = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 < 960 || i11 < 720 || configuration.orientation != 2) {
                if (i10 < 600) {
                    return (i10 < 640 || i11 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void b() {
            if (this.f1052o) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1052o = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1050m <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1052o) {
                removeCallbacks(this.f1053p);
                post(this.f1053p);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f1051n.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1051n.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1051n.hasFocus() && getVisibility() == 0) {
                this.f1052o = true;
                if (SearchView.K(getContext())) {
                    SearchView.f1022z0.c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1052o = false;
                removeCallbacks(this.f1053p);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f1052o = true;
            } else {
                this.f1052o = false;
                removeCallbacks(this.f1053p);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1051n = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1050m = i10;
        }
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.a aVar = SearchView.this.f1026d0;
            if (aVar instanceof p0) {
                aVar.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.V;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.C) {
                searchView.T();
            } else if (view == searchView.E) {
                searchView.P();
            } else if (view == searchView.D) {
                searchView.U();
            } else if (view == searchView.F) {
                searchView.Y();
            } else if (view == searchView.f1047y) {
                searchView.F();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1037o0 == null) {
                return false;
            }
            if (!searchView.f1047y.isPopupShowing() || SearchView.this.f1047y.getListSelection() == -1) {
                if (!SearchView.this.f1047y.a() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i10 == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.N(0, null, searchView2.f1047y.getText().toString());
                    return true;
                }
                return false;
            }
            return SearchView.this.V(view, i10, keyEvent);
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private Method f1065a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1066b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1067c;

        k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1065a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1066b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1067c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1066b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1065a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView, boolean z10) {
            Method method = this.f1067c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z10));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface n {
        boolean a(int i10);

        boolean b(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o extends z.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: l  reason: collision with root package name */
        boolean f1068l;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public o[] newArray(int i10) {
                return new o[i10];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1068l = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1068l + "}";
        }

        @Override // z.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1068l));
        }
    }

    /* loaded from: classes.dex */
    private static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        private final View f1069a;

        /* renamed from: b  reason: collision with root package name */
        private final Rect f1070b;

        /* renamed from: c  reason: collision with root package name */
        private final Rect f1071c;

        /* renamed from: d  reason: collision with root package name */
        private final Rect f1072d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1073e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1074f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1073e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1070b = new Rect();
            this.f1072d = new Rect();
            this.f1071c = new Rect();
            a(rect, rect2);
            this.f1069a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1070b.set(rect);
            this.f1072d.set(rect);
            Rect rect3 = this.f1072d;
            int i10 = this.f1073e;
            rect3.inset(-i10, -i10);
            this.f1071c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            int i10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1074f;
                    if (z11 && !this.f1072d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1074f;
                        this.f1074f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1070b.contains(x10, y10)) {
                    this.f1074f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (z12) {
                if (!z10 || this.f1071c.contains(x10, y10)) {
                    Rect rect = this.f1071c;
                    f10 = x10 - rect.left;
                    i10 = y10 - rect.top;
                } else {
                    f10 = this.f1069a.getWidth() / 2;
                    i10 = this.f1069a.getHeight() / 2;
                }
                motionEvent.setLocation(f10, i10);
                return this.f1069a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = new Rect();
        this.J = new Rect();
        this.K = new int[2];
        this.L = new int[2];
        this.f1039q0 = new b();
        this.f1040r0 = new c();
        this.f1041s0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1042t0 = fVar;
        this.f1043u0 = new g();
        h hVar = new h();
        this.f1044v0 = hVar;
        i iVar = new i();
        this.f1045w0 = iVar;
        j jVar = new j();
        this.f1046x0 = jVar;
        this.f1048y0 = new a();
        v0 t10 = v0.t(context, attributeSet, f.j.f8274i2, i10, 0);
        LayoutInflater.from(context).inflate(t10.m(f.j.f8324s2, f.g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(f.f.search_src_text);
        this.f1047y = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1049z = findViewById(f.f.search_edit_frame);
        View findViewById = findViewById(f.f.search_plate);
        this.A = findViewById;
        View findViewById2 = findViewById(f.f.submit_area);
        this.B = findViewById2;
        ImageView imageView = (ImageView) findViewById(f.f.search_button);
        this.C = imageView;
        ImageView imageView2 = (ImageView) findViewById(f.f.search_go_btn);
        this.D = imageView2;
        ImageView imageView3 = (ImageView) findViewById(f.f.search_close_btn);
        this.E = imageView3;
        ImageView imageView4 = (ImageView) findViewById(f.f.search_voice_btn);
        this.F = imageView4;
        ImageView imageView5 = (ImageView) findViewById(f.f.search_mag_icon);
        this.M = imageView5;
        androidx.core.view.t.F(findViewById, t10.f(f.j.f8329t2));
        androidx.core.view.t.F(findViewById2, t10.f(f.j.f8349x2));
        int i11 = f.j.f8344w2;
        imageView.setImageDrawable(t10.f(i11));
        imageView2.setImageDrawable(t10.f(f.j.f8314q2));
        imageView3.setImageDrawable(t10.f(f.j.f8299n2));
        imageView4.setImageDrawable(t10.f(f.j.f8359z2));
        imageView5.setImageDrawable(t10.f(i11));
        this.N = t10.f(f.j.f8339v2);
        x0.a(imageView, getResources().getString(f.h.abc_searchview_description_search));
        this.O = t10.m(f.j.f8354y2, f.g.abc_search_dropdown_item_icons_2line);
        this.P = t10.m(f.j.f8304o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1048y0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1043u0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(t10.a(f.j.f8319r2, true));
        int e10 = t10.e(f.j.f8284k2, -1);
        if (e10 != -1) {
            setMaxWidth(e10);
        }
        this.S = t10.o(f.j.f8309p2);
        this.f1028f0 = t10.o(f.j.f8334u2);
        int j10 = t10.j(f.j.f8294m2, -1);
        if (j10 != -1) {
            setImeOptions(j10);
        }
        int j11 = t10.j(f.j.f8289l2, -1);
        if (j11 != -1) {
            setInputType(j11);
        }
        setFocusable(t10.a(f.j.f8279j2, true));
        t10.u();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.Q = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.R = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.G = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.f1024b0);
        e0();
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1034l0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1038p0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1037o0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i10, String str) {
        int i11;
        String o10;
        try {
            String o11 = p0.o(cursor, "suggest_intent_action");
            if (o11 == null) {
                o11 = this.f1037o0.getSuggestIntentAction();
            }
            if (o11 == null) {
                o11 = "android.intent.action.SEARCH";
            }
            String str2 = o11;
            String o12 = p0.o(cursor, "suggest_intent_data");
            if (o12 == null) {
                o12 = this.f1037o0.getSuggestIntentData();
            }
            if (o12 != null && (o10 = p0.o(cursor, "suggest_intent_data_id")) != null) {
                o12 = o12 + "/" + Uri.encode(o10);
            }
            return A(str2, o12 == null ? null : Uri.parse(o12), p0.o(cursor, "suggest_intent_extra_data"), p0.o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1038p0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.f1047y.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.K);
        getLocationInWindow(this.L);
        int[] iArr = this.K;
        int i10 = iArr[1];
        int[] iArr2 = this.L;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.f1024b0 || this.N == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1047y.getTextSize() * 1.25d);
        this.N.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.N), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        SearchableInfo searchableInfo = this.f1037o0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1037o0.getVoiceSearchLaunchWebSearch()) {
            intent = this.Q;
        } else if (this.f1037o0.getVoiceSearchLaunchRecognizer()) {
            intent = this.R;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.f1027e0 || this.f1032j0) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean O(int i10, int i11, String str) {
        Cursor b10 = this.f1026d0.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        M(B(b10, i11, str));
        return true;
    }

    private void Z() {
        post(this.f1039q0);
    }

    private void a0(int i10) {
        CharSequence c10;
        Editable text = this.f1047y.getText();
        Cursor b10 = this.f1026d0.b();
        if (b10 == null) {
            return;
        }
        if (!b10.moveToPosition(i10) || (c10 = this.f1026d0.c(b10)) == null) {
            setQuery(text);
        } else {
            setQuery(c10);
        }
    }

    private void c0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1047y.getText());
        if (!z11 && (!this.f1024b0 || this.f1035m0)) {
            z10 = false;
        }
        this.E.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.E.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1047y;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.f1047y.setThreshold(this.f1037o0.getSuggestThreshold());
        this.f1047y.setImeOptions(this.f1037o0.getImeOptions());
        int inputType = this.f1037o0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1037o0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1047y.setInputType(inputType);
        y.a aVar = this.f1026d0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f1037o0.getSuggestAuthority() != null) {
            p0 p0Var = new p0(getContext(), this, this.f1037o0, this.f1041s0);
            this.f1026d0 = p0Var;
            this.f1047y.setAdapter(p0Var);
            ((p0) this.f1026d0).x(this.f1029g0 ? 2 : 1);
        }
    }

    private void g0() {
        this.B.setVisibility((L() && (this.D.getVisibility() == 0 || this.F.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(f.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(f.d.abc_search_view_preferred_width);
    }

    private void h0(boolean z10) {
        this.D.setVisibility((this.f1027e0 && L() && hasFocus() && (z10 || !this.f1032j0)) ? 0 : 8);
    }

    private void i0(boolean z10) {
        this.f1025c0 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1047y.getText());
        this.C.setVisibility(i11);
        h0(z11);
        this.f1049z.setVisibility(z10 ? 8 : 0);
        this.M.setVisibility((this.M.getDrawable() == null || this.f1024b0) ? 8 : 8);
        c0();
        j0(!z11);
        g0();
    }

    private void j0(boolean z10) {
        int i10 = 8;
        if (this.f1032j0 && !J() && z10) {
            this.D.setVisibility(8);
            i10 = 0;
        }
        this.F.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1047y.setText(charSequence);
        this.f1047y.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1047y.refreshAutoCompleteResults();
            return;
        }
        k kVar = f1022z0;
        kVar.b(this.f1047y);
        kVar.a(this.f1047y);
    }

    public boolean J() {
        return this.f1025c0;
    }

    void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.f1047y.getText())) {
            this.f1047y.setText("");
            this.f1047y.requestFocus();
            this.f1047y.setImeVisibility(true);
        } else if (this.f1024b0) {
            l lVar = this.U;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    boolean Q(int i10, int i11, String str) {
        n nVar = this.W;
        if (nVar == null || !nVar.b(i10)) {
            O(i10, 0, null);
            this.f1047y.setImeVisibility(false);
            E();
            return true;
        }
        return false;
    }

    boolean R(int i10) {
        n nVar = this.W;
        if (nVar == null || !nVar.a(i10)) {
            a0(i10);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.f1047y.requestFocus();
        this.f1047y.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1023a0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.f1047y.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.T;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f1037o0 != null) {
                N(0, null, text.toString());
            }
            this.f1047y.setImeVisibility(false);
            E();
        }
    }

    boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f1037o0 != null && this.f1026d0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f1047y.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1047y.setSelection(i10 == 21 ? 0 : this.f1047y.length());
                this.f1047y.setListSelection(0);
                this.f1047y.clearListSelection();
                f1022z0.c(this.f1047y, true);
                return true;
            } else if (i10 == 19) {
                this.f1047y.getListSelection();
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.f1047y.getText();
        this.f1034l0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        h0(z10);
        j0(!z10);
        c0();
        g0();
        if (this.T != null && !TextUtils.equals(charSequence, this.f1033k0)) {
            this.T.a(charSequence.toString());
        }
        this.f1033k0 = charSequence.toString();
    }

    void X() {
        i0(J());
        Z();
        if (this.f1047y.hasFocus()) {
            F();
        }
    }

    void Y() {
        Intent C;
        SearchableInfo searchableInfo = this.f1037o0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                C = D(this.Q, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                C = C(this.R, searchableInfo);
            }
            getContext().startActivity(C);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f1047y.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1047y;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1034l0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // k.c
    public void c() {
        if (this.f1035m0) {
            return;
        }
        this.f1035m0 = true;
        int imeOptions = this.f1047y.getImeOptions();
        this.f1036n0 = imeOptions;
        this.f1047y.setImeOptions(imeOptions | 33554432);
        this.f1047y.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1030h0 = true;
        super.clearFocus();
        this.f1047y.clearFocus();
        this.f1047y.setImeVisibility(false);
        this.f1030h0 = false;
    }

    @Override // k.c
    public void d() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f1047y.setImeOptions(this.f1036n0);
        this.f1035m0 = false;
    }

    void d0() {
        int[] iArr = this.f1047y.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.A.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.B.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1047y.getImeOptions();
    }

    public int getInputType() {
        return this.f1047y.getInputType();
    }

    public int getMaxWidth() {
        return this.f1031i0;
    }

    public CharSequence getQuery() {
        return this.f1047y.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1028f0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1037o0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.S : getContext().getText(this.f1037o0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.O;
    }

    public y.a getSuggestionsAdapter() {
        return this.f1026d0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1039q0);
        post(this.f1040r0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.h0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f1047y, this.I);
            Rect rect = this.J;
            Rect rect2 = this.I;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.H;
            if (pVar != null) {
                pVar.a(this.J, this.I);
                return;
            }
            p pVar2 = new p(this.J, this.I, this.f1047y);
            this.H = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.h0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.J()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f1031i0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f1031i0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f1031i0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        i0(oVar.f1068l);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f1068l = J();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (!this.f1030h0 && isFocusable()) {
            if (J()) {
                return super.requestFocus(i10, rect);
            }
            boolean requestFocus = this.f1047y.requestFocus(i10, rect);
            if (requestFocus) {
                i0(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1038p0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1024b0 == z10) {
            return;
        }
        this.f1024b0 = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f1047y.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1047y.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1031i0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.U = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.V = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.T = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1023a0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.W = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1028f0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f1029g0 = z10;
        y.a aVar = this.f1026d0;
        if (aVar instanceof p0) {
            ((p0) aVar).x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1037o0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean I = I();
        this.f1032j0 = I;
        if (I) {
            this.f1047y.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1027e0 = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(y.a aVar) {
        this.f1026d0 = aVar;
        this.f1047y.setAdapter(aVar);
    }

    void z() {
        if (this.G.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.A.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = b1.b(this);
            int dimensionPixelSize = this.f1024b0 ? resources.getDimensionPixelSize(f.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(f.d.abc_dropdownitem_text_padding_left) : 0;
            this.f1047y.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.f1047y.setDropDownHorizontalOffset(b10 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.f1047y.setDropDownWidth((((this.G.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
