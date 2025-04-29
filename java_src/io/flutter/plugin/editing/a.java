package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f10353a;

    public a(FlutterJNI flutterJNI) {
        this.f10353a = flutterJNI;
    }

    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = length - 1;
        if (i10 >= i11) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i10);
        int charCount = Character.charCount(codePointAt);
        int i12 = i10 + charCount;
        int i13 = 0;
        if (i12 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i12) == 13) {
                charCount++;
            }
            return i10 + charCount;
        } else if (g(codePointAt)) {
            if (i12 >= i11 || !g(Character.codePointAt(charSequence, i12))) {
                return i12;
            }
            int i14 = i10;
            while (i14 > 0 && g(Character.codePointBefore(charSequence, i10))) {
                i14 -= Character.charCount(Character.codePointBefore(charSequence, i10));
                i13++;
            }
            if (i13 % 2 == 0) {
                charCount += 2;
            }
            return i10 + charCount;
        } else {
            if (f(codePointAt)) {
                charCount += Character.charCount(codePointAt);
            }
            if (codePointAt == 8419) {
                int codePointBefore = Character.codePointBefore(charSequence, i12);
                int charCount2 = i12 + Character.charCount(codePointBefore);
                if (charCount2 < length && i(codePointBefore)) {
                    int codePointAt2 = Character.codePointAt(charSequence, charCount2);
                    if (f(codePointAt2)) {
                        charCount += Character.charCount(codePointBefore) + Character.charCount(codePointAt2);
                    }
                } else if (f(codePointBefore)) {
                    charCount += Character.charCount(codePointBefore);
                }
                return i10 + charCount;
            }
            if (c(codePointAt)) {
                boolean z10 = false;
                int i15 = 0;
                do {
                    if (z10) {
                        charCount += Character.charCount(codePointAt) + i15 + 1;
                        z10 = false;
                    }
                    if (d(codePointAt)) {
                        break;
                    }
                    if (i12 < length) {
                        codePointAt = Character.codePointAt(charSequence, i12);
                        i12 += Character.charCount(codePointAt);
                        if (codePointAt != 8419) {
                            if (!d(codePointAt) && !i(codePointAt)) {
                                if (codePointAt == 8205) {
                                    codePointAt = Character.codePointAt(charSequence, i12);
                                    i12 += Character.charCount(codePointAt);
                                    if (i12 < length && i(codePointAt)) {
                                        codePointAt = Character.codePointAt(charSequence, i12);
                                        int charCount3 = Character.charCount(codePointAt);
                                        i12 += Character.charCount(codePointAt);
                                        i15 = charCount3;
                                        z10 = true;
                                        if (i12 < length || !z10) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        z10 = true;
                                    }
                                }
                            } else {
                                charCount += Character.charCount(codePointAt) + 0;
                                break;
                            }
                        } else {
                            int codePointBefore2 = Character.codePointBefore(charSequence, i12);
                            int charCount4 = i12 + Character.charCount(codePointBefore2);
                            if (charCount4 < length && i(codePointBefore2)) {
                                int codePointAt3 = Character.codePointAt(charSequence, charCount4);
                                if (f(codePointAt3)) {
                                    charCount += Character.charCount(codePointBefore2) + Character.charCount(codePointAt3);
                                }
                            } else if (f(codePointBefore2)) {
                                charCount += Character.charCount(codePointBefore2);
                            }
                            return i10 + charCount;
                        }
                    }
                    i15 = 0;
                    if (i12 < length) {
                        break;
                    }
                } while (c(codePointAt));
            }
            return i10 + charCount;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014c A[EDGE_INSN: B:100:0x014c->B:94:0x014c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.a.b(java.lang.CharSequence, int):int");
    }

    public boolean c(int i10) {
        return this.f10353a.isCodePointEmoji(i10);
    }

    public boolean d(int i10) {
        return this.f10353a.isCodePointEmojiModifier(i10);
    }

    public boolean e(int i10) {
        return this.f10353a.isCodePointEmojiModifierBase(i10);
    }

    public boolean f(int i10) {
        return (48 <= i10 && i10 <= 57) || i10 == 35 || i10 == 42;
    }

    public boolean g(int i10) {
        return this.f10353a.isCodePointRegionalIndicator(i10);
    }

    public boolean h(int i10) {
        return 917536 <= i10 && i10 <= 917630;
    }

    public boolean i(int i10) {
        return this.f10353a.isCodePointVariantSelector(i10);
    }
}
