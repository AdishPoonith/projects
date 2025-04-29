.class final Lcom/google/android/gms/internal/firebase-auth-api/xg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

.field private static final b:Lcom/google/android/gms/internal/firebase-auth-api/ak;

.field private static final c:Lcom/google/android/gms/internal/firebase-auth-api/vj;

.field private static final d:Lcom/google/android/gms/internal/firebase-auth-api/ej;

.field private static final e:Lcom/google/android/gms/internal/firebase-auth-api/aj;

.field private static final f:Ljava/util/Map;

.field private static final g:Ljava/util/Map;

.field public static final synthetic h:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/nk;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesSivKey"

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/xk;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/xg;->a:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/sg;->a:Lcom/google/android/gms/internal/firebase-auth-api/sg;

    const-class v4, Lcom/google/android/gms/internal/firebase-auth-api/rg;

    invoke-static {v3, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ak;->a(Lcom/google/android/gms/internal/firebase-auth-api/xj;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/ak;

    move-result-object v3

    sput-object v3, Lcom/google/android/gms/internal/firebase-auth-api/xg;->b:Lcom/google/android/gms/internal/firebase-auth-api/ak;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/tg;->a:Lcom/google/android/gms/internal/firebase-auth-api/tg;

    invoke-static {v3, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/vj;->a(Lcom/google/android/gms/internal/firebase-auth-api/tj;Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/vj;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/xg;->c:Lcom/google/android/gms/internal/firebase-auth-api/vj;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ug;->a:Lcom/google/android/gms/internal/firebase-auth-api/ug;

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/jg;

    invoke-static {v1, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ej;->a(Lcom/google/android/gms/internal/firebase-auth-api/cj;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/ej;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/xg;->d:Lcom/google/android/gms/internal/firebase-auth-api/ej;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/wg;->a:Lcom/google/android/gms/internal/firebase-auth-api/wg;

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/aj;->b(Lcom/google/android/gms/internal/firebase-auth-api/yi;Lcom/google/android/gms/internal/firebase-auth-api/gv;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/aj;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xg;->e:Lcom/google/android/gms/internal/firebase-auth-api/aj;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/pg;->d:Lcom/google/android/gms/internal/firebase-auth-api/pg;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ct;->n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/pg;->b:Lcom/google/android/gms/internal/firebase-auth-api/pg;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/pg;->c:Lcom/google/android/gms/internal/firebase-auth-api/pg;

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/ct;->o:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xg;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/EnumMap;

    const-class v7, Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-direct {v0, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ct;->m:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xg;->g:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/mk;Lcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/jg;
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesSivKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->d()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hp;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/hp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hp;->C()I

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/og;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/og;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ng;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hp;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/og;->a(I)Lcom/google/android/gms/internal/firebase-auth-api/og;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->c()Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/xg;->g:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/pg;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/og;->b(Lcom/google/android/gms/internal/firebase-auth-api/pg;)Lcom/google/android/gms/internal/firebase-auth-api/og;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/og;->c()Lcom/google/android/gms/internal/firebase-auth-api/rg;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/hg;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/hg;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/gg;)V

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hg;->c(Lcom/google/android/gms/internal/firebase-auth-api/rg;)Lcom/google/android/gms/internal/firebase-auth-api/hg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hp;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hv;->b([BLcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/hv;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hg;->b(Lcom/google/android/gms/internal/firebase-auth-api/hv;)Lcom/google/android/gms/internal/firebase-auth-api/hg;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->e()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v3, p0}, Lcom/google/android/gms/internal/firebase-auth-api/hg;->a(Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/hg;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/hg;->d()Lcom/google/android/gms/internal/firebase-auth-api/jg;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/ct;->zza()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing AesSivKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to AesSivParameters.parseParameters"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lcom/google/android/gms/internal/firebase-auth-api/rj;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xg;->b:Lcom/google/android/gms/internal/firebase-auth-api/ak;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->f(Lcom/google/android/gms/internal/firebase-auth-api/ak;)V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xg;->c:Lcom/google/android/gms/internal/firebase-auth-api/vj;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->e(Lcom/google/android/gms/internal/firebase-auth-api/vj;)V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xg;->d:Lcom/google/android/gms/internal/firebase-auth-api/ej;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->d(Lcom/google/android/gms/internal/firebase-auth-api/ej;)V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xg;->e:Lcom/google/android/gms/internal/firebase-auth-api/aj;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/rj;->c(Lcom/google/android/gms/internal/firebase-auth-api/aj;)V

    return-void
.end method
