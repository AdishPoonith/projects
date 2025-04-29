.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/hc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/yi;


# static fields
.field public static final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/hc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/hc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hc;->a:Lcom/google/android/gms/internal/firebase-auth-api/hc;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/ok;Lcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/aa;
    .locals 10

    sget v0, Lcom/google/android/gms/internal/firebase-auth-api/ic;->f:I

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->d()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/vn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->C()I

    move-result v1

    if-nez v1, :cond_9

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zb;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/yb;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->G()Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->I()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->a(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->H()Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->I()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->c(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->G()Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->H()Lcom/google/android/gms/internal/firebase-auth-api/io;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/io;->C()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->d(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->H()Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->H()Lcom/google/android/gms/internal/firebase-auth-api/br;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/br;->C()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->e(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->H()Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->H()Lcom/google/android/gms/internal/firebase-auth-api/br;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/br;->H()I

    move-result v3

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/ct;->k:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    add-int/lit8 v4, v3, -0x2

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-eq v4, v5, :cond_1

    const/4 v9, 0x5

    if-ne v4, v9, :cond_0

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ac;->c:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/sq;->a(I)I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse HashType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ac;->f:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    goto :goto_0

    :cond_2
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ac;->d:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    goto :goto_0

    :cond_3
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ac;->e:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    goto :goto_0

    :cond_4
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ac;->b:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    :goto_0
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->b(Lcom/google/android/gms/internal/firebase-auth-api/ac;)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->c()Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eq v4, v8, :cond_8

    if-eq v4, v7, :cond_7

    if-eq v4, v6, :cond_6

    if-ne v4, v5, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/ct;->zza()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bc;->d:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    goto :goto_2

    :cond_7
    :goto_1
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bc;->c:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    goto :goto_2

    :cond_8
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/bc;->b:Lcom/google/android/gms/internal/firebase-auth-api/bc;

    :goto_2
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->f(Lcom/google/android/gms/internal/firebase-auth-api/bc;)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->g()Lcom/google/android/gms/internal/firebase-auth-api/dc;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/sb;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/sb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/rb;)V

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sb;->d(Lcom/google/android/gms/internal/firebase-auth-api/dc;)Lcom/google/android/gms/internal/firebase-auth-api/sb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->G()Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->I()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v1

    invoke-static {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/hv;->b([BLcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/hv;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sb;->a(Lcom/google/android/gms/internal/firebase-auth-api/hv;)Lcom/google/android/gms/internal/firebase-auth-api/sb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->H()Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->I()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/hv;->b([BLcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/hv;

    move-result-object p2

    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/sb;->b(Lcom/google/android/gms/internal/firebase-auth-api/hv;)Lcom/google/android/gms/internal/firebase-auth-api/sb;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mk;->e()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/sb;->c(Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/sb;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/sb;->e()Lcom/google/android/gms/internal/firebase-auth-api/ub;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Only version 0 keys are accepted"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Parsing AesCtrHmacAeadKey failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
