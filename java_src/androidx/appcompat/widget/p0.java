package androidx.appcompat.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
class p0 extends y.c implements View.OnClickListener {
    private boolean A;
    private int B;
    private ColorStateList C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;

    /* renamed from: u  reason: collision with root package name */
    private final SearchManager f1299u;

    /* renamed from: v  reason: collision with root package name */
    private final SearchView f1300v;

    /* renamed from: w  reason: collision with root package name */
    private final SearchableInfo f1301w;

    /* renamed from: x  reason: collision with root package name */
    private final Context f1302x;

    /* renamed from: y  reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1303y;

    /* renamed from: z  reason: collision with root package name */
    private final int f1304z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1305a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1306b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1307c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1308d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1309e;

        public a(View view) {
            this.f1305a = (TextView) view.findViewById(16908308);
            this.f1306b = (TextView) view.findViewById(16908309);
            this.f1307c = (ImageView) view.findViewById(16908295);
            this.f1308d = (ImageView) view.findViewById(16908296);
            this.f1309e = (ImageView) view.findViewById(f.f.edit_query);
        }
    }

    public p0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.A = false;
        this.B = 1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.f1299u = (SearchManager) this.f20282m.getSystemService("search");
        this.f1300v = searchView;
        this.f1301w = searchableInfo;
        this.f1304z = searchView.getSuggestionCommitIconResId();
        this.f1302x = context;
        this.f1303y = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1303y.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.f1303y.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.C == null) {
            TypedValue typedValue = new TypedValue();
            this.f20282m.getTheme().resolveAttribute(f.a.textColorSearchUrl, typedValue, true);
            this.C = this.f20282m.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.C, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        String nameNotFoundException;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f20282m.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e10) {
            nameNotFoundException = e10.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable == null) {
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        }
        return drawable;
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1303y.containsKey(flattenToShortString)) {
            Drawable m10 = m(componentName);
            this.f1303y.put(flattenToShortString, m10 != null ? m10.getConstantState() : null);
            return m10;
        }
        Drawable.ConstantState constantState = this.f1303y.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1302x.getResources());
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p(Cursor cursor) {
        Drawable n10 = n(this.f1301w.getSearchActivity());
        return n10 != null ? n10 : this.f20282m.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1302x.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException e10) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
            }
            return createFromStream;
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1302x.getPackageName() + "/" + parseInt;
            Drawable k10 = k(str2);
            if (k10 != null) {
                return k10;
            }
            Drawable d10 = androidx.core.content.a.d(this.f1302x, parseInt);
            A(str2, d10);
            return d10;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k11 = k(str);
            if (k11 != null) {
                return k11;
            }
            Drawable q10 = q(Uri.parse(str));
            A(str, q10);
            return q10;
        }
    }

    private Drawable t(Cursor cursor) {
        int i10 = this.G;
        if (i10 == -1) {
            return null;
        }
        Drawable s10 = s(cursor.getString(i10));
        return s10 != null ? s10 : p(cursor);
    }

    private Drawable u(Cursor cursor) {
        int i10 = this.H;
        if (i10 == -1) {
            return null;
        }
        return s(cursor.getString(i10));
    }

    private static String w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // y.a, y.b.a
    public void a(Cursor cursor) {
        if (this.A) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.D = cursor.getColumnIndex("suggest_text_1");
                this.E = cursor.getColumnIndex("suggest_text_2");
                this.F = cursor.getColumnIndex("suggest_text_2_url");
                this.G = cursor.getColumnIndex("suggest_icon_1");
                this.H = cursor.getColumnIndex("suggest_icon_2");
                this.I = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // y.a, y.b.a
    public CharSequence c(Cursor cursor) {
        String o10;
        String o11;
        if (cursor == null) {
            return null;
        }
        String o12 = o(cursor, "suggest_intent_query");
        if (o12 != null) {
            return o12;
        }
        if (!this.f1301w.shouldRewriteQueryFromData() || (o11 = o(cursor, "suggest_intent_data")) == null) {
            if (!this.f1301w.shouldRewriteQueryFromText() || (o10 = o(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return o10;
        }
        return o11;
    }

    @Override // y.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1300v.getVisibility() == 0 && this.f1300v.getWindowVisibility() == 0) {
            try {
                Cursor v10 = v(this.f1301w, charSequence2, 50);
                if (v10 != null) {
                    v10.getCount();
                    return v10;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // y.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.I;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1305a != null) {
            z(aVar.f1305a, w(cursor, this.D));
        }
        if (aVar.f1306b != null) {
            String w10 = w(cursor, this.F);
            CharSequence l10 = w10 != null ? l(w10) : w(cursor, this.E);
            if (TextUtils.isEmpty(l10)) {
                TextView textView = aVar.f1305a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1305a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1305a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1305a.setMaxLines(1);
                }
            }
            z(aVar.f1306b, l10);
        }
        ImageView imageView = aVar.f1307c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1308d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i12 = this.B;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1309e.setVisibility(8);
            return;
        }
        aVar.f1309e.setVisibility(0);
        aVar.f1309e.setTag(aVar.f1305a.getText());
        aVar.f1309e.setOnClickListener(this);
    }

    @Override // y.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View g10 = g(this.f20282m, this.f20281l, viewGroup);
            if (g10 != null) {
                ((a) g10.getTag()).f1305a.setText(e10.toString());
            }
            return g10;
        }
    }

    @Override // y.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View h10 = h(this.f20282m, this.f20281l, viewGroup);
            if (h10 != null) {
                ((a) h10.getTag()).f1305a.setText(e10.toString());
            }
            return h10;
        }
    }

    @Override // y.c, y.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h10 = super.h(context, cursor, viewGroup);
        h10.setTag(new a(h10));
        ((ImageView) h10.findViewById(f.f.edit_query)).setImageResource(this.f1304z);
        return h10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1300v.S((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f20282m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f20282m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i10) {
        this.B = i10;
    }
}
