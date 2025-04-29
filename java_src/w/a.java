package w;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.c;
/* loaded from: classes.dex */
public class a implements Spannable {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f19538m = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final Spannable f19539j;

    /* renamed from: k  reason: collision with root package name */
    private final C0280a f19540k;

    /* renamed from: l  reason: collision with root package name */
    private final PrecomputedText f19541l;

    /* renamed from: w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0280a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f19542a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f19543b;

        /* renamed from: c  reason: collision with root package name */
        private final int f19544c;

        /* renamed from: d  reason: collision with root package name */
        private final int f19545d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f19546e;

        /* renamed from: w.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0281a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f19547a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f19548b;

            /* renamed from: c  reason: collision with root package name */
            private int f19549c;

            /* renamed from: d  reason: collision with root package name */
            private int f19550d;

            public C0281a(TextPaint textPaint) {
                this.f19547a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f19549c = 1;
                    this.f19550d = 1;
                } else {
                    this.f19550d = 0;
                    this.f19549c = 0;
                }
                this.f19548b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public C0280a a() {
                return new C0280a(this.f19547a, this.f19548b, this.f19549c, this.f19550d);
            }

            public C0281a b(int i10) {
                this.f19549c = i10;
                return this;
            }

            public C0281a c(int i10) {
                this.f19550d = i10;
                return this;
            }

            public C0281a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f19548b = textDirectionHeuristic;
                return this;
            }
        }

        public C0280a(PrecomputedText.Params params) {
            this.f19542a = params.getTextPaint();
            this.f19543b = params.getTextDirection();
            this.f19544c = params.getBreakStrategy();
            this.f19545d = params.getHyphenationFrequency();
            this.f19546e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        C0280a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f19546e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f19542a = textPaint;
            this.f19543b = textDirectionHeuristic;
            this.f19544c = i10;
            this.f19545d = i11;
        }

        public boolean a(C0280a c0280a) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 < 23 || (this.f19544c == c0280a.b() && this.f19545d == c0280a.c())) && this.f19542a.getTextSize() == c0280a.e().getTextSize() && this.f19542a.getTextScaleX() == c0280a.e().getTextScaleX() && this.f19542a.getTextSkewX() == c0280a.e().getTextSkewX() && this.f19542a.getLetterSpacing() == c0280a.e().getLetterSpacing() && TextUtils.equals(this.f19542a.getFontFeatureSettings(), c0280a.e().getFontFeatureSettings()) && this.f19542a.getFlags() == c0280a.e().getFlags()) {
                if (i10 >= 24) {
                    if (!this.f19542a.getTextLocales().equals(c0280a.e().getTextLocales())) {
                        return false;
                    }
                } else if (!this.f19542a.getTextLocale().equals(c0280a.e().getTextLocale())) {
                    return false;
                }
                return this.f19542a.getTypeface() == null ? c0280a.e().getTypeface() == null : this.f19542a.getTypeface().equals(c0280a.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f19544c;
        }

        public int c() {
            return this.f19545d;
        }

        public TextDirectionHeuristic d() {
            return this.f19543b;
        }

        public TextPaint e() {
            return this.f19542a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0280a) {
                C0280a c0280a = (C0280a) obj;
                return a(c0280a) && this.f19543b == c0280a.d();
            }
            return false;
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? c.b(Float.valueOf(this.f19542a.getTextSize()), Float.valueOf(this.f19542a.getTextScaleX()), Float.valueOf(this.f19542a.getTextSkewX()), Float.valueOf(this.f19542a.getLetterSpacing()), Integer.valueOf(this.f19542a.getFlags()), this.f19542a.getTextLocales(), this.f19542a.getTypeface(), Boolean.valueOf(this.f19542a.isElegantTextHeight()), this.f19543b, Integer.valueOf(this.f19544c), Integer.valueOf(this.f19545d)) : c.b(Float.valueOf(this.f19542a.getTextSize()), Float.valueOf(this.f19542a.getTextScaleX()), Float.valueOf(this.f19542a.getTextSkewX()), Float.valueOf(this.f19542a.getLetterSpacing()), Integer.valueOf(this.f19542a.getFlags()), this.f19542a.getTextLocale(), this.f19542a.getTypeface(), Boolean.valueOf(this.f19542a.isElegantTextHeight()), this.f19543b, Integer.valueOf(this.f19544c), Integer.valueOf(this.f19545d));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f19542a.getTextSize());
            sb2.append(", textScaleX=" + this.f19542a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f19542a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f19542a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f19542a.isElegantTextHeight());
            if (i10 >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f19542a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f19542a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f19542a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f19542a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f19543b);
            sb2.append(", breakStrategy=" + this.f19544c);
            sb2.append(", hyphenationFrequency=" + this.f19545d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C0280a a() {
        return this.f19540k;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f19539j;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f19539j.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f19539j.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f19539j.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f19539j.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f19541l.getSpans(i10, i11, cls) : (T[]) this.f19539j.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f19539j.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f19539j.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f19541l.removeSpan(obj);
        } else {
            this.f19539j.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f19541l.setSpan(obj, i10, i11, i12);
        } else {
            this.f19539j.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f19539j.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f19539j.toString();
    }
}
